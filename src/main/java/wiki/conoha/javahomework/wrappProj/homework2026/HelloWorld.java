package wiki.conoha.javahomework.wrappProj.homework2026;

public class HelloWorld {
    public static void main(String[] args) {
        // 定义int类型变量，值为100
        int score = 100;
        // 创建Integer包装类对象，表示变量score1的值
        Integer score1 = new Integer(score);
        // 将Integer包装类转换为double类型
        double d = score1.doubleValue();
        // 将Integer包装类转换为Long类型
        long l = score1.longValue();
        // 将Integer包装类转换为int类型
        int i = score1.intValue();
        //打印输出
        System.out.println("scored对应的Integer类型结果为:"+score);
        System.out.println("scored对应的double类型结果为:"+d);
        System.out.println("scored对应的long类型结果为:"+l);
        System.out.println("scored对应的int类型结果为:"+i);
    }
}
