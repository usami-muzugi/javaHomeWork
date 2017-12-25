package wiki.conoha.javahomework.IO;


import java.io.*;

public class GetTime {
    public static void main(String[] args) {
            final String string = "C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\IO\\";
            File file = new File(string+"62065831_p0.png");
            long lon = 0;
            try {
                //打印当前时间到控制台,并把时间保存到lon
                System.out.println("当前时间:"+(lon = System.currentTimeMillis()));

                //创建文件输入流
                FileInputStream fileInputStream = new FileInputStream(file);
//                不创建缓存输入流
//                BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

                FileOutputStream fileOutputStream = new FileOutputStream(string+"Buffer.png");
                //不创建缓存输出流
//                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

                byte[] bytes = new byte[1024];
                int i = 0;
                while ((i = fileInputStream.read(bytes)) != -1) {
                    fileOutputStream.write(bytes,0,i);
                }
                //关闭一下
                fileInputStream.close();
                fileOutputStream.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("花费时间： "+(System.currentTimeMillis()-lon));



         //添加了Buffered
        file = new File(string+"62065831_p0.png");
        lon = 0;
        try {
            //打印当前时间到控制台,并把时间保存到lon
            System.out.println("当前时间:"+(lon = System.currentTimeMillis()));

            //创建文件输入流
            FileInputStream fileInputStream = new FileInputStream(file);
            //创建缓存输入流
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            FileOutputStream fileOutputStream = new FileOutputStream(string+"Buffer.png");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] bytes = new byte[1024];
            int i = 0;
            while ((i = bufferedInputStream.read(bytes)) != -1) {
                bufferedOutputStream.write(bytes,0,i);
            }
            fileInputStream.close();
            bufferedInputStream.close();
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("花费时间： "+(System.currentTimeMillis()-lon));
    }
}
