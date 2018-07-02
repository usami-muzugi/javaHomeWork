package cn.itsource.day12.code;

class _07TestDuoTai{
	/*
		��̬����ʱ,������ʱ��,����!
			Animal aml = new Person();
		����ʱ:��������ߵ�����[��������],�����ȵ�������Ͳ����Ƿ���ڸ�����,
			   ���������:����������,�ҵ��˱���ͨ��,�Ҳ������뱨��
		����ʱ:����ʱ�������ұߵ�����:����Լ��з���,ִ���Լ��ķ���,���û��������,ֱ��ֱ��Ϊֹ

		˼��:�в��п���,����ͨ��,�����Ҳ���?
	*/
	public static void main(String[] args) {
		Animal aml = new Person();
		aml.eat();
	}
}
class A{
	
}
class Animal extends A{
	void eat(){
		System.out.println("����ķ���");
	}
}
class Person extends Animal{
	
}
class Pig extends Animal{
}