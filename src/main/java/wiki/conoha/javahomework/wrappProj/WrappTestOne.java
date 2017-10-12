package wiki.conoha.javahomework.wrappProj;

public class WrappTestOne {
    public static void main(String[] args) {
        //装箱操作

        int t1 = 2;
        Integer t2 = t1; //Integer 包装类  自动装箱
        Integer t3 = new Integer(t1); //手动装箱

        System.out.println("Int t1的值:"+t1);
        System.out.println("Integer对象t2的值:"+t2);
        System.out.println("Integer对象t3的值:"+t3);

        System.out.println("********************************");

        System.out.println("拆箱");
        //自动拆箱
        int t4 = t2;
        //手动拆箱
        int t5 = t2.intValue();

        double t6 = t2.doubleValue();

        System.out.println("Integer对象t2的值:"+t2);
        System.out.println("Int t4 的值:"+t4);

        System.out.println("Integer对象t2的值:"+t2);
        System.out.println("Int t5 的值:"+t5);

        System.out.println("Integer对象t2的值:"+t2);
        System.out.println("Double t6 的值:"+t6);
    }
}
