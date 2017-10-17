package wiki.conoha.javahomework.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {
        Goods goods1 = new Goods("s0001","手机",2000);
        Goods goods2 = new Goods("s0002","冰箱",5000);
        Goods goods3 = new Goods("s0003","电视机",3000);
        List<Goods> list = new ArrayList<Goods>();
        list.add(goods1);
        list.add(goods2);
        list.add(goods3);
        System.out.println("排序前的数据");
        for (Goods g:list
             ) {
            System.out.println(g);
        }
        Collections.sort(list);
        System.out.println("排序后的数据");
        for (Goods g:list
                ) {
            System.out.println(g);
        }

    }
}
