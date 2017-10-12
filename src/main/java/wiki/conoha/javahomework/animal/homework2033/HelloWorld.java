package wiki.conoha.javahomework.animal.homework2033;

public class HelloWorld {
    public static void main(String[] args) {
        //定义float类型变量，赋值为88.99
        float f1 = 88.99F;
        //将基本类型转换为字符串
        String string = Float.toString(f1);
        string+=20;
        //打印输出
        System.out.println("f1转换为String类型后与整数20的求和结果为:"+string);
        //定义String类型变量，赋值为"188.55"
        String str = "188.55";
        // 将字符串转换为基本类型double
        double d = Double.parseDouble(str);
        d+=20;
        //打印输出
        System.out.println("f1转换为double类型后与整数20的求和结果为:"+d);
    }
}
