package cn.itsource.day12.code;

class _03TestSuper{
	/*
		����ʾ������super�ĸ���
			1.super��this����
			2.super�������д����˸���Ķ���,
			3.����this:���ǲ����и����ַ
	*/
	public static void main(String[] args) {
		StudentUser stu = new StudentUser();
		stu.print("С����");
	}
}
class User{
	String name = "С����";
}
class StudentUser extends User{
	String name = "С����";
	void print(String name){
		System.out.println("name = "+name);//С����
		System.out.println("this.name = "+this.name);//С����
		System.out.println("super.name = "+super.name);//С����
		System.out.println(this);
		//System.out.println(super);//����this:���ǲ����и����ַ
	}
}
