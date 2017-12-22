package wiki.conoha.javahomework.homework2089;

public class Cat implements Runnable {
    private int i = 0;
    public void run() {
        for (; i <2 ; i++) {
            System.out.println(Thread.currentThread().getName()+"A Dog");
        }
    }
}
