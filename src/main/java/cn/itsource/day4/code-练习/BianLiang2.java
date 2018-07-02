public class BianLiang2 {

   	/*
	*变量的分类
		成员变量：写在类的结构提的变量称为成员变量
			1.成员变量，根据数据类型存在默认值
			2.char的默认值比较特殊，这里无法测试！
		局部变量：写在方法体内部的变量称为局部变量
			1.如果成员变量和局部变量同名，先使用局部变量 [ 就近原则]
			2.局部变量在使用前必须初始化！局部变量没有默认值！
	*/

	//声明成员变量
	private static String name;
	private static int age;

	public static void main(String[] args){

		//测试成员变量
		System.out.println(name);		//输出结果为Null
		System.out.println(age);		//输出结果为0


		//测试局部变量
		test();
	}


	public static void test(){
		//声明并初始化length变量
		int length = 20;
		System.out.pringln(length);  //打印并输出
	}
}
