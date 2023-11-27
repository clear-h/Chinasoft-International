package the_fifth_week.TaobaoSystem;

public class Goods {
    //    商品编号
    private String number;
    private String name;
    private double price;
    //    商家名称
    private String seller;
    //    商品类型
    private String type;

    public Goods() {}

    public Goods(String number, String name, double price, String seller, String type) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.seller = seller;
        this.type = type;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) { this.number = number; }

    public String getName() {
        return this.name;
    }

    public void setName(String name) { this.name = name; }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) { this.price = price; }

    public String getSeller() {
        return this.seller;
    }

    public void setSeller(String seller) { this.seller = seller; }

    public String getType() {
        return this.type;
    }

    public void setType(String type) { this.type = type; }

//    重写String方法，不然返回到是Goods类对象的地址

    @Override
    public String toString() {
        return "Goods{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", seller='" + seller + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
