public class StaticDemoMethodAndMember{
	/*
	
	*/
	public static void main(String[] args){

		//静态字段的访问方式   类名.字段名
		Student.name = "ダリン";
		System.out.println(Student.name);

		//虽然语法可以，但是反编译工具看到的本质还是类名.字段名
		Student student = new Student();
		student.name = "オウリンサマ";
		System.out.println(student.name);

		//静态修饰的方法： 类名.方法名 + 参数列表
		Student.eat();
		student.eat();
		//Student.age = 100;	//报错，不允许访问非静态字段
		student.age = 100;
		System.out.println(student);
		student.run();
	}

}


class Student{
	//使用static修饰的成员变量
	static String name;
	static void eat(){
		System.out.println("eat shit shit");
	}

	//没使用static修饰的成员变量
	int age;
	void run(){		//对象级别	高级别的不能使用低级别的 static修饰的方法，只能使用static修饰的方法？或者是对象.方法()
		System.out.println("吃翔翔");
	}
}