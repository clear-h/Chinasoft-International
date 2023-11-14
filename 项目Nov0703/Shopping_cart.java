package 项目Nov0703;
//加入购物车

//继承商品类，获取商品的有关信息
public class Shopping_cart extends Goods{
    public void cart() {
        System.out.println("商品:" + this.name);
        System.out.println("单价:" + this.price);
        System.out.println("数量:" + this.num);
        System.out.println("配送路线:" + this.Distribution_route);
//      产生一个订单
        Order order = new Order();
        order.make_order();
    }
}
