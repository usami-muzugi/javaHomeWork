package wiki.conoha.javahomework.IO;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-02
 * Time: 11:06
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/


/**
 * 创建线程的两种方式
 * 一种是继承Thread 一种是实现Runnable接口
 * 继承Thread的，可以直接调用父类Thread的start()方法。
 * 实现Runnable接口的，可以new一个Thread对象，再调用start()方法。
 *
 *
 */
public class GetFileFromWeb implements Runnable{
    URL url;
    int sum = 0;
    {
        //定义一个URL
        try {
            url = new URL("http://192.168.8.1/html/APPLICATION_OPEN_SOURCE_SOFTWARE_NOTICE.txt");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        GetFileFromWeb getFileFromWeb = new GetFileFromWeb();
        Thread thread = new Thread(getFileFromWeb);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                InputStream inputStream = url.openStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                FileOutputStream fileOutputStream = new FileOutputStream(new File("C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\IO\\APPLICATION_OPEN_SOURCE_SOFTWARE_NOTICE.txt"));
                String stirng = null;
                while ((stirng = bufferedReader.readLine()) !=null) {
                    fileOutputStream.write(stirng.getBytes());
                }
                inputStream.close();
                inputStreamReader.close();
                fileOutputStream.close();
                bufferedReader.close();
                System.out.println("执行了"+sum+"次");
                sum++;
                Thread.sleep(10);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
