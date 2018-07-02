package cn.itsource.day11.code;

class _03TestExtends{
	/*
		���Լ��ɵ��ص�
			1.Java����ļ̳�ֻ�ܹ��ǵ��̳�:ֻ�ܼ̳�һ������
				һ������ֻ����һ���׵�
			2.����֧�ֶ��ؼ̳�:��Ӽ̳е�����,��Ӹ���
			3.ÿһ���඼��һ��ֱ�Ӹ���,���û�п�����ʾ�ļ̳д���,
			  ��ô����ʽ�̳о�Object
			  ���:�κ�һ����,��Ȼ����̳е�Object,Object�����εĸ���,����
			
	*/
	public static void main(String[] args) {
		Person posn = new Person();
		Person poss = Person.getPosn();
		posn.name = "�л���";
		System.out.println(posn.name);

		/*Class<?> getClass() 
          ���ش� Object ������ʱ�ࡣ */
		Class cla = posn.getClass();
		System.out.println(cla);

		/*String toString() 
          ���ظö�����ַ�����ʾ�� */
		String pos = posn.toString();
		System.out.println(pos);
		System.out.println(posn);
	}
}
class A extends Object{
	String name;
}
class B extends A{
}
class Animal extends B{
}
class Person extends Animal{//���ؼ̳� : person�̳���Animal  Animal�̳���B B�̳�A
	static Person getPosn(){
		return new Person();
	}
}
