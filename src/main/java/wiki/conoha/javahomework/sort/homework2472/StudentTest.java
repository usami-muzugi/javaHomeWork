package wiki.conoha.javahomework.sort.homework2472;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {

    //实现接口中的方法
    static class StudentNameCompatator implements Comparator<Student>{

        public int compare(Student o1, Student o2) {
            String name1 = o1.getName();
            String name2 = o2.getName();
            int operation = name1.compareTo(name2);
            return operation;
        }
    }

    public static void main(String[] args){
        //定义Student类的对象
        Student student_one = new Student(40,20,"peter");
        Student student_two = new Student(28,5,"angle");
        Student student_three = new Student(35,18,"tom");
        //将对象添加到List中
        List<Student> list = new ArrayList<Student>();
        list.add(student_one);
        list.add(student_two);
        list.add(student_three);

        //输出排序前的数据
        System.out.println("输出排序前的数据");
        for (Student s:list
             ) {
            System.out.println(s);
        }

        //排序
        Collections.sort(list,new StudentNameCompatator());

        //输出排序后的数据
        System.out.println("按名字排序后的数据");
        for (Student s:list
                ) {
            System.out.println(s);
        }
    }
}
