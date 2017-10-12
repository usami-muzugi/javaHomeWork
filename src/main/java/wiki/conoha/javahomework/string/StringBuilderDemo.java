package wiki.conoha.javahomework.string;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String string = new String("你好");
        //定义一个字符串
        StringBuilder stringBuilder = new StringBuilder("你好");
        //在你好后面，添加内容，字符串变成 你好，卢本伟
        stringBuilder.append(",");
        stringBuilder.append("卢本伟！");
        System.out.println(stringBuilder);

        /**
         * StringBuilder 操作字符串没有新开辟新的内存空间
         */
        //将字符串 你好，卢本伟！ 修改为 你好，LUBENWEI!
        //String 类有toUpperCase() StringBuilder却没有
        //1、使用delete方法删除lubenwei，然后再插入LUBENWEI
        System.out.println("替换后:"+stringBuilder.delete(3,6).insert(3,"LUBENWEI"));
        //delete() 开始位置，结束位置

        //2、使用replace方法替换
        System.out.println("替换后:"+stringBuilder.replace(3,11,"LUBENWEI"));

        //在字符串 你好,LUBENWEI！中取出 你好 并输出
        System.out.println(stringBuilder.substring(0,2));
    }
}
