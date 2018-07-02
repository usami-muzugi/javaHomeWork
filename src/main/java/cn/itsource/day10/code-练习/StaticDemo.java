public class StaticDemo{
	/*
		学习static关键字	测试static可以修饰的内容
		static [类级别的修饰符]
		static目前可以修饰
			1.可以修饰普通方法
			2.可以修饰字段
			3.可以修饰内部类
			4.不可以修饰方法内变量
			5.不可以修饰构造方法
			6.不可以修饰外部类
	*/
	public static void main(String[] args){
		/*static*/ int i = 10;	//非法的表达式，static不能修饰方法变量
		System.out.println(i);
	}
	
}

class Static{
	//静态属性
	private static String string;	//static修饰字段



	//动态属性
	public static void method(){	//static修饰普通方法
		System.out.println();
	}
	
	//构造方法
	public /*static*/ Static(){		//static不能修饰构造方法
	
	}

	public Static(int a ){
	
	}

	//内部类
	static class A{		/暂时不用了解
	}
	

}