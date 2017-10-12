package wiki.conoha.javahomework.string;


import sun.nio.cs.ext.GBK;

import java.io.UnsupportedEncodingException;

public class StringDemoThree {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //字符串和byte数组之间的转换
        //定义一个字符串
        String string = new String("JAVA 编程 基础");
        //将字符串转换为byte数组
        byte[] bytes = string.getBytes("GBK");
        for (byte b:bytes
             ) {
            System.out.print(b+" ");
        }
        System.out.println();
        //将byte数组转换为字符串
        String string1 = new String(bytes, "GBK");
        System.out.println(string1);
        /**
         * GBK 的汉字用的是两个 UTF-8 用的是3个
         * 出现-，是因为溢出了
         */
    }
}
