package wiki.conoha.javahomework.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CatTest {
    public static void main(String[] args) {
        //定义一个宠物猫对象
        Cat huahua = new Cat("花花",12,"英国短毛猫");
        Cat fanfan = new Cat("凡凡",3,"中华田园猫");
        //将宠物猫对象放入HashSet对象当中
        Set<Cat> set = new HashSet<Cat>();
        set.add(huahua);
        set.add(fanfan);

        //显示宠物猫信息

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        set.add(new Cat("花花",12,"英国短毛猫"));
        System.out.println("*************");
        System.out.println("添加重复数据后的宠物猫信息");
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /**
         * 姓名='凡凡', 年龄=3, 品种='中华田园猫
         姓名='花花', 年龄=12, 品种='英国短毛猫
         *************
         添加重复数据后的宠物猫信息
         姓名='凡凡', 年龄=3, 品种='中华田园猫
         姓名='花花', 年龄=12, 品种='英国短毛猫
         姓名='花花', 年龄=12, 品种='英国短毛猫
         */
        //变化了！ WHY？

        //重写hashCode() & equals

        /**
         * 姓名='花花', 年龄=12, 品种='英国短毛猫
         姓名='凡凡', 年龄=3, 品种='中华田园猫
         *************
         添加重复数据后的宠物猫信息
         姓名='花花', 年龄=12, 品种='英国短毛猫
         姓名='凡凡', 年龄=3, 品种='中华田园猫
         */

        System.out.println("*******");
        System.out.println("重新插入一个新宠物猫");
        set.add(new Cat("花花二代",2,"英国短尾猫")); //匿名内部类
        System.out.println("输出宠物猫的信息");
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        //在集合中查找花花的信息，并输出

        System.out.println("************************");
        System.out.println("在集合中查找花花的信息，并输出");
        if (set.contains(huahua)) {
            System.out.println("花花找到啦！！");
        } else {
            System.out.println("花花不见啦！！");
        }

        //Q：如果是使用匿名内部类传入的对象，就没有对象名，这时，需要用对象的属性来查找对象的信息、
        boolean flag = false;
        Cat obj = null;
        iterator = set.iterator();
        while (iterator.hasNext()) {
            obj = (Cat) iterator.next();   //netx() return Object
            if (obj.getName().equals("花花")) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("花花找到啦！！！");
        } else {
            System.out.println("花花没找到！！！");
        }

        /**
         * ************************
         在集合中查找花花的信息，并输出
         花花找到啦！！
         花花没找到！！！
         */

        //删除花花二代的信息并输出   //移除单一元素
        for (Cat c :set
                ) {
            if ("花花二代".equals(c.getName())) {
                set.remove(c);
                break; //※集合在进行设计时，做了一个限制，在读取数据时，不允许对数据进行删除
            }
        }

        Set<Cat> set1 = new HashSet<Cat>();
        for (Cat c :set
                ) {
            if (c.getAge()>5) {
                // set.remove(c);
                //※集合在进行设计时，做了一个限制，在读取数据时，不允许对数据进行删除
                //这种同时删除多个元素的方法同样也会报错的 java.util.ConcurrentModificationException
                set1.add(c);
            }
        }
        set.removeAll(set1);  //所以，单一删除的话，可以用for+if判断，然后用break。
                              //对于多条元素需要删除的话，可以将多条需要删除的元素添加到一个新的集合中
                              //然后调用 set.removeAll(set1); 来删除多个元素

        System.out.println("删除花花二代后的数据");
        for (Cat cat : set) {
            System.out.println(cat);
        }

        System.out.println("************************");
        System.out.println("把所有都删除掉");
        flag = set.removeAll(set);
        if (flag == true) {
            System.out.println("猫都不见了哦！");
        } else {
            System.out.println("ねこまたくあるよ！");
        }

    }
}
