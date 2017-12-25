package wiki.conoha.javahomework.runnable;

class PrintRunnable implements Runnable{

    public void run() {
        int i = 1;
        while (i<=10){
            System.out.println(Thread.currentThread().getName()+"正在运行!");
            i++;
        }
    }
}
public class Test {
    public static void main(String[] args) {
    PrintRunnable printRunnable = new PrintRunnable();
    Thread thread = new Thread(printRunnable);
    thread.start();
    PrintRunnable printRunnable1 = new PrintRunnable();
    Thread thread1 = new Thread(printRunnable1);
    thread1.start();
    }
}
