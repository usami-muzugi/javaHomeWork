package wiki.conoha.javahomework.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Speech {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Wizard\\IdeaProjects\\javahomework\\src\\main\\java\\wiki\\conoha\\javahomework\\IO");
        file = new File(file,"Speech.txt");
        //Method two too bad
//        try {
//            FileInputStream fileInputStream = new FileInputStream(file);
//            int i,sum = 0;
//            String [] strings = new String[100];
//            while ((i = fileInputStream.read()) != -1) {
//                strings[sum] = new String(String.valueOf((char)i));
//                sum += 1;
//            }
//            System.out.print("文本结果: ");
//            for (String s:strings
//                 ) {
//                if (s == null) {
//                    break;
//                }
//                System.out.print(s);
//            }
//            System.out.println();
//            System.out.println("统计结果: Speech.txt 文件中有"+ sum + "个字节");
//            fileInputStream.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Method one
        if (file.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte [] bytes = new byte[100];
                try {
                    fileInputStream.read(bytes);
                    fileInputStream.close();
                    fileInputStream = new FileInputStream(file);
                    int sum = 0;
                    while (fileInputStream.read() != -1) {
                        sum += 1;
                    }
                    fileInputStream.close();
                    System.out.println("文本结果: "+ new String(bytes));
                    System.out.println("统计结果: Speech.txt 文件中有"+ sum + "个字节");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }else System.out.println("File is not exists!");
    }
}
