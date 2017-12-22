package wiki.conoha.javahomework.thread;

public class ThreadSleepTest {
    public static void main(String[] args) {
        ThreadSleep threadSleep = new ThreadSleep();
        Thread thread = new Thread(threadSleep);
        thread.setName("threadSleep");
        thread.start();
        Thread thread1 = new Thread(threadSleep);
        thread1.start();
    }
}

class ThreadSleep implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <15; i++) {
            System.out.println(Thread.currentThread().getName()+"当前第"+(i+1)+"次执行!");
            try {
                Thread.sleep(1000); //休眠1000毫秒后重新变成可运行状态
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
