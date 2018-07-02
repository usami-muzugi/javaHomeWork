package cn.itsource.day10.code;class _09FengZhuang{
	/*
		��װ��ע������
			1)�ܷ��һ���ֶε�get ��set����д��һ������   
				i.����ȡ������ ����ֻ��ȡֵ��ʱ�򣬻���Ҫ����������ⲻ�ã�
			2)һ�����еĶ���ֶεĸ�ֵ���� д��һ������ 
				i.����ȡ  ��϶�̫��(��һ����ֻ���ĳһ���ֶθ�ֵ)

		��һְ��ԭ��:������С��:һ������һ������,��Ҫ��д��һ��
		
	*/
	public static void main(String[] args) {
		Student stu = new Student();
		String name = stu.setGetName("С����");
		System.out.println(name);

		String na = stu.setGetName("fsfsdfasd");
		System.out.println(na);

		stu.setNameAge("dada",18);
		System.out.println(stu.getName()+"     "+stu.getAge());
		stu.setNameAge("����",);
	}
}
class Student{
	private String name;
	private int age;
	public String setGetName(String s){
		name = s;
		return name;
	}
	public void setNameAge(String s ,int a){
		name = s;
		age = a;
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
