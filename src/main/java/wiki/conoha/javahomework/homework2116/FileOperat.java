package wiki.conoha.javahomework.homework2116;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-03
 * Time: 14:12
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

public final class FileOperat {

    private FileOperat(){

    }

    /**
     *  写文件方法，文件路径和文件名 文件内容 返回是否写好
     * @param string file name and path
     * @param str file text
     * @return has done?
     */
    public static final boolean transWriteByBuf(String string,String str){
        File file = new File(string);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(str);
            bufferedWriter.flush();
            bufferedWriter.close();
            outputStreamWriter.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * 写文件方法
     * @param string file name and path
     * @param str file text
     * @param f overwrite it?
     * @return has done?
     */
    public static final boolean transWriteByBuf(String string,String str,boolean f) {
        boolean flag = false;
        File file = new File(string);
        if (!file.exists()) { //如果文件不存在
            transWriteByBuf(string,str);
            flag = true;
        } else{
            if (f==true) {  //如果文件存在
                transWriteByBuf(string,str);
                flag = true;
            }else{
                System.out.println("file is exists!but you can not overwrite it now!");
            }
        }

        return flag;
    }

    //读方法，读取文件内容

    public static final boolean transReadByBuf(String string) {
        File file = new File(string);
        boolean flag = false;
        try {
            //FileReader fileReader = new FileReader(file);
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String s = "not null";
            for (;;) {
                s = bufferedReader.readLine();
                if (s==null) {
                    break;
                }
                System.out.println(s);
            }
            flag = true;
            //wrong function
//            while (s!=null) {
//                System.out.println(s=bufferedReader.readLine());
//            }
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return flag;
    }
}
