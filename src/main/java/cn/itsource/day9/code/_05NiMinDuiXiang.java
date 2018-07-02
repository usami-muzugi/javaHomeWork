package cn.itsource.day9.code;

class _05NiMinDuiXiang{
	/*
		��������:
			1.����һ��û�б�����,���е�ֵַ,����������һ������
			2.������һ������,û�и��ö���ȡ����[ʹ�ñ�����,���иö���ĵ�ַ]

		��������ı���
			1.��������,���ʾ���һ������!
				1.����һ����ͨ�ķ���
			2.���ڶ�����һ�������ݵ���ʶ

			int i = 10;//  = ��ֵ����
			int  ��������   i������   10ֵ,���������

			Student stu = new Student();
			Student ��������   stu:����[������]  new Student()ֵ,�����һ������

				1.����������Ϊ������������
				2.��Ϊ����ֵ
			1,��������ʱ�ڶ��������,���������������û�������ı������øö���ĵ�ַ,����������ֻ��ʹ��һ��
			2,������������Ϊ�������ݵ�ʱ���,���ݶ��ǵ�ֵַ,�õ�ֵַ����������ı���,����,�����������ǿ��Զ��ʹ��
				
	*/
	Student st;
	public static void main(String[] args) {
		new Student();//��ʵ���� һ����������:�����ڶ��е�,����״̬:    ��������ʹ��һ��
		Student stu = new Student();//�ô�Ϊ�����ֵĶ���,��Ϊstu,���е�ַ
		//��.����һ����ͨ�ķ���
		new Student().eat();

		new Student().eat();
		
		int i = 10;
		run(i);
		
		run( new Student() );//��.����������Ϊ��������

		Student stu2 = run();
		System.out.println("stu2------>"+stu2);
	}
	static void run(int i){
		System.out.println("����������......");
	}
	static void run(Student stu){
	//	st = stu;//�������������,��ֵַ��������,���Զ��ʹ��
		System.out.println(stu +"  Student���͵Ĳ���������������");
	}
	static Student run(){
		System.out.println("����������Ϊ����ֵ");
		return new Student();//������������Ϊ����ֵ
	}
}
class Student{
	String name;
	int age;
	void eat(){
		System.out.println("������˹......");
	}
}
