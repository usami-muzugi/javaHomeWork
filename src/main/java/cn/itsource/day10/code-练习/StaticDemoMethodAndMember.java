public class StaticDemoMethodAndMember{
	/*
	
	*/
	public static void main(String[] args){

		//��̬�ֶεķ��ʷ�ʽ   ����.�ֶ���
		Student.name = "�����";
		System.out.println(Student.name);

		//��Ȼ�﷨���ԣ����Ƿ����빤�߿����ı��ʻ�������.�ֶ���
		Student student = new Student();
		student.name = "������󥵥�";
		System.out.println(student.name);

		//��̬���εķ����� ����.������ + �����б�
		Student.eat();
		student.eat();
		//Student.age = 100;	//������������ʷǾ�̬�ֶ�
		student.age = 100;
		System.out.println(student);
		student.run();
	}

}


class Student{
	//ʹ��static���εĳ�Ա����
	static String name;
	static void eat(){
		System.out.println("eat shit shit");
	}

	//ûʹ��static���εĳ�Ա����
	int age;
	void run(){		//���󼶱�	�߼���Ĳ���ʹ�õͼ���� static���εķ�����ֻ��ʹ��static���εķ����������Ƕ���.����()
		System.out.println("������");
	}
}