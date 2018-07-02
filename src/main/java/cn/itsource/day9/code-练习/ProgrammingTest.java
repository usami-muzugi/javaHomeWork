class Programming{	//一个类就是java代码中最小的单位
	//在同一个文件夹中，如果有相同的类，最后的类会把之前编译的class文件覆盖掉
	//设计一个类来描述学生这一类的事物
	//构造方法	new Programming(); --> ()

	//成员变量 （字段）
	private String name;
	private int age;
	

	//构造方法
	//1.构造方法是和普通方法很类似的结构或代码块
	//2.构造方法也是方法，方法也能执行，完成功能
	//3.构造方法也该存在于类的结构体中
	//A.构造方法的方法名和类名一致，大小写都一致
	//B.构造方法没有返回值，普通方法有返回值
	//C.构造方法的内部没有返回值
	//D.构造方法可以有访问修饰符
	//E.构造方法可以有参数列表
	//F.有方法体
	//G.每个类都存在一个构造方法，如果没有显示的写出来，那么会有一个隐示的无参的构造方法
			//如果显示的构造方法写出来了，那么隐示的无参构造方法就不存在了
	//[访问修饰符]	[类名]	(参数列表){
	//}
	//目前对于构造方法的使用是用new关键字调用
	//new Programming();

	public Programming(){	//无参构造方法
		System.out.println("你来呀！");
	}

	public Programming(int a){
		System.out.println(a+"你来呀！");
	}

	//
	public void eat(){
		System.out.println("吃饭了");
	}
	public void run(){
	
	}
	public void sleep(){
	
	}
	public void say(){
		System.out.println("爱学习，爱生活");
	}

}

public class ProgrammingTest{
	public static void main(String[] args){
		//声明并初始化一个Programming类型的变量
		Programming programming = new Programming(1);	//你来呀！
		programming.eat();		//吃饭了
		programming.say();		//爱生活，爱学习
	}
}