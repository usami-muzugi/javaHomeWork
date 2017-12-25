package wiki.conoha.javahomework.IO;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) {
        //文件读写操作
        String string = new String("C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\IO\\");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(string + "Buffer.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            FileInputStream fileInputStream = new FileInputStream(string+"Buffer.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream.write(50);
            bufferedOutputStream.write('a');
//            bufferedOutputStream.flush();//强制清空调用flush()方法
            bufferedOutputStream.close(); //使用close()方法也会强制清空，Buffer内的缓存。
            System.out.println(bufferedInputStream.read()); //有点迭代器的感觉
            System.out.println((char) bufferedInputStream.read());
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
