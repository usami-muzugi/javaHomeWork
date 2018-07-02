/**
class 类修饰符,后面跟类名

书写格式，左边大括号，跟在同行，右边大括号，跟在下面对齐

跟上程序执行入口方法(主方法、main方法)，public static void mian(String[] args)
主方法内字符串数组参数 args，为DOS 执行时命令参数。
class HelloWorld{
	public static void main(String[] args){
		System.out.print(args);	
	}
}
主方法内，跟上功能语句，System.out.print();

编译方法：使用DOS javac命令编译， javac HelloWorld.java 生成字节码
运行方法:  使用DOS Java命令执行，java HelloWorld
执行结果:  HelloWorld!
*/

class HelloWorld{
	public static void main(String[] args){
		System.out.print(args);	
	}
}