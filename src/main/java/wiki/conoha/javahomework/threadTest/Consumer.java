package wiki.conoha.javahomework.threadTest;

public class Consumer implements Runnable{
    Queue queue;
    Consumer(Queue queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        for (;;) {
            queue.getN();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
