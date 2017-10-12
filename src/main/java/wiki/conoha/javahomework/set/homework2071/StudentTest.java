package wiki.conoha.javahomework.set.homework2071;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentTest {

    /**
     * 定义一个学生类，使用HashSet对学生类的对象进行管理：执行添加操作，然后解决重复数据的添加问题
     */
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new Student(3,"William",65F));
        set.add(new Student(1,"Tom",87F));
        set.add(new Student(2,"Lucy",95F));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println();
        System.out.println("添加一个重复对象");
        //添加一个重复对象
        set.add(new Student(2,"Lucy",95F));

        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println();
        System.out.println("重写hashCode()和equals()方法 后");

        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
