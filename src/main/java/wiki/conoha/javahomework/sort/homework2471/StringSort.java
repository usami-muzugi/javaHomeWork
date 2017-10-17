package wiki.conoha.javahomework.sort.homework2471;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSort {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("orange");
        list.add("tomato");
        list.add("apple");
        list.add("litchi");
        list.add("banana");
        System.out.println("排序前");
        for (String str:list
             ) {
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println("排序后");
        Collections.sort(list);
        for (String str:list
                ) {
            System.out.print(str + " ");
        }
    }
}
