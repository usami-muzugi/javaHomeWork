package wiki.conoha.javahomework.string;

public class StringDemoFive {
    public static void main(String[] args) {
        //String的不可变性
        //String对象一旦被创建，则不能被修改，是不可变的
        //所谓的修改，就是创建了新的对象所指向的内存空间不变
        String string = "卢本伟牛逼";
        String string2 ="hello,"+string;
        //string 不再指向 卢本伟牛逼的内存空间，而是指向了hello，卢本伟牛逼
        System.out.println(string);
        System.out.println(string2);

        String string3 = new String("Hello,卢本伟");
        System.out.println("subString:"+(string3.substring(0,5)));
        System.out.println("string3:"+string3);
    }
}
