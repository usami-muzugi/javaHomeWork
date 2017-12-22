package wiki.conoha.javahomework.thread;

public class RunnableTest {


    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread threadDog = new Thread(dog);
        threadDog.start();
        Cat cat = new Cat();
        Thread threadCat = new Thread(cat);
        threadCat.start();

    }
}

class Dog implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <3 ; i++) {
            System.out.println(Thread.currentThread().getName()+"A Dog");
        }
    }
}

class Cat implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <3; i++) {
            System.out.println(Thread.currentThread().getName()+"A Cat");
        }
    }
}