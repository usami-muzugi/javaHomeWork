package wiki.conoha.javahomework.IO;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        //创建File对象
//      File file = new File("C:\\Java.File.Test\\IO\\JAVA_File_Test.txt");
        File file = new File("C:\\Java.File.Test\\IO\\","JAVA_File_Test");
        File file_1 = new File("C:\\Java.File.Test\\IO\\");
        File file_2 = new File(file_1,"JAVA_File_Test");
        System.out.println("是否是目录 "+ file.isDirectory());
        System.out.println("是否是文件 "+ file.isFile());

        //创建文件目录
        File file_3 = new File("C:\\Java.File.Test\\IO\\","HashSet");
        if(!file_3.exists()){
            file_3.mkdir();
        }
        File file_4 = new File("C:\\Java.File.Test\\IO\\","Set\\HashSet");
        if(!file_4.exists()){
            file_4.mkdirs(); //创建多级目录的时候使用mkdirs()
        }

        //创建文件
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else System.out.println("文件已经被创建");


    }
}
