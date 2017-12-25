package wiki.conoha.javahomework.threadTest;

public class Producer implements Runnable {
    private Queue queue;
    private int N =0;
    Producer(Queue queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        for (;;) {
            queue.setN(N++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
