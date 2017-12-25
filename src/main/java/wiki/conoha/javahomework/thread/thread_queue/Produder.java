package wiki.conoha.javahomework.thread.thread_queue;

public class Produder implements Runnable {
    Queue queue;
    public Produder(Queue  queue){
        this.queue = queue;
    }
    @Override
    public void run() {
        int i = 0;
        while (true){
            queue.setN(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
