public class NoNameObject{
	//① 做为普通方法被调用  仅一次
	//②	作为参数值被调用	仅一次
	//③	采用局部变量持有这个匿名对象 *可多次* 作用于该方法结构体，当方法声明周期结束，该匿名对象生命周期结束
	//	采用成员变量持有这个匿名对象  可多次

	/*
		匿名对象:
		就是一个没有变量名，持有地址值，对其索引的一个对象
		创建了一个对象，没有给该对象取名字【使用变量名，持有该对象的地址】

		匿名对象的本质:
			1.匿名对象，本质就是一个对象！
				① 调用一次普通方法		①匿名对象作为普通方法被调用
			int i = 10; int 数据类型

			2.关于对象是一份数据的认识
			i 变量名， 10 值，具体的数据 = 赋值符号

			Student student = new Student();
			Student 数据类型， student 变量名[对象名]， new Student() 值 具体的一份数据

			匿名对象可以作为一份数据，也可以做为一份返回值
	*/

	static Student su;	//采用静态成员变量持有这个匿名对象
	public static void main(String[] args){
	//其实就是一个匿名对象，存在于堆中的,匿名对象是游离状态的	仅仅能使用一次
		new Student();	//Student.getInstance();
		new Student().eat();		//调用一次普通方法Student.getInstance().eat();
		int i = 10;
		run(i);
		run(new Student());	//②匿名对象作为参数传递	run(Student.getInstance());
		System.out.println(run());
		

		System.out.println("-----------");
		Student stu = new Student();
		stu.setName("usamimizugi");
		stu.setAge(81);
		System.out.println("name = "+ stu.getName()+"\tage ="+stu.getAge());

	}
	static void run(int i){
		System.out.println("被调用辣啊！");
	}
	static void run(Student student){
		 su = student;	//③采用局部变量持有这个匿名对象
		System.out.println(student + "Student类型的参数方法被调用了");
	}
	static Student run(){
		System.out.println("匿名对象作为返回值");
		return new Student();//匿名对象作为返回值
	}

}
class Student{

	//private Student(){} 不可使用new关键字来初始化一个对象

	String name;
	int age;

	void eat(){
		System.out.println("哈根达斯");
	}
	public static Student getInstance(){	//获取对象方法
		return new Student();	//可以使用这个方法来返回一个对象
	}

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}
	
	public void setAge(int a){
		age = a;
	}

	public int getAge(){
		return age;
	}
}