package cn.itsource.day12.code;

class _04TestSuper{
	/*
		super��ʹ�ó���
			ǰ��:���ʸ���ķ�˽�еĳ�Ա
			1.���ʸ�����ֶμ���ͨ����
			2.������Ĺ��췽���ĵ�һ��,���ʸ���Ĺ��췽��
	*/
	public static void main(String[] args) {
		StudentUser stu = new StudentUser();
		stu.print("С����");
	}
}
class User{
	String name = "С����";//С�Ұ�
	void eat(){
		System.out.println("�԰Ұ�.......");
	}
	User(){
		System.out.println("������޲����Ĺ��췽��,�����˸�����޲����Ĺ��췽��");
	}
	User(String name){
		this.name = name;
		System.out.println("������޲����Ĺ��췽��,�����˸�����޲����Ĺ��췽��");
	}
}
class StudentUser extends User{//stu
	void print(String name){
		//1.���ʸ�����ֶμ���ͨ����
		System.out.println("super.name = "+super.name);//
		super.eat();
	}
	//���๹�췽���ĵ�һ����ø���Ĺ��췽��
	StudentUser(){
		//super();
		//���ø���Ĺ��췽��{ ���� }[��Ϊ�˴�,����һ������Ķ��� û�ж�������,������������������һ��]
		super("С�Ұ�");
	}
}
