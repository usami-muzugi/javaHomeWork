public class ThisTest{
	/*
		What is this?
			this 是*持有当前对象地址*
			this 指代当前对象，*持有当前对象的地址*
		官方:this坐在的函数，正在被谁调用就指代谁
		民间:this当前被对象持有，this就指代谁， 模板----> 复印件

		this在设计类的时候使用，指代的是当前类的对象
	*/
	public static void main(String[] args){
		This th = new This();
		System.out.println(th);
		th.getAdd();

		System.out.println("--------滑稽的分割线---------");
		This th_1 = new This();
		System.out.println(th_1);
		th_1.getAdd();
	}
}

class This{
	//静态字段
	private String name;
	private int age;

	//getset方法
	public String getName(){
		return name;
	}

//	public void setName(String na){	//	na的作用域仅仅在setName方法里
//		name = na;	//成员变量name的作用域包括了setName方法，所以setName方法能取到成员变量name，于是形式参数na成功赋值给成员变量name
//	}

//	public void setName(String name){	//name的作用域仅在setName里
//		name = name;	//因为就近原则，所以这里是形参赋值给自己
//	}	//方法结束，局部变量销毁，并没有传值给 成员变量 name

	public void setName(String name){
		this.name = name;	//使用this关键字，指代当前对象的复印件的成员变量
	}

	public int getAge(){
		return age;
	}

//	public void setAge(int ag){
//		age = ag;
//	}

	public void setAge(int age){
		this.age = age;
	}

	public void getAdd(){
		System.out.println(this);
	}

//	public static void pr(){
//		System.out.println(this);	//所以说这个this，是对象级别的，非静态的 not static
//	}

	/*
	ThisTest.java:57: 错误: 无法从静态上下文中引用非静态 变量 this
                System.out.println(this);
                                   ^
	1 个错误
	*/

	public void print(){
		System.out.println("name ="+ this.name);
	}
}