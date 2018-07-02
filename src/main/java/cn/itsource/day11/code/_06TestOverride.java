package cn.itsource.day11.code;

class _06TestOverride{
	/*
		�����ĸ�д�﷨ϸ�ڣ�
			1)��֤���෽���͸��෽���ķ���ǩ��һ��;
				����ǩ��:��������+�����б�:Ҫ������б����͸���˳�򶼱���һ��
			2)����Ȩ�� : ���෽���ķ���Ȩ��(���η�)���ܹ��ȸ��෽���ķ���Ȩ�޸���;
				private < Ĭ�ϲ�д < protected < public 
			3)�����е�static���εķ���,�����಻�ܹ�����д 
			4)����ֵ���� : ���෽���ķ���ֵ���Ϳ����Ǹ��෽���ķ���ֵ���͵�����������
					�������:  int long����������,intҲ����long������
			5)�������� :  ������д,���෽���͸��෽�������Ƿ����һ��, ����! ����û��ʲôů��!
			
	
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
	long move(){//�ƶ�����Ϊ
		System.out.println("�ƶ�.....");
		//return null;//������������Ĭ��ֵ������null
		return 1L;
	}
}
class Person extends Animal{//�߶�...
	@Override
	long move(){
		System.out.println("�ƶ�.....");
		//return null;
		return 1;
	}
}
class YellowSnake extends Animal{//��...
}