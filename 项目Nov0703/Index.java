package 项目Nov0703;
//首页中仅含有商品页面（这里假定首页就是用户页面）
//商品页面能够直接产生订单页面，能够产生购物车页面
//购物车页面能够产生订单页面
//订单页面产生支付页面

import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*******************");
        System.out.println("欢迎来到CoWe购物平台");
        System.out.println("***************v1.0");
        System.out.println("------------------");
//       生成各种商品
//        这里采用一个能够产生商品类的对象的方法给商品类的对象赋值，然后返回方法中的商品对象给主函数中的商品对象赋值
        Goods good1 = produce("伤寒论张仲景正版原著中医书籍大全白话彩图典藏版",9.8,"江苏南京至北京市昌平区",1);
        Goods good2 = produce("鬼谷子狼道墨菲定律断舍离说话技巧",178,"河北廊坊至北京市昌平区",1);
        Goods good3 = produce("红岩书正版",21.6,"河北廊坊至北京市昌平区",1);
        Goods good4 = produce("镜    花缘 李汝珍著 ",18.9,"天猫优仓天津1仓至北京市昌平区",1);
        Goods good5 = produce("读心术正版心理学书",8.8,"北京至北京市昌平区",1);
//        显示商品信息
        System.out.print("商品1:");
        good1.show_1();
        System.out.print("商品2:");
        good2.show_1();
        System.out.print("商品3:");
        good3.show_1();
        System.out.print("商品4:");
        good4.show_1();
        System.out.print("商品5:");
        good5.show_1();
//       选择商品详情页,未解决乱输入的bug
        System.out.println("选择商品:");
        int choose = input.nextInt();
        switch (choose){
            case 1:
                good1.show_2();
                break;
            case 2:
                good2.show_2();
                break;
            case 3:
                good3.show_2();
                break;
            case 4:
                good4.show_2();
                break;
            case 5:
                good5.show_2();
                break;
            default:
                break;
        }
    }
    public static Goods produce(String name, double price, String D_r, int quantity){
        Goods good = new Goods();
        good.name = name;
        good.price = price;
        good.Distribution_route = D_r;
        good.quantity = quantity;
        return good;
    }
}
