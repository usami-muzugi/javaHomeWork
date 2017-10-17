package wiki.conoha.javahomework.sort.homework2473;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee("emp001","张三",1800.0));
        list.add(new Employee("emp002","李四",2500.0));
        list.add(new Employee("emp003","王五",1600.0));
        System.out.println("排序前:");
        for (Employee e:list
             ) {
            System.out.println(e);
        }
        System.out.println("排序后");
        Collections.sort(list);
        for (Employee e:list
                ) {
            System.out.println(e);
        }
    }
}
