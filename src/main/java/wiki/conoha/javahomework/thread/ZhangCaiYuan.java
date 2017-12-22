package wiki.conoha.javahomework.thread;

public class ZhangCaiYuan implements Runnable{
    private static String name;
    private static int runtime;
    public ZhangCaiYuan(String name,int runtime){
        this.name = name;
        this.runtime = runtime;
    }

    @Override
    public void run() {
        for (int i = 1; i <=runtime; i++) {
            System.out.println(name+"牛逼了"+i+"次");
        }
    }
}

class ZhangCaiYuanNiuBi{
    public static void main(String[] args) {
        ZhangCaiYuan zhangCaiYuan = new ZhangCaiYuan("张财源牛逼",1000);
        Thread zhangcaiyuan = new Thread(zhangCaiYuan);
        zhangcaiyuan.setPriority(Thread.MAX_PRIORITY);
        zhangcaiyuan.start();

    }
}
