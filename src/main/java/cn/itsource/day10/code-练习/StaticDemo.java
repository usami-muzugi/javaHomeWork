public class StaticDemo{
	/*
		ѧϰstatic�ؼ���	����static�������ε�����
		static [�༶������η�]
		staticĿǰ��������
			1.����������ͨ����
			2.���������ֶ�
			3.���������ڲ���
			4.���������η����ڱ���
			5.���������ι��췽��
			6.�����������ⲿ��
	*/
	public static void main(String[] args){
		/*static*/ int i = 10;	//�Ƿ��ı��ʽ��static�������η�������
		System.out.println(i);
	}
	
}

class Static{
	//��̬����
	private static String string;	//static�����ֶ�



	//��̬����
	public static void method(){	//static������ͨ����
		System.out.println();
	}
	
	//���췽��
	public /*static*/ Static(){		//static�������ι��췽��
	
	}

	public Static(int a ){
	
	}

	//�ڲ���
	static class A{		/��ʱ�����˽�
	}
	

}