package cn.itsource.day11.code;

class _05TestOverride{
	/*
		��д�Ļ����﷨
			1.�����﷨:���Ƹ����еķ���,ճ����������,�޸ķ�����
			2.ע�⸲����,���д�����п��ܾͲ����ڸ�д,���ִ��������!̫��
			  ͨ��ע��@Override:д�ڷ���ͷ����,��֤�Ƿ��ڸ�д����
			3.ʲô��ע��
			  ע��:��ע�ͺ�����
			  ע��:������Ա����
			  ע��:��java���򿴵�
	
	*/
	public static void main(String[] args) {
		Person pson = new Person();
		pson.move();//����̳и���ķ���,����д,�ͽ�ԭ��,����ʹ������ķ���
		YellowSnake ys = new YellowSnake();
		//ys.move();
		ys.move();

	}
}
class Animal{
	void move(){//�ƶ�����Ϊ
		System.out.println("�ƶ�.....");
	}
}
class Person extends Animal{//�߶�...
	void move(){
		System.out.println("�߶�.....");
	}
}
class YellowSnake extends Animal{//��...
	//����д:���ڸ��ǿ���ͨ��ע����֤�Ƿ����ڸ�д
	@Override
	void move(){
		System.out.println("������...");
	}
}