package cn.itsource.day12.code;

class _08TestDuoTai{
	/*
		��̬����ʱ������ʱ�ļ����������
			1.��������һ������,���าд�� 
				����ʱ:����ͨ��
				����ʱ:��������ʵ����,����ʱ�������Ѿ���д�ķ���[�ͽ�ԭ��]
			2.��������һ������,����û��
				����ʱ:����ͨ��
				����ʱ:��������ʵ����,������ʵ����û�и÷���,����������,ִ�е��Ǹ����еķ���
			3.������û��,������һ������
				����ʱ:����
				����ʱ:�޷�����,��Ϊ����û�������ֽ����ļ�
			4.�������඼û��:
				û��˼��!
			----------- ���涼��ʵ������[�Ǿ�̬�ķ���],������һ����̬����---------------------------------
			5.��̬����:�����ڸ�дһ˵
				���뿴��ʲô����,���õ�ʲô��������ľ�̬����
			6.�ֶ�û�и�дһ˵
			������
			1.ʵ�ʿ�����һ�㲻���������ж���һ���͸���ͬ�����ֶΣ�
			2.�������������������ڣ�
				1)�������ʱ���͸�������ͣ�ȡֵ�Ǹ��������ֶε�ֵ��
				2)�������ʱ������������ͣ�ȡֵ�����������ֶε�ֵ��
	*/
	public static void main(String[] args) {
		Animal aml = new Person();
		aml.eat();//��̬����:����֮���� ����.�������ڷ���
		System.out.println("aml.name="+aml.name);

		Person pson = new Person();
		pson.eat();
		System.out.println("pson.name="+pson.name);
	}
}
class Animal{
	static String name = "�����ֶ�";
	static void eat(){
		System.out.println("����");
	}
}
class Person extends Animal{
	static String name = "�����ֶ�";
	static void eat(){
		System.out.println("����");
	}
}