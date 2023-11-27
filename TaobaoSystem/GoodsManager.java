package the_fifth_week.TaobaoSystem;

import java.util.Collection;
import java.util.List;

public interface GoodsManager {
//    添加商品
    public void add_goods();
//    删除商品
    public void del_goods();
//    更新方法，需要更新商品的所有内容
    public void update_goods();
//    查询方式：名称，价格，编号
//    按编号查
    public Goods findByNumber();
//    查询所有,不需要去重
    public Collection<Goods> findAll();
//    按商品名称查
    public List<Goods> findByName();
//    按照商品价格区间查
    public List<Goods> findByPrice();

}
