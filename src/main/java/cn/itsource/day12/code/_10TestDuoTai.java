package cn.itsource.day12.code;

class _10TestDuoTai{
	/*
		��̬���ֵļ������

			��̬���ֵı���:Dog dog = new DGouGou();//�������ͼ�����������
			1.Dog dog = new DGouGou();
			2.������������
			3.�����ķ���ֵ[���],�������͵ķ���ֵ,һ�����ص���ָ����������!��һ��
			  �п��ܷ��ص����������͵Ķ���
	*/
	public static void main(String[] args) {
		Dog dog = new DGouGou();
		Person pson = new Person();

		pson.feetDog(dog);

		DGouGou dg = new DGouGou();

		pson.feetDog(dg);

		Dog ddg = getDog();
	}

	static Dog getDog(){
		return new DGouGou();
	}
}
class Person{
	//���ö�̬��д��
	void feetDog(Dog dog){
		dog.eat();
	}
}
class Dog{
	void eat(){
		System.out.println("����ʳ��");
	}
}
class DGouGou extends Dog{//�����һ����������
	void eat(){
		System.out.println("�󹷳�����....");
	}
}
class XGouGou extends Dog{
	void eat(){
		System.out.println("С����ţ��,�Ⱥ��....");
	}
}