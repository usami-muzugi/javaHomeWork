package cn.itsource.day11.code.HW;

class _01TestEquals{
	/*
		�ٴθ�ϰequals
		�ѱ��񣺶�equals��ⲻ����
		1.�Ƚϵķ���:�Ƚ����������Ƿ����
		2.��ʵ:�ȽϾ�̬����
		3.Object ���� == ��ֵַ!  stu1.equals(stu2){ this == stu2 }
		4.��д
			���Ƶ�����,�޸ķ�����:��Ļ��������
			�������ı��˼�� ��ӡ��
	*/
	public static void main(String[] args) {
		Student stu1 = new Student("С��",18);
		Student stu2 = new Student("С��",18);
		boolean b = stu1.equals(stu2);
		System.out.println(b);
	}
}
class Student{//stu1
	String name;
	int age;
	Student(String name ,int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj){//�Ƚ϶���
		Student stu = (Student)obj;
		return this.name.equals(stu.name)&&this.age == stu.age;
	}
}
