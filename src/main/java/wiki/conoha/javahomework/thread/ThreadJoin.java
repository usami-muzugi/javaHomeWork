package wiki.conoha.javahomework.thread;

public class ThreadJoin implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <21 ; i++) {
            System.out.println(Thread.currentThread().getName()+"当前正在执行！"+"   第"+i+"次");
        }
    }
}

class ThreadJoinTest{
    public static void main(String[] args) {
    ThreadJoin threadJoin = new ThreadJoin();
    Thread thread = new Thread(threadJoin);
    thread.start();
    Thread.getAllStackTraces();
    thread.getPriority();
//        try {
//            thread.join();  //调用join方法的线程会被优先执行，直至该线程结束后才会执行之后的线程
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        for (int i = 1; i <21; i++) {
            System.out.println("主线程运行"+i+"次");
        }
        System.out.println("主线程结束！");
    }
}
