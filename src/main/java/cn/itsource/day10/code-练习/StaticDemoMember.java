public class StaticDemoMember{
	/*
		static修饰的字段，是被该类的对象所共享的，包括类
	*/
	public static void main(String[] args){
		Student student = new Student();
		student.name = "绿绿";
		System.out.println(student.name);
		Student student2 = new Student();
		student2.name = "帽帽";
		System.out.println(student2.name);
		Student student3 = new Student();
		student3.name = "子子";
		System.out.println(student3.name);

		System.out.println("---------------");
		System.out.println(student.name);
		System.out.println(student2.name);
		System.out.println(student3.name);
		System.out.println(Student.name);
	}
}

class Student{
	static String name;
}