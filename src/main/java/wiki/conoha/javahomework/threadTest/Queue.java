package wiki.conoha.javahomework.threadTest;

public class Queue {
    private int n;
    private boolean flag = false;  //当flag为false的时候表示容器当中是没有数据的
    public synchronized int getN() {
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费 "+n);
        flag = false;//消费完毕，容器中没有数据
        notifyAll();
        return n;
    }

    public synchronized void setN(int n) {
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("生产 "+n);
        this.n = n;
        flag = true;//生产完毕容器中有数据
        notifyAll();
    }


}
