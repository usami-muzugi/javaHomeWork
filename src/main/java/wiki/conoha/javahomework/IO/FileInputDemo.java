package wiki.conoha.javahomework.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Wizard\\IdeaProjects\\javahomework\\XIMCloud");
            byte [] bytes = new byte[100];
            fileInputStream.read(bytes);
            //fileInputStream.read(bytes,0,5);
            System.out.println(new String(bytes));
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
