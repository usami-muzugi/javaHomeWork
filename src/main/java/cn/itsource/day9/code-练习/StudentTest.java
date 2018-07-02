public class StudentTest{
	public static void main(String[] args){
		//使用new 关键字来创建一个学生对象
		new Student();		//每一份复制，都是独立的存在	使用new关键字在堆中开辟一块儿空间，再执行完之后被销毁
		//
		new Student().name = "渣渣文";	//使用new 关键字再堆内存中开辟一块内存空间，并将对象成员变量name复制为渣渣文，但是并没有将内存空间的内存地址给变量保存，于是再执行完复制name变量之后，执行下一条语句，被GC回收内存空间和销毁

		System.out.println(new Student().name);	//重新new一个Student对象，里面name还只是初始化，所以为null，这里与上面用的new的对象根本不是同一个对象
		
		Student student = new Student();	//使用new关键字再堆内存中开辟一块内存空间，并将内存地址赋值给该类型的变量（在栈中保存这个变量，变量存储的是内存空间的地址），用于执行之后的操作
		student.name ="小弟弟";	//将小弟弟赋值给对象的成员变量name
		System.out.println(student.name);	//调用student对象的成员变量name 成功显示 小弟弟

		Student student2 = new Student();
		student2.name ="小妹妹";
		System.out.println(student2.name);
		
		student.say();	//我是小弟弟	我今年0岁 类成员变量，在被new对象的时候，会初始化一个初始值
		student.age = 18;
		Student.say();	
		student.eat();	//方法的使用，没有static修饰， 对象.方法名()
		student.say();
		//语句执行结束，student 和 student2 的生命周期结束，被GC自动回收和销毁
		//没有static 对象名.方法名()+参数列表
		//有static修饰， 类名.方法名()+参数列表	对象.方法名()+参数列表
		//在同一个类中，方法名()+参数列表
	}
	//main()方法执行结束
}