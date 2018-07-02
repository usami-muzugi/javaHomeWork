public class AutoChange {

    public static void main(String[] args) {
		/*
		 * 定义 声明 初始化
			1.先定义变量
			数据类型    变量;
			变量名  =  值;
		 */
        int i;  //定义一个变量
        i = 666;  //初始化一个变量
        int j, k, l;  //定义一些变量
        j = 25;
        k = 11;
        l = 11212;

        /*
            2.定义时同时赋值
         */
        int m = 12;


        /*
            3.变量的特点
                数据类型:支持JAVA当中的所有数据类型，基本数据类型、引用数据类型
                给变量赋值: 从右到左
                变量可以存一次值 [ 上次存储的值会被下一次覆盖 ]
                数据类型限定了变量可以存储的类型
         */
        //数据类型:支持JAVA当中的所有数据类型，基本数据类型、引用数据类型
        //给变量赋值: 从右到左,

        //基本数据类型，变量存储的是值的本身
        int aInt = 123456;

        //而引用数据类型，变量存储的是变量的堆的内存地址
        String string = "Hello World!";
        String[] arrayString = {};
        System.out.println(arrayString); //[Ljava.lang.String;@1540e19d  --> 所存储数据的内存地址
    }
}
