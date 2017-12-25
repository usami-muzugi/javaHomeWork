package wiki.conoha.javahomework.thread.thread_Bank;

public class Bank {
    private String account;
    private int balance;

    public Bank(String account,int balance){
        this.account = account;
        this.balance = balance;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Bank[账号:"+account+",余额:"+balance+"]";
    }

    //存钱
    public void saveAccoount(){
        int balance = getBalance();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        balance +=100;
        setBalance(balance);
        System.out.println("存款后得余额为:"+balance);
    }
    public void saveAccount(int f){
        int balance = getBalance();
        //        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
         balance += f;
        setBalance(balance);
        System.out.println("存款后得余额为:"+balance);
    }

    //取钱
    public void drawAccount(){
        int balance = getBalance();
        balance -= 100;
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        setBalance(balance);
        System.out.println("取款后得余额:"+balance);
    }
    public void drawAccount(int f){
        int balance = getBalance();
        balance -= f;
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        setBalance(balance);
        System.out.println("取款后得余额:"+balance);
    }
}
