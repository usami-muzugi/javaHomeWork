package wiki.conoha.javahomework.thread;

import javax.sound.midi.Track;

class PrintRunnable implements Runnable{
//    @Override
//    public void run() {
//        for (int i = 0; i <=1000 ; i++) {
//            System.out.println(Thread.currentThread().getName()+" "+i); //Thread.currentThread() 获取当前线程
//        }
//    }
    int i = 1;  //Thread thread thread1 共享PrintRunnable的i
    @Override
    public void run (){
//        int i = 1;
        while(i<=10){
            System.out.println(Thread.currentThread().getName()+"  "+i);
            i++;
        }
    }

}
public class Test {
    public static void main(String[] args) {
//        PrintRunnable printRunnable = new PrintRunnable();
//        //printRunnable 没有start()方法
//        Thread thread = new Thread(printRunnable);
//        thread.start();
//        PrintRunnable printRunnable1 = new PrintRunnable();
//        Thread thread1 = new Thread(printRunnable1);
//        thread1.start();

    PrintRunnable printRunnable = new PrintRunnable();
        Thread thread = new Thread(printRunnable);
        thread.start();

        Thread thread1 = new Thread(printRunnable);
        thread1.start();
    }
    /**
     * Thread-0 639
     Thread-0 640
     Thread-0 641
     Thread-0 642
     Thread-1 0
     Thread-0 643
     Thread-0 644
     Thread-1 1
     Thread-0 645
     Thread-1 2
     Thread-1 3
     Thread-1 4
     Thread-1 5
     Thread-1 6
     Thread-0 646
     Thread-1 7
     Thread-1 8
     Thread-1 9
     Thread-1 10
     Thread-1 11
     Thread-1 12
     Thread-0 647
     Thread-1 13
     Thread-0 648
     Thread-1 14
     Thread-0 649
     Thread-1 15
     Thread-0 650
     Thread-1 16
     Thread-0 651
     Thread-1 17
     Thread-0 652
     Thread-1 18
     Thread-0 653
     Thread-1 19
     Thread-0 654
     Thread-1 20
     Thread-0 655
     Thread-0 656
     Thread-0 657
     Thread-0 658
     Thread-0 659
     Thread-0 660

     */
}
