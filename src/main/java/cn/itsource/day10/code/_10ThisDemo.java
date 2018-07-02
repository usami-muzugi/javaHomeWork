package cn.itsource.day10.code;class _10ThisDemo{
	/*
		this��һ��ʾ��
		this��ʲô?
			this:���е�ǰ����ĵ�ַ:
	*/
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("С��");
		System.out.println(stu.getName());

		Student stu1 = new Student();
		stu1.setName("С��");
		System.out.println(stu1.getName());


	}
}
class Student{//this:��������ʱ��ʹ��
	private String name;
	private int age;
	public void setName(String name){
		this.name = name;//this���е�ǰ����ĵ�ַ
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		age = age;
	}
	public int getAge(){
		return age;
	}
}
