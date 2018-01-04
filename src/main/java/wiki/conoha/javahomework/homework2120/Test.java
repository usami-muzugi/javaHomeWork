package wiki.conoha.javahomework.homework2120;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-04
 * Time: 09:47
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

public class Test {
    public static void main(String[] args) {
        try {
            //输出流
            System.out.println("打开输入流");
            Thread.sleep(1000);

            FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\homework2120\\ObjectFile"));
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //创建Product对象
            System.out.println("创建Product对象");
            Thread.sleep(1000);

            ObjectDemo iphone = new ObjectDemo(123,"iphone","telephone",4888.0);
            ObjectDemo ipad = new ObjectDemo(234,"ipad","computer",5088.0);
            ObjectDemo macbook = new ObjectDemo(345, "macbook", "computer",10688.0);
            ObjectDemo iwatch = new ObjectDemo(256,"iwatch","watch",4799.0);

            //实例化对象输出流到文件
            System.out.println("实例化对象输出流到文件");
            Thread.sleep(1000);

            objectOutputStream.writeObject(iphone);
            objectOutputStream.writeObject(ipad);
            objectOutputStream.writeObject(macbook);
            objectOutputStream.writeObject(iwatch);

            //关闭各种输出流
            System.out.println("关闭各种输出流");
            Thread.sleep(1000);

            objectOutputStream.flush();
            objectOutputStream.close();

            fileOutputStream.flush();
            fileOutputStream.close();

            //输入流&读取文件
            System.out.println("输入流");
            Thread.sleep(1000);

            File file = new File("C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\homework2120\\ObjectFile");
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            //显示
            System.out.println("显示");
            System.out.println();


            //使用catch来捕获错误再跳出，抑制报错，很棒的方法。
            while (true) {
                try {
                    System.out.println(objectInputStream.readObject());
                } catch (EOFException e) {
                    break;
                }
            }


            //关闭各种输入流
            System.out.println("关闭各种输出流");
            Thread.sleep(1000);


            objectInputStream.close();
            fileInputStream.close();

            Thread.sleep(2000);
            System.out.println("完毕！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
