package wiki.conoha.javahomework.IO;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-03
 * Time: 11:36
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

public class IOTest extends Thread{
    @Override
    public void run() {
        try {
            String string = "C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\IO\\";
            File file = new File(string + "62065831_p0.png");
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\IO\\IOTest.png");
            int i = 0,sum = 1;
            byte[] bytes = new byte[1024];
            while ((i = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, i);
                System.out.println("write()方法执行了"+sum+"次");
                sum++;
                Thread.sleep(20);
            }
            fileInputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Thread thread = new Thread(new IOTest());
        thread.start();
    }
}
