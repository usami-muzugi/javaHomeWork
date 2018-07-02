package cn.itsource.day3.code.code;

public class HomeWork {
    public static void main(String[] args) {
        boolean var = true;
        System.out.println("var = " + var);
        System.out.println("another boolean =" + false);
        System.out.println("---------------");

        byte b = 127;
        System.out.println("b = " + b);
        System.out.println("another byte= " + 12);

        short s = 233;
        System.out.println("s = " + s);
        System.out.println("another short = " + 2333);
        System.out.println("---------------");

        int i = 23333;
        System.out.println("i = " + i);
        System.out.println("another int = " + 1222);
        System.out.println("---------------");
        long l = 2333333L;
        System.out.println("l = " + l);
        System.out.println("another long = " + 2333333L);
        System.out.println("---------------");

        //��������int���͵ı���age1��age2
        int age1, age2;
        //��age1��ʼ������ֵΪ���Լ�������
        age1 = 22;
        int myAge = age1;
        //��age2��ʼ������ֵΪ�����(����˿)������
        age2 = 22;
        int gayFriendAge = age2
        //������������������������֮�͡�
        System.out.println("us's age sum = " + (myAge + gayFriendAge));

        //����String���ͱ���name��int���ͱ���age
        String name;
        int age;

        //��name��ʾ ������age��ʾ45
        name = "����";
        age = 45;
        System.out.println("������" + name + "����: " +age);	
    }
}