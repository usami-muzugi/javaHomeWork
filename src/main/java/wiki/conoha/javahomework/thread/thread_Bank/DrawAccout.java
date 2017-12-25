package wiki.conoha.javahomework.thread.thread_Bank;

public class DrawAccout implements Runnable {
    Bank bank;
    public DrawAccout(Bank bank){
        this.bank = bank;
    }
    @Override
    public void run() {
        bank.drawAccount();
    }
}
