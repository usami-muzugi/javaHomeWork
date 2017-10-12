package wiki.conoha.javahomework.string;

public class StringTest {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = new String();
        String s2 = new String("");

        String string = "JAVA 编程 基础";
        System.out.println(string.length());

        //取出字符串当中的某个字符
        System.out.println(string.charAt(6));
        //index: 0 1 2 3 4 5 6 7 8 9

        //取出子串"编程 基础"并输出
        System.out.println(string.substring(5));

        //取出字符串 "编程" 并输出

        System.out.println(string.substring(5,7));
        //5到7，7以前的字符
    }
}
