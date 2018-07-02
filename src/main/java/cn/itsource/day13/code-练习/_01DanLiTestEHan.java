public class _01DanLiTestEHan{
	/*
		1.单列模式 【面试题】
			懒汉模式
		总结: 饿汉模式，就是调用获取对象的时候，不管三七二十一，我先给你new一个实例，保存在私有字段里面，然后你调用再给你
			  懒汉模式，就是调用获取对象的时候，我先不给你new一个实例，你要调用的时候，如果是初次调用我给你new一个实例，
			  传递给instance字段，然后返回给你，如果instance已经有了，说明你已经调用过了，我就直接给你返回一个实例

	*/
	public static void main(String[] args){
		DanLi.test();	//在使用DanLi类的方法或者变量的时候，就会调用一遍 构造方法
	}
}

//*实现* 单列模式 之 懒汉模式
class DanLi{

	//第一步
	//需要私有化所有构造方法
	//构造方法私有化
	private DanLi(){
		System.out.println("我是私有构造方法！");
	} 
	
	private static DanLi instance;


	//第二步，只有被调用的时候才会被调用
	public static DanLi getInstance(){
		if(instance ==null)		//初始化时instance是null的，如果判断到instance不是null，就是创建过了
			instance = new DanLi();	
		return instance;
	}

	//测试:测试执行一个类的静态方法是否只会访问一次构造方法
	public static void test(){
		System.out.println("Test Function");
	}

}