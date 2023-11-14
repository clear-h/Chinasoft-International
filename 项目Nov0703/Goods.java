package 项目Nov0703;

import java.util.Scanner;

public class Goods {
//    名称，价格，数量，配送路线，用户购买的数量（不显示，定义为全局有利于其他类的调用）
    String name;
    double price;
    int quantity;
    String Distribution_route;
    int num;
//    购买商品的方法
    public void buy(){
        System.out.println("您选择了购买此物品，请在支付页面完成支付");
//        生成Order类的一个对象
        Order order = new Order();
//    调用Order类中的方法
        order.make_order();
    }
//    加入购物车的方法
    public void addcart(){
//       生成Shopping_cart类的一个对象
        Shopping_cart cart = new Shopping_cart();
    }
//    显示在主页的大致信息
    public void show_1(){
        System.out.println(this.name);
        System.out.println(this.price);
        System.out.println(this.quantity);

    }
//    显示商品的详细信息
//    商品信息页面要有购买选项和加入购物车选项，还要有可选择的数量
    public void show_2(){
        System.out.println(this.name);
        System.out.println(this.price);
        System.out.println(this.quantity);
        System.out.println(this.Distribution_route);
//        用户购买商品时，输入购买数量
        Scanner input = new Scanner(System.in);
        while(true){
            try{
                System.out.println("请输入购买商品的数量：");
                num = input.nextInt();
                break;
            }catch (Exception e){
                System.out.println("您输入的数量有误，请重新输入");
            }
        }
//        添加购物车和直接购买选项
        System.out.println("----------------------------------");
        System.out.println("1-----立即购买");
        System.out.println("2-----加入购物车");
        System.out.println("请选择：");
        while (true){
            try{
                int choose = input.nextInt();
                switch (choose){
                    case 1:
//                        触发购买方法
                        this.buy();
                        break;
                    case 2:
//                        触发加入购物车的方法
                        this.addcart();
                        break;
                }
//                选择正确退出选择
            break;
            }catch (Exception e){
                System.out.println("选择错误，请重新选择。");
            }
        }
    }
}
