package cn.itsource.day11.code;

class _01TestExtends{
	/*
		���Ի����﷨,�Ƿ��ܹ��̳е����еĶ���
		˼��:�����ܹ��̳е����е�ʲô������?
	*/
	public static void main(String[] args) {
		Person pson = new Person();
		pson.name = "С��";
		System.out.println(pson.name);
		pson.move();
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
