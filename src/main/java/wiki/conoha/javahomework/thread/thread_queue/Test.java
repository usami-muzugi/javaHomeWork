package wiki.conoha.javahomework.thread.thread_queue;

public class Test {
    public static void main(String[] args) {
        Queue queue = new Queue();
        new Thread(new Produder(queue)).start();
        new Thread(new Consumer(queue)).start();

    }
}
