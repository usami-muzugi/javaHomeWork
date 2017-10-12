package wiki.conoha.javahomework.string.homework2048;

public class StringTest {
    public static void main(String[] args) {
        //定义一个字符串"欢迎来到"
        StringBuilder stringBuilder = new StringBuilder("欢迎来到");
        //在"欢迎来到"后面添加内容，将字符串变成"欢迎来到 召唤师峡谷"
        System.out.println(stringBuilder.append("召唤师峡谷"));
        //使用delete方法删除"欢迎来到",然后插入“你好！”
        System.out.println(stringBuilder.delete(0,5).insert(0,"你好!"));
        //将字符串变成“你好，imooc”
        System.out.println(stringBuilder.replace(2,3,","));
        //使用replace方法替换
    }
}