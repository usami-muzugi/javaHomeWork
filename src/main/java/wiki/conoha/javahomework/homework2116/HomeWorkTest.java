package wiki.conoha.javahomework.homework2116;

import org.omg.PortableServer.THREAD_POLICY_ID;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-03
 * Time: 14:15
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

public class HomeWorkTest {
    public static void main(String[] args) {
        System.out.println("写一个文件");
        try {
            Thread.sleep(500);
            System.out.println("就写张财源牛逼吧");
            Thread.sleep(2000);
            boolean flag = false;
            flag = FileOperat.transWriteByBuf("C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\homework2116\\zcyNB",

                "张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n" +
                        "张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n" +
                        "张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n张财源牛逼！！\n");
            if(flag) System.out.println("写完了"); else System.out.println("没写进去");
            flag = false;
            Thread.sleep(1000);
            System.out.println("读取下张财源牛逼");
            Thread.sleep(2500);
            flag = FileOperat.transReadByBuf("C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\homework2116\\zcyNB");
            if(flag) System.out.println("读完了"); else System.out.println("太牛逼都不了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
