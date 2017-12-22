package wiki.conoha.javahomework.threadProject;
class MyThread extends Thread{
    public void run(){
        System.out.println(getName()+"该线程正在执行!");
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("主线程1:");
        MyThread myThread = new MyThread();
        myThread.start();//启动线程
        System.out.println("主线程2:");
        myThread.start();//Exception in thread "main" java.lang.IllegalThreadStateException
        //线程不能被多次地调用
    }
}
