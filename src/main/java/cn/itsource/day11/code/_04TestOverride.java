package cn.itsource.day11.code;

class _04TestOverride{
	/*
		Ϊʲô��Ҫ������д:
			������ķ�������������������ʱ��,��Ҫ��д
	
	*/
	public static void main(String[] args) {
		Person pson = new Person();
		pson.move();
		YellowSnake ys = new YellowSnake();
		ys.move();

	}
}
class Animal{
	void move(){//�ƶ�����Ϊ
		System.out.println("�ƶ�.....");
	}
}
class Person extends Animal{//�߶�...
}
class YellowSnake extends Animal{//��...
}