package the_fifth_week.TaobaoSystem;

import java.sql.Struct;
import java.util.*;

public class GoodsManagerImp implements GoodsManager{
//设置一个总管家，HashMap，私有化，Map类型需要键
    private Map<String, Goods> goods_list = new HashMap<String, Goods>();
    private int size = 0;

    @Override
    public void add_goods() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品名称");
        String name = scanner.next();
        System.out.println("请输入商品价格");
//        初始化商品价格
        double price = 9999;
        try {
            price = scanner.nextDouble();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("请输入商家");
        String seller = scanner.next();
        System.out.println("请输入商品类别");
        String type = scanner.next();
//        UUID一串随机序列，添加一个索引值size,StringBuilder
        String number = UUID.randomUUID().toString().concat(size + "");
        Goods goods = new Goods(number, name, price, seller, type);
//        放在HashMap中去重
        System.out.println(goods.getName());
        goods_list.put(number, goods);
        size++;
    }

    @Override
    public void del_goods() {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        goods_list.remove(number);
    }

    @Override
    public void update_goods() {
//        修改商品，其商品编号不变
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入修改的商品编号");
        String number = scanner.next();
        System.out.println("商品原来的内容");
        Goods goods = goods_list.get(number);
        System.out.println("请输入修改后的名称");
        String name = scanner.next();
        System.out.println("商品原来的价格");
        System.out.println(goods.getPrice());
        System.out.println("请输入修改后的价格");
        double price = goods.getPrice();
        try {
            price = scanner.nextDouble();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("商品原来的店铺名称");
        System.out.println(goods.getSeller());
        System.out.println("请输入修改后的店铺名称");
        String seller = scanner.next();
        System.out.println("商品原来的商品类别");
        System.out.println(goods.getType());
        System.out.println("商品修改后的类别");
        String type = scanner.next();
        goods = new Goods(goods.getNumber(), name, price, seller, type);
        goods_list.put(goods.getNumber(),goods);
    }

    @Override
    public Collection<Goods> findAll() {
        System.out.println("测试");
        return goods_list.values();
    }

    @Override
    public Goods findByNumber() {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        return goods_list.get(number);
    }

    @Override
    public List<Goods> findByName() {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    List<Goods> myresult = new ArrayList<>();
//    ****************
    Collection<Goods> mygoods = goods_list.values();
    Iterator<Goods> iterator = mygoods.iterator();
    while(iterator.hasNext()) {
        Goods goods = iterator.next();
        if (goods.getName().indexOf(name) > -1){
            myresult.add(goods);
        }
    }
    return myresult;
    }

    @Override
    public List<Goods> findByPrice () {
        Scanner scanner = new Scanner(System.in);
        double start = scanner.nextDouble();
        double end = scanner.nextDouble();
//        构造一个商品列表
        List<Goods> myresult = new ArrayList<>();
        Collection<Goods> mygoods = goods_list.values();
//        利用迭代器去实现
        Iterator<Goods> iterator = mygoods.iterator();
        while (iterator.hasNext()){
            Goods goods = iterator.next();
            if (goods.getPrice() >= start && goods.getPrice() <= end){
                myresult.add(goods);
            }
        }
        return myresult;
    }
}
