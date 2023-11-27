package the_fifth_week.TaobaoSystem;
//单次添加商品

import java.util.Collection;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        GoodsManagerImp goodsManager = new GoodsManagerImp();
        goodsManager.add_goods();
//       传回来的是goods的地址因为没有重写toString
        System.out.println(goodsManager.findAll());
        goodsManager.add_goods();
        System.out.println(goodsManager.findAll());
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要删除的商品编号");
        String number = scanner.next();
        goodsManager.del_goods();
        System.out.println(goodsManager.findAll());
        goodsManager.update_goods();
        System.out.println(goodsManager.findAll());
    }
}
