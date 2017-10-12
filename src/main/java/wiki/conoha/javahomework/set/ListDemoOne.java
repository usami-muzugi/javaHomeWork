package wiki.conoha.javahomework.set;

import java.util.ArrayList;
import java.util.List;

public class ListDemoOne {
    public static void main(String[] args) {
        //用ArrayList存储编程语言地名称，并输出
        List list = new ArrayList();
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("GO");
        list.add("Swift");
        //输出列表中元素的个数
        System.out.println("输出列表中元素的个数"+list.size());

        //遍历输出所有的语言

        System.out.println("******************");
        //list.size();获取list长度
        for (int i = 0; i <list.size(); i++) {
            System.out.print(list.get(i)+"，");
            //list.get(); index->下标位置
        }

        System.out.println("******************");
        System.out.println("移除C++后的列表元素");
        //移除列表中的C++

        list.remove(2); //use index

        for (int i = 0; i <list.size(); i++) {
            System.out.print(list.get(i)+"，");
            //list.get(); index->下标位置
        }

        list.remove("Swift"); // use Object

        System.out.println("******************");
        System.out.println("移除Swift后的列表元素");

        for (int i = 0; i <list.size(); i++) {
            System.out.print(list.get(i)+"，");
            //list.get(); index->下标位置
        }

    }
}
