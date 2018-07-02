public class _02DaiMaKuaiEr extends DaiMaKuai{
	//代码块 AllInOne

	private final Integer i;	//finial修饰的字段如果不初始化会报错。see line 18

	//静态代码块
	static{
		//写在类的结构体的 static代码块		//加载！加载！加载！是加载！
		System.out.println("我是子类静态代码块");	
	}

	//构造代码块
	{
		//写在类的结构体的代码块
		//可以用来初始化成员字段
		//构造代码块会在构造方法中复制一份，！！
		//这里就理解了为什么执行了构造方法然后他并没有继续执行而是跳转到构造代码块那里去了
		System.out.println("我是子类构造代码块");
		i = 20;	//但是我在构造代码块中初始，他就能初始化。

	}

	public _02DaiMaKuaiEr(){
		System.out.println("我是子类构造方法");
	}

	@Override
	public void test(){
		System.out.println("我是子类普通重写方法");
	}

	public static void main(String[] args){

		_02DaiMaKuaiEr test1 = new _02DaiMaKuaiEr();
		_02DaiMaKuaiEr test2 = new _02DaiMaKuaiEr();
		_02DaiMaKuaiEr test3 = new _02DaiMaKuaiEr();
		_02DaiMaKuaiEr test4 = new _02DaiMaKuaiEr();
		_02DaiMaKuaiEr test5 = new _02DaiMaKuaiEr();


		/*
			执行流程:
			1.	result： 我是父类静态代码块
				new _02DaiMaKuaiEr()时，*加载了子类_02DaiMaKuaiEr类*，但是_02DaiMaKuaiEr类继承父类DaiMaKuai，
				所以执行子类构造方法之前，*加载父类DaiMaKuai类*并执行父类DaiMaKuai的构造方法。
				由于加载了父类DaiMaKuai类，所以执行父类静态代码块，打印result，父类静态代码块执行结束，跳转。来到子类静态代码块。
				*静态代码块用于加载，只执行一次！！*

			2.	result:	我是子类静态代码块
				因为加载了子类_02DaiMaKuaiEr类，所以执行子类静态代码块，打印子类静态代码块内容，执行结束，跳转。来到父类构造方法。
				*静态代码块用于加载，只执行一次！！*

			3.	result: 我是父类构造代码块
				子类继承父类，会优先加载父类构造方法，但是由于父类有构造代码块，所以会优先执行构造代码块，打印，执行结束，
				执行父类构造方法的语句，执行结束，跳转。来到子类构造方法。

			3. result：

		
		*/

		System.out.println("我是main方法");


		//代码块儿（写在方法体中的代码块儿）
		{
			//局部代码块儿，没有多大的意义
			//代码的执行流程还是顺序执行
			//一般结合if for 才有意义
			//注意作用域
			System.out.println("我是局部代码块儿");
		}
	}
}

class DaiMaKuai{
	

	//父类静态代码块
	static {
		System.out.println("我是父类静态代码块");	
	}

	//父类代码块
	{
		System.out.println("我是父类构造代码块");
	}

	//父类构造方法
	public DaiMaKuai(){
		System.out.println("我是父类构造方法");
	}
	
	//父类普通方法
	public void test(){
		System.out.println("我是父类普通方法");
	}
}