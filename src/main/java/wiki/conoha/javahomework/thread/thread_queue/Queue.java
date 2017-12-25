package wiki.conoha.javahomework.thread.thread_queue;

public class Queue {
    private int n;
    private boolean flag = false;

    public synchronized void setN(int n) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("生产 "+this.n);
        this.n = n;
        flag = true;
        notifyAll();
    }

    public synchronized int getN() {
        if(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费   "+this.n);
        flag = false;
        notifyAll();
        return n;
    }

}
