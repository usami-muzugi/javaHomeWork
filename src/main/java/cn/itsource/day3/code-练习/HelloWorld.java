/*
 *
 *public 和 class 为修饰符，public 修饰该类为公共类 class修饰HelloWorld为一个类
 *当使用public 修饰的 类，源文件名和类名必须相同。
 *
 *JAVA符号的标识符，可以为类名、变量名、方法名 。 但是，只能是以为A-Z a-z $ _ 开头，和数字结合来使用
 *
 */
public class HelloWorld{
	//main()方法必须要用public来修饰，main()方法是JAVA的主方法，是JAVA程序执行时的入口，一个JAVA程序只有包含
	//main()方法，才能被执行
	public static void main(String[] args){
		//main方法内的语句，会被按顺序和流程执行
		//打印语句System.out.println();s
		System.out.println("Hello World!");
		System.out.println(10);	 //10进制
		System.out.println(0B1111100);
		System.out.println(0x66CCFF);
		System.out.println("Hello World!");
		System.out.println("");
		//基本数据类型


		//整数
		int i = 1;
		byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10;  //10默认是int类型，所以需要在10后面加L

		//引用数据类型
		//类（class） 类就是一个数据类型
		HelloWorld helloWorld = new HelloWorld();



		//二进制
		/*

		*/
			
	}

	//静态内部类
	public static class innertClass{  

	}

	//局部内部类
	public static HelloWorld innert(){
		return new HelloWorld();
	}


	//匿名内部类
}


   