package wiki.conoha.javahomework.set.homework3546;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GoodsManage {
    private static Set<Goods> set;

    private GoodsManage() {

    }

    public static GoodsManage getInstance(){
        return new GoodsManage();
    }


    public static void importGoods(){
            set = new HashSet<Goods>();
            Goods goods = new Goods("goods001", "水杯", 56.0, "不锈钢水杯");
            Goods goods1 = new Goods("goods002", "饮水机", 299.0, "带净化功能的饮水机");
            Goods goods2 = new Goods("goods003", "笔记本电脑", 4999.0, "15寸笔记本电脑");
            Goods goods3 = new Goods("goods004", "手机", 2300.0, "andriod手机");
            GoodsManage.set.add(goods);
            GoodsManage.set.add(goods1);
            GoodsManage.set.add(goods2);
            GoodsManage.set.add(goods3);
    }

    public static void displayAllGoods() {
        Iterator<Goods> iterator = GoodsManage.set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    public static Set<Goods> getSet() {
        return set;
    }

    public static void setSet(Set<Goods> set) {
        GoodsManage.set = set;
    }
}
