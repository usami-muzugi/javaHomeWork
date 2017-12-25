package wiki.conoha.javahomework.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        File file = new File("XIMCloud");
        if(file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Wizard\\IdeaProjects\\javahomework\\XIMCloud");
//            int i = fileInputStream.read();
//            System.out.println(i);
//            System.out.println((char)i);


//            int i = fileInputStream.read();
//            while(i!=-1){
//                System.out.print((char)i);
//                i = fileInputStream.read();
//            }
            int i = 0;
            while ((i = fileInputStream.read()) != -1){
                System.out.print((char)i);
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
