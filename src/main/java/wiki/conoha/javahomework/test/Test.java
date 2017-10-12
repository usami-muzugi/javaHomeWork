package wiki.conoha.javahomework.test;

import wiki.conoha.javahomework.animal.Animal;
import wiki.conoha.javahomework.animal.Cat;
import wiki.conoha.javahomework.animal.Dog;

public class Test {


    public static void main(String[] args) {
        Animal one = new Animal();//1

        /*
            多态
            向上转型，把一个子类的对象转为父类的对象
            隐式转型，自动转型，父类引用子类对象实例
            小类转型为大类
            这个对象可以调用子类重写父类的方法以及父类派生给子类的方法，无法调用子类独有的方法
         */

        Cat cat = new Cat();
        Animal twoone = cat;
        Animal two = new Cat();//2
        Animal three = new Dog();//3
        Animal animal = new Cat();
        animal.say();
        Cat cat1 = (Cat) animal;
        cat1.say();


        /*
            调用的都是 自己类的eat()方法
         */
        //two.run();   //这里的Cat类独有的run方法，是无法被调用到的
        one.eat();
        two.eat();
        three.eat();
        System.out.println("==========================================");

        /*
            向下转型、强制类型转换
            将子类的应用指向父类对象，此处必须强制转换类型
            向下转型（强制类型转换） 必须满足转换类型条件猜能强转
            instanceof: 返回 true/false

         */

            if(two instanceof Cat){
                Cat temp = (Cat)two;
                temp.eat();
                temp.run();
                System.out.println("two可以转换为Cat类型");
            }
            else
                if( two instanceof Dog){
                    Dog dog = (Dog) two;
                    dog.eat();
                    dog.sleep();
                    System.out.println("two可以转换为Dog类型");
                }

            if(two instanceof Animal) System.out.println("Animal");
            if(two instanceof Object) System.out.println("Object");
    }
}
