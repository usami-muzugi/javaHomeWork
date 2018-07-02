package cn.itsource.day13.code;

class _02SingleInstance{
	/*
		���ʵ��֮����ģʽ
	*/
	public static void main(String[] args) {
		A a1 = A.getInstance();
		A a2 = A.getInstance();
		A a3 = A.getInstance();
		A a4 = A.getInstance();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
	}
}
/*
		���ʵ��֮����ģʽ
			1.��Ҫ��ʱ��ŲŴ�������
			2.�ڵ�һ�ε��õ�ʱ��Ŵ���,�Ժ�ʹ��,��������
			3.��ô�жϵ�һ��:
					instance == null
*/
class A{
	private A(){
		System.out.println("1234556777");
	}
	private static A instance;
	public static A getInstance(){
		if(instance == null){//��һ�βŴ���
			instance = new A();
		}
		return instance;
	}
}
