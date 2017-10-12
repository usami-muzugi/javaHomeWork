package wiki.conoha.javahomework.set.homework2061;

import java.util.List;
import java.util.ArrayList;
public class EmployeeTest {
    public static void main(String[] args) {
        //定义ArrayList对象
        List list = new ArrayList();
        //创建三个Employee类的对象
        Employee obj = new Employee(001,"张三",5000D);
        Employee obj1 = new Employee(001,"李四",5500D);
        Employee obj2 = new Employee(001,"赵牛",4000D);

        //添加员工信息到ArrayList中
        list.add(obj);
        list.add(obj1);
        list.add(obj2);
        //显示员工的姓名和薪资
        System.out.println("员工姓名    员工薪资");
        for (int i = 0; i <list.size(); i++) {
            System.out.println(((Employee)list.get(i)).getName()+"        "+((Employee)list.get(i)).getSalary());
        }
    }
}