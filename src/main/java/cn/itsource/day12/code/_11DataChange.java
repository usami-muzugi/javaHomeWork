package cn.itsource.day12.code;

class _11DataChange{
	/*
		�����������͵�ת������
	*/
	public static void main(String[] args) {
		//��̬���кô�,ʹ�ö�̬
		Cat cat = new TomCat();
		//cat.say();//û����,����ʱ��Cat����,�Ҳ�����Ӧ�����Ա���
		//����:֪��cat�����TomCat,����û����....[��ԭ��ʵ����]������Ҫ��������ת��
		TomCat tc = (TomCat)cat;
		tc.say();

		//Cat cat = getCat();
		//cat.say();

	}
	static Cat getCat(){
		return new TomCat();
	}
}
class Cat{
	void eat(){}
}
class TomCat extends Cat{
	void say(){
		System.out.println("����ѧϰ....");
	}
}
class CoffeeCat extends Cat{
	void drink(){}
}

