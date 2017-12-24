package wiki.conoha.javahomework.IO;

import java.io.*;

public class FileOutputDemo {

    /**
     * 字节流不适合用于不定文字传输
     * 适合用于二进制传输
     */
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\IO\\XIMCloud.txt");
        if(!file.exists()){
            System.out.println("File is not exists!");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }   else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    fileOutputStream.write(50);
                    fileOutputStream.write('a');
                    System.out.print((char) fileInputStream.read());
                    fileOutputStream.close();
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
