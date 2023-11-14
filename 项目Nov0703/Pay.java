package 项目Nov0703;
//支付页面

import java.util.Scanner;

//继承订单类，获取订单的相关信息      有账户余额，账户名称，支付过程
public class Pay extends Order {
    String username = "CoWe";
    double account_balance = 100;
    //支付过程
    Scanner input = new Scanner(System.in);

    public void pay_order() {
        if (this.account_balance >= total_price) {
//            是否购买，输入正确，退出循环，判断是或者否，是就产生购买结果，否退出订单
            System.out.println("确认购买？请输入“Y”或者“N”。");
//                    输入的值必须为Y或者N
            String item = input.next();
            switch (item){
                case "Y":
                    this.account_balance -=this.total_price;
                    System.out.println("购买成功");
                    System.out.println(name + " " + total_price + " " + this.account_balance + " " + this.Distribution_route);
                    break;
                case "N":
                    break;
            }
        }else {
            System.out.println("余额不足，请及时充值");
        }
    }
}
