package cn.itsource.day12.code;

class _15FinalDemo{
	/*
		Ϊ�˸��õ����final���α�����Ч��,ʾ��

			
	*/
	public static void main(String[] args) {
		final int i = 10;
		final Student stu = new Student();
		stu.name = "С���";
		stu.name = "�绨���";
		System.out.println(stu.name);

		stu = new Student();//_15FinalDemo.java:14: ����: �޷�Ϊ���ձ���stu����ֵ
	}
}
class Student{
	String name = "С���";
}
