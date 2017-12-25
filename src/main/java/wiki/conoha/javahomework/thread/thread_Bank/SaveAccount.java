package wiki.conoha.javahomework.thread.thread_Bank;

public class SaveAccount implements Runnable {
    Bank bank;
    public SaveAccount(Bank bank){
        this.bank = bank;
    }
    @Override
    public void run() {
        bank.saveAccoount();
    }
}
