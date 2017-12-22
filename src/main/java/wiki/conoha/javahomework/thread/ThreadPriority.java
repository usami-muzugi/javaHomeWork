package wiki.conoha.javahomework.thread;

public class ThreadPriority implements Runnable{
    private String name;
    public ThreadPriority(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i <11; i++) {
            System.out.println("线程"+name+"正在运行"+i+"次");
        }
    }
}

class  ThreadPriorityTest{
    public static void main(String[] args) {
        //获取主线程的优先级
        int currentThreadPriority = Thread.currentThread().getPriority();
        System.out.println("主线程的优先级为："+currentThreadPriority);
        ThreadPriority threadPriority = new ThreadPriority("张财源牛逼");
        ThreadPriority threadPriority_2 = new ThreadPriority("张财源牛逼_2");
        Thread thread = new Thread(threadPriority);
        Thread thread_2 = new Thread(threadPriority_2);
        //thread.setPriority(10);
        thread.setPriority(Thread.MIN_PRIORITY);
        thread_2.setPriority(Thread.MAX_PRIORITY);
        /**
         * 先启动的进程，也有可能出现先执行的情况
         */
        thread.start();
        thread_2.start();
        System.out.println("线程1的优先级为:"+thread.getPriority());
    }
}
