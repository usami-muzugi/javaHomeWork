package wiki.conoha.javahomework.homework2475;

import java.util.ArrayList;
import java.util.List;
/**
 * 任务
 完成如下任务：
 定义一个抽象类Animal，包括名字属性、getter和setter方法、抽象方法，用该抽象方法模拟小动物做游戏。
 定义两个类Dog、Cat分别继承自抽象类Animal，并实现抽象方法，方法体中按运行效果输出一句话即可。
 定义AnimalPlay类，在该类中定义一个方法，参数是List集合，主要功能是可以对任何Animal子类的集合进行处理，循环调用集合中动物的做游戏方法。
 定义测试类，在测试类中分别定义两个Dog和Cat类的对象，并添加到对应的集合中，然后调用AnimalPlay类中的方法，得到如运行结果所示的内容。
 */

public class Test {
    public static void main(String[] args) {
        //定义List并添加Dog类对象
        List<Dog> dogs = new ArrayList<Dog>();
        Dog dog = new Dog();
        dog.setName("巴迪");
        Dog dog1 = new Dog();
        dog1.setName("豆豆");
        dogs.add(dog);
        dogs.add(dog1);

        //定义List并添加Cat类对象
        List<Cat> cats = new ArrayList<Cat>();
        Cat cat = new Cat();
        cat.setName("花花");
        Cat cat1 = new Cat();
        cat1.setName("凡凡");
        cats.add(cat);
        cats.add(cat1);

        //使用AnimalPlay类的方法，按照演示效果输出内容
        AnimalPlay.play(dogs);
        AnimalPlay.play(cats);

    }
}