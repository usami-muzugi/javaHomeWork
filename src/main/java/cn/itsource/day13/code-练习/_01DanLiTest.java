public class _01DanLiTest{
	/*
		1.单列模式 【面试题】
			单 :	一个
			列 :	Instance(实例)
			在一个应用之中，至多一个对象。
	*/
	public static void main(String[] args){
		DanLi.test();	//在使用DanLi类的方法或者变量的时候（被加载的时候），就会调用一遍 构造方法
		DanLi danli = DanLi.getInstance();
		System.out.println(danli);

		DanLi2 danli2 = new DanLi2();
		new DanLi2();
		new DanLi2();
		new DanLi2();
		
	}
}

class DanLi2{
	public DanLi2(){
		System.out.println("Test");	
	}


}

//*实现* 单列模式 之 饿汉模式
class DanLi{

	//第一步
	//需要私有化所有构造方法
	//构造方法私有化
	private DanLi(){
		System.out.println("我是私有构造方法！");
	} 
	
	//第二步
	//类的结构体中，new 一个单列，用字段保存起来
	static DanLi instance = new DanLi();
		
	//第三步
	//实例字段（变量非静态） 外部需要对象才能访问，但是构造方法已经私有化，不能访问
	//使用static修饰字段:可 类名.字段名

	public static DanLi getInstance(){
		return instance;
	}

	public static void test(){
		System.out.println("Test Function");
	}
}