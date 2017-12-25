package wiki.conoha.javahomework.IO;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        String string = new String("C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\IO\\");
        final char [] abc = new String("abcdefghijklmnopqrstuvwxyz").toCharArray();
        final int sum = 100000;
        long lon = 0;
        long lo = 0,l = 0;
        /**
         * 写入100000个字符
         * 不使用buffer
         */
        try {
            //获取系统时间并记录与lon
            System.out.println("当前系统时间: " + (lon = System.currentTimeMillis()));
            FileOutputStream fileOutputStream = new FileOutputStream(string+"one.txt");
            for (int i = 0; i <sum; i++) {
                fileOutputStream.write(abc[i%24]);
            }
            //写入完成后的时间
            System.out.println("关闭流");
            fileOutputStream.close();
            System.out.println("花费时间: "+ (lo =(System.currentTimeMillis()-lon)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("使用Buffer");
        System.out.println("当前系统时间: " + (lon = System.currentTimeMillis()));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(string+"two.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            for (int i = 0; i <sum; i++) {
                bufferedOutputStream.write(abc[i%24]);
            }
            //写入完成后的时间
            System.out.println("关闭流");
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            fileOutputStream.close();
            System.out.println("花费时间: "+ (l = (System.currentTimeMillis()-lon)));
            System.out.println("用缓冲流来写节省了:" + (lo - l));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
