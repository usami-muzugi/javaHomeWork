package wiki.conoha.javahomework.thread;

public class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){ //和线程有关得都
        for (int i =1; i <=10; i++) {
            System.out.println("正在运行"+getName()+"  "+i);  //extend Thread
        }
    }
}
 class MyThreadTest{
     /**
      *
      */
     public static void main(String[] args) {
         MyThread myThread = new MyThread("线程1");
         MyThread myThread1 = new MyThread("Thread2");
         myThread.start();
//         myThread.start(); //线程只能启动一次
         myThread1.start();
     }
}
