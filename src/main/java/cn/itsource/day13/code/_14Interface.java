package cn.itsource.day13.code;

class _14Interface{
	/*
		�ӿ���ӿ�
			1.�ӿ���ӿ�֮��֧�ּ̳й�ϵ
			2.�ӿ���ӿ�֮��֧�ֶ�̳�[��������Ķ��ؼ̳�]
	*/
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
interface UB{
}
interface USB{
	void getLength();
}
interface US extends USB,UB{
	void eat();
}
class Crilce implements US{
	public void eat(){}
	public void getLength(){}
}
