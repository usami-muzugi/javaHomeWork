package wiki.conoha.javahomework.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo {
    public static void main(String[] args) {
        String string = new String("C:\\Users\\wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\IO\\");
        try {
            FileInputStream fileInputStream = new FileInputStream(string+"62065831_p0.png");
            FileOutputStream fileOutputStream = new FileOutputStream(string+"copy.png");
            int i = 0;
            byte [] bytes = new byte[4096];
            while ((i = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes,0,i);
            }
            fileInputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
