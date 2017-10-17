package wiki.conoha.javahomework.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class intSort {
    public static void main(String[] args) {
        //对存储在List中的整形数据进行排序
        List<Integer> list = new ArrayList<Integer>(); //不能直接List<int> 这么写，要用List<Integer>包装类
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(1);
        System.out.println("排序前的数据");
        for (int n:list
             ) {
            System.out.print(n+" ");
        }
        System.out.println();
        System.out.println("对ArrayList排序后的数据");
        Collections.sort(list);
        for (int n:list
                ) {
            System.out.print(n+" ");
        }
        //Collection.sort();都是按重小到大的来排序，升序
    }
}
