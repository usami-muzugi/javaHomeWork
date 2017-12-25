package wiki.conoha.javahomework.IO;

import java.io.*;

public class FileOutputTest {
    public static void main(String[] args) {
        final String local = "C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\IO\\";
//        File file = new File(local+"E30B0160D2F3C496E1F49E9643F138E6.png");
//        try {
//            FileInputStream fileInputStream = new FileInputStream(file);
//            FileOutputStream fileOutputStream = new FileOutputStream(local+"outputTest.png");
//            byte [] bytes = new byte[1024];
//            int sum = 0;
//            while ((sum = fileInputStream.read(bytes)) != -1) {
//                fileOutputStream.write(bytes);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(local+"OutputTest"));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(local+"OutputTest_2"));
            byte [] bytes = new byte[1];
            fileInputStream.read(bytes);
            for (byte b :
                    bytes) {
                System.out.print(b+" ");
            }
//            fileOutputStream.write();
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
