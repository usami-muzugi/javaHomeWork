package wiki.conoha.javahomework.string;

public class StringTestTwo {
    public static void main(String[] args) {
        //定义一个字符串，"JAVA编程基础，我喜欢java编程"；
        String strting = new String("JAVA编程基础，我喜欢java编程");
        //查找一个字符出现的位置
        System.out.println(strting.indexOf("A"));
        //查找一个子字符串出现的位置
        System.out.println(strting.indexOf("编程"));
        //查找一个字符最后出现的位置
        System.out.println(strting.lastIndexOf("A"));
        //查找一个子字符串最后出现的位置
        System.out.println(strting.lastIndexOf("编程"));
        //查找一个子字符串最后出现的位置
        System.out.println(strting.indexOf("编程",8));
    }
}
