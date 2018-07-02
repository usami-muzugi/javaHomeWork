public class ThisDemo{
	/*
		this 是蛤玩意儿
			this 是持有当前对象地址
			this 指代当前对象，持有当前对象的地址
		官方:this坐在的函数，正在被谁调用就指代谁
		民间:this当前被对象持有，this就指代谁， 模板----> 复印件
	*/
	public static void main(String[] args){
		This th = new This();
		th.setName("柴犬");
		System.out.println(th.getName());

		This th_1 = new This();
		th_1.setName("张财源是个孤儿");
		System.out.println(th_1.getName());


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

}