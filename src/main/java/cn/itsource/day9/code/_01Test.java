package cn.itsource.day9.code;

class _01Test{
	//��������:����ģ��----->���Ƶ�һ�ݶ��Ƕ�����һ��
	public static void main(String[] args) {
		//��ʱ��ס: new ����();������һ��,������һ������:���� new Student();�����һ������
		new Student();
		//����ӡ���ľ�̬���Ը�ֵint[] arr = {};  arr.length;���������������������,length����
		new Student().name = "������";
		//����ֵ�ľ�̬����ȡ������
		System.out.println( new Student().name );

		//����,������������,ͨ���������е�ֵַ,�Ը��������͵������������...
		Student stu = new Student();
		System.out.println(stu);
		stu.name = "С�ܵ�";
		System.out.println(stu.name);
	
		Student stu2 = new Student();
		stu2.name = "С����";
		System.out.println(stu2.name);
		/*
			��û��static����:������.������+�����б�
			����static����:����.������+�����б�
			����ͬһ������:������+�����б�
		*/
		stu2.eat();
	}
}



//���ѧ����,ģ��
class Student{//ѧ����:     ����ѧ����һ�������---->ģ��
	String name;//��̬����:��������
	int age;//��̬����:��������
	void eat(){//��̬����:�����ĳԵ���Ϊ
		System.out.println("�Է�.....");
	}
}

