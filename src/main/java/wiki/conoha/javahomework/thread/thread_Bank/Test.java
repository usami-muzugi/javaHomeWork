package wiki.conoha.javahomework.thread.thread_Bank;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank("1001",100);
        System.out.println(bank.toString());
        bank.saveAccoount();
        bank.drawAccount();
        System.out.println(bank.toString());
        System.out.println(bank.getBalance());
    }
}
