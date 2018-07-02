package cn.itsource.day10.code;class _03StaticDemo{
	/*
		�ֶμ���ͨ����:static����֮��ķ��ʷ�ʽ:ʹ�÷�ʽ
	
	*/
	public static void main(String[] args) {
		//��̬�ֶεķ��ʷ�ʽ:   ����.�ֶ���
		Student.name = "�Ͻ�";
		System.out.println(Student.name);
		//��Ȼ�﷨����,���Ƿ����빤�߿����ı���,������������.�ֶ�������
		Student stu = new Student();
		stu.name = "����";
		System.out.println(stu.name);

		//��̬���εķ���:����.������+�����б�
		Student.eat();
		//��Ȼ�﷨����,���Ƿ����빤�߿����ı���,������������.������+�����б�
		stu.eat();


		//���Ǿ�̬���ֶμ�����:
		//Student.age = "18";//������_03StaticDemo.java:22: ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� age
		stu.age = 18;
		System.out.println(stu.age);

		//Student.run();//_03StaticDemo.java:26: ����: �޷��Ӿ�̬�����������÷Ǿ�̬ ���� run()
		stu.run();
		

	}
}

class Student{
	static String name;
	static void eat(){
		System.out.println("��ѧϰ......");
	}

	int age;//���󼶱�
	void run(){//���󼶱�
		System.out.println("˳��.......");
	}
}
