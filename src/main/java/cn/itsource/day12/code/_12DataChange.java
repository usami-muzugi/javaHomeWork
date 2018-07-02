package cn.itsource.day12.code;

class _12DataChange{
	/*
		�����������͵�ת������
			1)��������ת�������ͣ�Сת��
				Cat cat = new TomCat();
				double d = 1;
			2)��������ת�������ͣ���תС
				TomCat  tc =(TomCat)cat; 

		ע������:��ת������֮ǰ,Ӧ��Ҫ�ж�����,ֻ������һ���˲�ת��
	*/
	public static void main(String[] args) {
		Cat cat = new TomCat();//cat�п����Ǳ��˴������,��Ϊ����װ����CoffeeCat
		/*
			����ֻ����������ֵ:ǿת�﷨û������:���벻�ᱨ��
			���з�Ӧ������ʵ����:��TomCatת����CoffeeCat
		*/
		//CoffeeCat cc = (CoffeeCat)cat;//Exception in thread "main" java.lang.ClassCastException: TomCat cannot be cast to CoffeeCat
		//cc.drink();


		/*
			��ת������֮ǰ,Ӧ��Ҫ�ж�����,ֻ������һ���˲�ת��

			�ж�����
				1.Object�еķ���:Class getClass()��ȡ����ʱ����
				2.�����ж������:instancof :�ж�������������
					ֵ instanceof ����
		*/
		//��ʽ��-----------------------------------------------
		String claName =  cat.getClass().getName();
		System.out.println(claName);
		if(claName.equals("CoffeeCat")){//�ȽϵĲ����������ַ������,������getClass();��Ҫѧ�˷��似��֮��
			CoffeeCat cc = (CoffeeCat)cat;
			cc.drink();
		}else{
			System.out.println("С���,�㴫������������");
		}
		//��ʽ��-----------------------------------------------
		if(cat instanceof CoffeeCat){
			CoffeeCat cc = (CoffeeCat)cat;
			cc.drink();
		}else{
			System.out.println("С���,�㴫������������");
		}

		TomCat tom = new TomCat();
		//instanceof�ж����͵�ע������
		System.out.println(cat instanceof TomCat);//true
		System.out.println(cat instanceof Cat);//true
		System.out.println(cat instanceof Object);//true
		System.out.println(cat instanceof CoffeeCat);//false
		//System.out.println(tom instanceof CoffeeCat);//TomCat CoffeeCat�����ڼ̳й�ϵ,ֻ������,û�пɱ���,��ȫ����ص�������
		//System.out.println(cat instanceof String);//String��cat�����ڼ̳й�ϵ,��ȫ����ص�������
		

	}
	
}
class Cat{//Animal
	void eat(){}
}
class TomCat extends Cat{//person
	void say(){
		System.out.println("����ѧϰ....");
	}
}
class CoffeeCat extends Cat{//pig
	void drink(){}
}

