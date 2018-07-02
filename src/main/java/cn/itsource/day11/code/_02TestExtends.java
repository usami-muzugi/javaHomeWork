package cn.itsource.day11.code;

class _02TestExtends{
	/*
		�����ܹ��̳е������е�ʲô����?
		1.�̳п���:���ܸ�Ȩ���й�ϵ private <Ĭ�ϲ�д< protected <public   ֻ�����Լ����з���
		2.������˽�еĳ�Ա���ʲ���!

			��˽���ֶ�:���Լ̳е�
			��˽����ͨ����:���Լ̳е�

			���췽��:���ܼ̳е�:java�涨
			�ڲ���:����

		3.�������Ҳ�ǿ��Լ̳е���
	*/
	public static void main(String[] args) {
		Person pson = new Person();
		pson.name = "С��";
		System.out.println(pson.name);
		pson.move();

		MyFrame mf = new MyFrame();
		mf.setSize(500,500);
		mf.setLocationRelativeTo(null);
		mf.setVisible(true);


	}
}
class Animal{
	String name;
	void move(){
		System.out.println("�������ҵĶ�...");
	}
}
class Person extends Animal{
	
}
//java.awt.Frame:���㴰����
class MyFrame extends java.awt.Frame{
}