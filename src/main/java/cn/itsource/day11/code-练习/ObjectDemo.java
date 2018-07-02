public class ObjectDemo{

	/*
		测试:所有的对象，包含数组，都实现了Object类中的方法
		java已有的类	√
		自定义类		√
		数组			√
		基本数据类型	×
	*/
	public static void main(String[] args){
		String string = "梅西";

		int hashcode = string.hashCode();	//获取HashCode
		System.out.println(hashcode);

		//结论:String是java写好的类，自动继承Object类

		//自定义类
		Test test = new Test();
		hashcode = test.hashCode();

		System.out.println(hashcode);

		//数组
		int[] arr = {1,2,3,4};
		hashcode = arr.hashCode();
		System.out.println(hashcode);

		//基本数据类型
		int i = 1;
		//hashcode = i.hashCode();
		//对于基本数据类型，不是引用类型(不是对象)
		//所以不存在.xxx or .xxx() 来进行访问

		Integer integer = 1;	//包装类可以
		hashcode = integer.hashCode();
		System.out.println(hashcode);
		
		Class classTest = "内马尔".getClass();
		System.out.println(classTest);
		System.out.println(classTest.getName());

		string = "大污龟".getClass().getName().getClass().getName();

		System.out.println(string);
		
		string = test.getClass().getName();
		System.out.println(string);
	}
}

class Test{
	private String name;
	private Integer age;
}