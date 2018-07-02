class Constructor{	//ConstructorTest.java:1: 错误: 类Constructor是公共的, 应在名为 Constructor.java 的文件中声明
	//如果一个类是公开的，public修饰的，需要编写在一个类名相同的.java文件中
	private String name;
	private int age;

	public Constructor(){	//无参构造方法 显示构造方法
		System.out.println("我是一个无参的构造方法");
	}
	
	public Constructor(String name){	//有参构造方法
		System.out.println("我是一个有参的构造方法");
		System.out.println(name + "打我呀！");
	}

	public void eat(){
		System.out.println("Constructor不能吃东西");
	}

	public void say(){
		System.out.println("Constructor想和你聊聊天");
	}

	public static void run(String name){	//静态方法
		System.out.println("和我走吧"+name+"小姐");
	}
}
public class ConstructorTest{
	public static void main(String[] args){
	
	Constructor constructor = new Constructor();	//当使用new关键字创建新对象是，会调用该类的对应的构造方法，这里调用的是无参构造方法
	Constructor constructor_2 = new Constructor("孤儿");	//当使用new关键字创建新对象是，会调用该类的对应的构造方法，这里调用的是有参构造方法	
	constructor.eat();	//类中非静态方法，需要 对象名.方法名()+ 参数列表 来使用
	constructor.say();	//类中非静态方法，需要 对象名.方法名()+ 参数列表 来使用
	constructor.run("董小姐");	//类中静态方法，可以 对象名.方法名()+ 参数列表 来使用
	Constructor.run("董小姐");	//类中静态方法，可以 类名.方法名()+ 参数列表 来使用

	}
}