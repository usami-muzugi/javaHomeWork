public class NoNameObject{
	//�� ��Ϊ��ͨ����������  ��һ��
	//��	��Ϊ����ֵ������	��һ��
	//��	���þֲ�������������������� *�ɶ��* �����ڸ÷����ṹ�壬�������������ڽ����������������������ڽ���
	//	���ó�Ա�������������������  �ɶ��

	/*
		��������:
		����һ��û�б����������е�ֵַ������������һ������
		������һ������û�и��ö���ȡ���֡�ʹ�ñ����������иö���ĵ�ַ��

		��������ı���:
			1.�������󣬱��ʾ���һ������
				�� ����һ����ͨ����		������������Ϊ��ͨ����������
			int i = 10; int ��������

			2.���ڶ�����һ�����ݵ���ʶ
			i �������� 10 ֵ����������� = ��ֵ����

			Student student = new Student();
			Student �������ͣ� student ������[������]�� new Student() ֵ �����һ������

			�������������Ϊһ�����ݣ�Ҳ������Ϊһ�ݷ���ֵ
	*/

	static Student su;	//���þ�̬��Ա�������������������
	public static void main(String[] args){
	//��ʵ����һ���������󣬴����ڶ��е�,��������������״̬��	������ʹ��һ��
		new Student();	//Student.getInstance();
		new Student().eat();		//����һ����ͨ����Student.getInstance().eat();
		int i = 10;
		run(i);
		run(new Student());	//������������Ϊ��������	run(Student.getInstance());
		System.out.println(run());
		

		System.out.println("-----------");
		Student stu = new Student();
		stu.setName("usamimizugi");
		stu.setAge(81);
		System.out.println("name = "+ stu.getName()+"\tage ="+stu.getAge());

	}
	static void run(int i){
		System.out.println("������������");
	}
	static void run(Student student){
		 su = student;	//�۲��þֲ��������������������
		System.out.println(student + "Student���͵Ĳ���������������");
	}
	static Student run(){
		System.out.println("����������Ϊ����ֵ");
		return new Student();//����������Ϊ����ֵ
	}

}
class Student{

	//private Student(){} ����ʹ��new�ؼ�������ʼ��һ������

	String name;
	int age;

	void eat(){
		System.out.println("������˹");
	}
	public static Student getInstance(){	//��ȡ���󷽷�
		return new Student();	//����ʹ���������������һ������
	}

	public void setName(String n){
		name = n;
	}

	public String getName(){
		return name;
	}
	
	public void setAge(int a){
		age = a;
	}

	public int getAge(){
		return age;
	}
}