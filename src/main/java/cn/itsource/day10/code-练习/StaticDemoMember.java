public class StaticDemoMember{
	/*
		static���ε��ֶΣ��Ǳ�����Ķ���������ģ�������
	*/
	public static void main(String[] args){
		Student student = new Student();
		student.name = "����";
		System.out.println(student.name);
		Student student2 = new Student();
		student2.name = "ññ";
		System.out.println(student2.name);
		Student student3 = new Student();
		student3.name = "����";
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