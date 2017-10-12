package wiki.conoha.javahomework.wrappProj;

public class WrappTestTwo {
    public static void main(String[] args) {

        //基本数据类型转换为字符串
        int var = 1;
        String var2 = Integer.toBinaryString(var);
        System.out.println(var2);

        System.out.println("*****************************");
        //字符串转换为基本数据类型
        //通过包装类的parse方法来实现
        int t3 = Integer.parseInt(var2);
        int t4 = Integer.valueOf(var2); //Integer.valueOf 将var2转换为包装类，在通过自动拆箱转换为int基本数据类型
        System.out.println("字符串类型转换为Int类型"+t3);
        System.out.println("字符串类型转换为Int类型"+t4);
    }

}
