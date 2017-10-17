package wiki.conoha.javahomework.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class stringSort {
    public static void main(String[] args) {
        //对存放在string中的字符串进行排序
        List<String> list = new ArrayList<String>();
        list.add("orange");
        list.add("blue");
        list.add("yellow");
        list.add("gray");
        System.out.println("排序前");
        for (String s:list
             ) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("排序后");
        Collections.sort(list);
        for (String s:list
             ) {
            System.out.print(s+ " ");
        }
        /**
         * 排序前
         orange blue yellow gray
         排序后
         blue gray orange yellow
         */
    }
}
