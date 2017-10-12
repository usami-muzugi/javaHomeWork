package wiki.conoha.javahomework.test;

import wiki.conoha.javahomework.animal.Cat;
import wiki.conoha.javahomework.animal.Dog;
import wiki.conoha.javahomework.animal.Master;

public class MaserTest {

    public static void main(String[] args) {
        Master master = new Master();
        Cat cat = new Cat();
        Dog dog = new Dog();
        master.feed(cat);
        master.feed(dog);

    }
}
