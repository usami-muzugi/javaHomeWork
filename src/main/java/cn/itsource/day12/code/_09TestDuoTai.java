package cn.itsource.day12.code;

class _09TestDuoTai{
	/*
		��̬���������Լ���������Ӧ��ʾ��[�ص�]
		��ι��ʾ��:��̬�ķ�����������
		��̬�ĺô�:�����˲�ͬ����֮���ʵ�ֲ���
	*/
	public static void main(String[] args) {
		//java��������˼��:ϣ��������ʵ������,���������֮��Ĺ�ϵ
		Dog dgg = new DGouGou();
		Dog xgg = new XGouGou();
		Person pson = new Person();
		pson.feetDog(xgg);
	}
}
class Person{
	//���ö�̬��д��
	void feetDog(Dog dog){//�������͵Ĳ���,�����������͵Ķ���
		dog.eat();
	}
	/*
	//û�в��ö�̬��д��
	void feetDGouGou(DGouGou dgg){
		dgg.eat();
	}
	void feetXGouGou(XGouGou xgg){
		xgg.eat();
	}*/
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