package cn.itsource.day12.code;

class _06TestDuoTai{
	/*
		��̬:�������͵ı���,���Դ��������͵Ķ���,�Ķ��ֿ�����
	*/
	public static void main(String[] args) {
		//��������������,�޶��˱������Դ�ֵ������
		Animal aml = new Person();//���������Ǽ����������͵�
		Animal aml2 = new Pig();
	}
}
class Animal{
}
class Person extends Animal{
}
class Pig extends Animal{
}
