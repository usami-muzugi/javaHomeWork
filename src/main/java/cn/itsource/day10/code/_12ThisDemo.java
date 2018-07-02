package cn.itsource.day10.code;class _12ThisDemo{
	/*
		this ��ʹ�ó���:��������ʱ��ʹ��
			1.����ֲ������ͳ�Ա�����Ķ�����   ---  get  set �����е�Ӧ��[��get/set����дthis]
			2.��Ϊ����ֵ����  �� this���ж����ַ����ʾ�����һ��������һ������
			3.��Ϊ��������  
			4.�����й��췽��֮��Ĺ�,�췽���еĵ�һ���໥���� 
				
	
	*/
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("С��");

		Student st1 = stu.getStu();
		System.out.println("stu1-->"+st1);
		System.out.println("stu-->"+stu);

		//���ĵ�this��ʹ�ò���
		Student stu3 = new Student ("����",56);
		System.out.println(stu3.getName());
		System.out.println(stu3.getAge());

	}
	/*
	Student getStu(){//�˴�this��Student��ƥ��
		return this;
	}*/
}
class Student{
	private String name;
	private int age;
	//���ܾ��Ǵ��������ʱ���name��ֵ:����new�ù��췽���ǻᴴ��һ�������
	Student(String name){
		this.name = name;
	}
	//���ܾ��Ǵ��������ʱ���name��age��ֵ:����new�ù��췽���ǻᴴ��һ�������
	Student(String name,int age){
		//this.name = name;//��ֵ
		//new Student(name);//������һ���µĶ���
		//�����ڵ��ø����е�String���͵Ĺ��췽��:���ᴴ���µĶ���,���Ǹ���ǰ������ֶθ�ֵ
		this(name);//4.
		this.age = age;
		
	}
//---------------------------------------------------------------------------
	Student(){
	}
	public void setName(String name){//1.
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	Student getStu(){//2.
		pr(this);//3.
		return this;
	}
	void pr(Student stu){
		System.out.println("Сǿ��ô��......");
	}
}
