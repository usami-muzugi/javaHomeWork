package cn.itsource.day10.code;class _04Test{
	/*
		�����ֶμ�������ʲô����
	*/
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.name = "����";
		System.out.println(stu1.name);

		Student stu2 = new Student();
		stu2.name = "ñ��";
		System.out.println(stu2.name);

		System.out.println(stu1.name);
	}

	static void add(){
		run();//3.��̬�����Ĳ�������ʷǾ�̬�ı���������
	}
	void run(){//�Ǿ�̬�����ķ��ʾ�̬�����ĵķ���
		add();
	}
}
class Student{
	static String name;
}
