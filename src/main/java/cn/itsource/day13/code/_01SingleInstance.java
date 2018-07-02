package cn.itsource.day13.code;

class _01SingleInstance{
	/*
		���ʵ��֮����ģʽ
	*/
	public static void main(String[] args) {
		/*
		A a1 = A.instance;
		A a2 = A.instance;
		System.out.println(a1);
		System.out.println(a2);

		A.instance = null;
		System.out.println(A.instance);
		*/
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
			1.˽�л����й��췽��:   �ⲿ��Ҫ��㴴��
			2.��Ľṹ��,new A(),���ֶα�������
			3.ʵ���ֶ�[�Ǿ�̬�ֶ�] �ⲿ��Ҫ������ܷ���,���ǹ��췽���Ѿ�˽�л�,���Է��ʲ�����
			4.static�����ֶ�:����.�ֶ���
			5.�ֶ�Ӧ��˽�л�
			6.�Ƕ���,��ɹ����ṩ����,get ����
				����:ֻ��Ҫȡֵ�ṩget�ͺ���
				1.public :��Ҫ:�ṩ�����˷��ʵ�
				2.static : �Ǿ�̬����,���ö������
				3.����ֵ���� : A
				4.�����б� : ����Ҫ
				5.������,����ֵ return instance

		����:static A instance = new A();//�ֶ�
			1,�����ھ�̬����
			2,�ֽ����ļ����ص�JVM��ʱ��ִ�е�,������������ִ�е�

		����:ϵͳ������ʱ��,��һ���õ�����,���Ǿʹ���������!
			 ϵͳ��ʼ����ʱ���Ƚ���

		����취,������ʱ��Ҫ����,������Ҫ��ʱ��Ŵ���
*/
class A{

	private A(){
		System.out.println(" 8888888888888888  ");
	}
	private static A instance = new A();//�ֶ�:�����ò���,�ȸ��㴴������
	/*ѧϰ��̬������ʱ��д��
	static{
		instance = new A();
		//���Գ�ʼ������Ķ���...............
	}*/
	public static A getInstance(){
		return instance;
	}
}
