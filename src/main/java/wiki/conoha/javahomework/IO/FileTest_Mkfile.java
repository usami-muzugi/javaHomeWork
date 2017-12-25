package wiki.conoha.javahomework.IO;

import java.io.File;
import java.io.IOException;

public class FileTest_Mkfile {
    public static void main(String[] args) {
        File file = new File("C:\\Java.File.Test\\IO\\Mkfile");
        System.out.println("文件是否存在: " + file.exists());
        System.out.println("文件是否为目录: "+ file.isDirectory());
        System.out.println("文件是否为文件: " + file.isFile());
        if(!file.exists()) {
            try {
                file.createNewFile();
                file.getPath();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("文件是否为目录: "+ file.isDirectory());
            System.out.println("文件是否为文件: " + file.isFile());
            System.out.println("文件是否可读: " + file.canRead());
            System.out.println("文件是否可写: " + file.canWrite());
        }


    }
}
