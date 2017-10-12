package wiki.conoha.javahomework.string;

public class StringDemoFour {
    public static void main(String[] args) {
        String string = new String("卢本伟牛逼");
        String string1 = "卢本伟牛逼";
        String string2 = "卢本伟牛逼";
        System.out.println("string1&&2内容相同？"+(string1.equals(string2)));
        System.out.println("string1&&内容相同？"+(string1.equals(string)));
        System.out.println("string1&&2地址相同？"+(string1==string2));
        System.out.println("string1&&2地址相同？"+(string1==string));
        string2+=100;
        System.out.println(string1);
        System.out.println(string2);
    }
}
