package wiki.conoha.javahomework.string.homework2028;

public class StringUse {
    public static void main(String[] args) {
        double a = 12.5;
        //将基本类型转换为字符串
        String str1 = Double.toString(a);
        str1+=10;
        System.out.println("a 转换为String型后+10的结果为： "+ str1);
        String str = "2.8";
        // 将字符串转换为基本类型
        Double b = Double.parseDouble(str);
        b+=10;
        System.out.println("str 转换为double型后+10的结果为： "+ b);

    }
}

