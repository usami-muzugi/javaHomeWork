package cn.itsource.day9.code;

class _03TestConstuctor{
	/*
		���췽��������:[���췽��Ŀǰ��ʹ�÷�ʽ,��ͨ��new ����]
			��ʹ�ù��췽����������
			�ڴ��������ͬʱ,�������ʼ��ֵ

		���췽������Ҳ�Ƿ���,����дһ���Ĺ��������ɹ���

	*/
	public static void main(String[] args) {
		Person pson = new Person();//��������
		System.out.println(pson);
		pson.name = "ҫ��";
		pson.length = 168.0;
		System.out.println("����:"+pson.name+"  ,����:"+pson.length);

		//��
		Person pson1 = new Person("����",18);
		System.out.println("����:"+pson1.name+"  ,����:"+pson1.length);
	}
}
class Person{
	String name;
	double length;
	Person(){
	}
	Person(String s,int g){
		name = s;
		length = g;
	}
}
