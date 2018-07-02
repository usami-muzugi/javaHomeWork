package cn.itsource.day12.code;

class _02TestThis{
	public static void main(String[] args) {
		Student stu = new Student();
		stu.print();
		System.out.println(stu);


		Student stu2 = new Student("΢��",18);
		System.out.println("name = "+stu2.name+"     ,age = "+stu2.age);
	}
}
class Student{
	String name;
	int age;
	//this���췽��֮����໥����
	Student(String name){//����ǰ�����name�ֶθ�ֵ
		this.name = name;
	}
	Student(String name,int age){
		//this.name = name;//����ǰ�����name�ֶθ�ֵ
		//new Student(name);//�˴��Ǹ��´����Ķ���,��ֵ,���Ե�ǰ����û�и�ֵ��
		this(name);//ʹ���˹���,����û�д����µĶ����,���Ǹ���ǰ�Ķ���ֵ��[ super������;���� ]
		//��һ��ܳ�������[ this�����˹��췽��,����û�д�������]
		//���ǿ�����Ϊ�˴��Ǵ����˶����,���Ǵ����Ķ���û�ж����Ĵ��� �����뵱ǰ����������һ��
		this.age = age;
	}










	Student(){
	}
	void print(){
		System.out.println("this:="+this);//��ʾ���е�ǰ����ĵ�ַ
	}
}
