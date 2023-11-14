package 项目Nov0703;
//用户订单的页面

//继承商品类，找到商品的各种信息       产生订单方法，总价，支付
public class Order extends Goods{
//    定义用户购买全部同款商品的总价
    double total_price;
//    形成的具体的订单信息
//    随机的订单号，总价，支付
    public void make_order() {
//        订单号规定为8位数字
        long order_id = (int) (Math.random()*100000000 + 10000000);
        total_price = price * num;
//        总价为double类型，计算会出现细小误差，要进行格式化，只保留两位小数

//        产生一个支付对象,
        Pay pay = new Pay();
        pay.pay_order();
    }

}
