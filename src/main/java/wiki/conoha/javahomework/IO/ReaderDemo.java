package wiki.conoha.javahomework.IO;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-03
 * Time: 12:00
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

public class ReaderDemo {
    public static void main(String[] args) {
        /**
         * 模拟从文件中读取数据
         */
        File file = new File("C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\IO\\zcyNB");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\IO\\张财源牛逼");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"UTF-8");
            //GKB UTF-8 ...   读写数据的时候，一定要保持数据的一致。不然会乱码

            int n = 0;
            char [] chars = new char[256];
            //第一种
//            while ((n = inputStreamReader.read()) != -1) {
//                System.out.print((char)n);
//            }
            //第二种
//            while ((n = inputStreamReader.read(chars)) != -1) {
//                String string = new String(chars,0,n);
//                System.out.println(string);
//            }
            //输出流 把zcyNB读出来，写到张财源牛逼当中
//            while ((n = inputStreamReader.read(chars)) != -1) {
//                String string = new String(chars,0,n);
//                outputStreamWriter.write(string);
//                outputStreamWriter.flush();
//            }
            while ((n = inputStreamReader.read()) != -1) {
                outputStreamWriter.write((char)n);
            }
            fileInputStream.close();
            inputStreamReader.close();
            outputStreamWriter.flush();
            outputStreamWriter.close();
            fileOutputStream.flush();
            fileOutputStream.close();

//            while ((n = inputStreamReader.read()) != -1) {
//                String string = new String(String.valueOf((char)n));
//                outputStreamWriter.write(string);
//            }
            fileInputStream.close();
            inputStreamReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
