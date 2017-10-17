package wiki.conoha.javahomework.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest {

    /**
     * 自定义的类进行排序，需要自定义一个排序方法类
     *         Collections.sort(list,new NameComparator());
     * @param args
     */
    public static void main(String[] args) {
        //按名字升序排序
        Cat huahua = new Cat("huahua",18,"英国短毛猫");
        Cat fanfan = new Cat("fanfan",22,"路本文");
        Cat maomao = new Cat("maomao",22,"路本文");
        List<Cat> list = new ArrayList<Cat>();
        list.add(huahua);
        list.add(fanfan);
        list.add(maomao);
        System.out.println("排序前的顺序");
        for (Cat cat:list
             ) {
            System.out.println(cat);
        }
        System.out.println("按名字进行升序排序");
        Collections.sort(list,new NameComparator());
        System.out.println("排序后，按名字排序后");
        for (Cat cat:list
                ) {
            System.out.println(cat);
        }
        System.out.println("按年龄进行降序排序");
        Collections.sort(list,new AgeComparator());
        for (Cat cat:list
                ) {
            System.out.println(cat);
        }
    }
}
