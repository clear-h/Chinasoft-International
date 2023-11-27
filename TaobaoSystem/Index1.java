package the_fifth_week.TaobaoSystem;

import java.util.Scanner;

public class Index1 {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("     商品的后台管理系统");
        System.out.println("          版本号v.1.1");
        System.out.println("            作者：CCC");
        System.out.println("--------------------");
        Scanner scanner = new Scanner(System.in);
        char functionChoose = '0';
//       接口的实现类实例化
        GoodsManagerImp goodsManagerImp = new GoodsManagerImp();
//        商家进行增删改查
        while (true) {
            System.out.println("-------------------");
            System.out.println("1.添加商品");
            System.out.println("2.按商品号删除商品");
            System.out.println("3.修改商品");
            System.out.println("4.查看所有商品");
            System.out.println("5.按商品号查询商品");
            System.out.println("6.按名称查询商品");
            System.out.println("7.按价格查询商品");
            System.out.println("8.退出");
            System.out.println("-------------------");
            System.out.println("请选择功能编号");
//           输入设备不能直接接收char字符数据
            String tempChoose = scanner.next();
            System.out.print("您选择的功能编号为：");
            functionChoose = tempChoose.toCharArray()[0];
//          Byte型无法强转char型
//            try {
//                functionChoose = (char) scanner.nextByte();
//             } catch (Exception e) {
//                System.out.println("您选择的功能编号不正确，请重新选择");
//            }
            if (functionChoose == '8') {
                System.out.println("8.退出");
                break;
            }
            switch (functionChoose) {
                case '1':
                    System.out.println("1.添加商品");
                    goodsManagerImp.add_goods();
                    continue;
                case '2':
                    System.out.println("2.按商品号删除商品");
                    goodsManagerImp.del_goods();
                    continue;
                case '3':
                    System.out.println("3.修改商品");
                    goodsManagerImp.update_goods();
                    continue;
                case '4':
                    System.out.println("4.查看所有商品");
                    System.out.println(goodsManagerImp.findAll());
                    continue;
                case '5':
                    System.out.println("5.按商品号查询商品");
                    System.out.println(goodsManagerImp.findByNumber());
                    continue;
                case '6':
                    System.out.println("6.按名称查询商品");
                    System.out.println(goodsManagerImp.findByName());
                    continue;
                case '7':
                    System.out.println("7.按价格查询商品");
                    System.out.println(goodsManagerImp.findByPrice());
                    continue;
                default:
                    System.out.println("Unknown Error");
                    break;
            }

        }
    }
}
