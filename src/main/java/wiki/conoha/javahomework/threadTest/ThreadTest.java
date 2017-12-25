package wiki.conoha.javahomework.threadTest;
class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        for (int i = 0; i <=10 ; i++) {
            System.out.println(getName()+"线程正在运行"+i+"次");
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("线程1");
        myThread.start();
        MyThread myThread1 = new MyThread("线程2");
        myThread1.start();
/**
 * 线程运行都是随机的
 * 线程2线程正在运行0次
 线程1线程正在运行0次
 线程2线程正在运行1次
 线程1线程正在运行1次
 线程2线程正在运行2次
 线程1线程正在运行2次
 线程2线程正在运行3次
 线程1线程正在运行3次
 线程2线程正在运行4次
 线程1线程正在运行4次
 线程2线程正在运行5次
 线程1线程正在运行5次
 线程2线程正在运行6次
 线程1线程正在运行6次
 线程2线程正在运行7次
 线程1线程正在运行7次
 线程2线程正在运行8次
 线程1线程正在运行8次
 线程2线程正在运行9次
 线程1线程正在运行9次
 线程2线程正在运行10次
 线程1线程正在运行10次
 */
    }
}
