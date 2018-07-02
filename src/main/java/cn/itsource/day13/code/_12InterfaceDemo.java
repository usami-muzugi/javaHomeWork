package cn.itsource.day13.code;

class _12InterfaceDemo{
	/*
		java�еĽӿ�:һ����������ƵĽṹ

		interface USB{
		}

		1.һ��Ҳ��д��һ��������.javaԭ�ļ���,��������ɶ������ֽ����ļ�
		2.�ӿ�������ʲô����[ �Ƚ�����Ľṹ��ʶ ]
			1.ȫ�ֳ����ֶ�public static final 
			2.ֻ���г��󷽷�,��������ͨ����
	*/
	public static void main(String[] args) {
		System.out.println(USB.i);
	}
}
interface USB{
	int i = 10;//Ĭ�Ͼ���public static final ����
	void eat();//Ĭ��abstract����
}
