package wiki.conoha.javahomework.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordDemo {
    public static void main(String[] args) {
        //将英文单词添加到HashSet当中

        //定义HashSet对象
        Set set = new HashSet();
        //向集合中添加元素

        set.add("Blue");
        set.add("Red");
        set.add("black");
        set.add("yellow");
        set.add("white");

        //显示集合的类容

        System.out.println("集合中的元素为:");
        //set.   //there are no get() method
        // 接口 Iterator 迭代器
        //将set导入到iterator
        Iterator iterator = set.iterator();
        //遍历迭代器并输出元素
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

        //在集合当中插入一个新的单词
        set.add("Green");

        iterator = set.iterator();
        System.out.println();
        System.out.println("**********************");
        System.out.println("在集合当中插入一个旧的单词");
        //在集合当中插入一个旧的单词
        set.add("Green");

        iterator = set.iterator();
        //遍历迭代器并输出元素
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        /**
         * 集合中的元素为:
         Red white Blue black yellow
         **********************
         在集合当中插入一个旧的单词
         Red white Blue black yellow Green
         Process finished with exit code 0
         */

        //所以，插入重复元素，系统并不报错，而是选择不插入该数据
        //插入失败，但是不会报错.
    }
}
