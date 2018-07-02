package cn.itsource.day16.code.Day16.src.cn.itsource._03Auto;

public class TestAuto {
	/*
	 * ��װ����Զ�װ�����
	 * 	װ��:��һ��������������,��ֵ��һ����װ���͵Ĺ���
	 * 	����:��һ����װ����,��Ϊ������������ʹ�õĹ���
	 * 
	 * 	�Զ�����,װ��!java1.5���Բ�֧�ֵ�
	 * 	�Զ�����,װ��ֻ֧�ֶ�Ӧ����������
	 * 	Integer i1 = 10;
	 * 	Double d = 10;
	 * */
	public static void main(String[] args) {
		//�ֶ�װ��
		Integer i1 = new Integer(10);
		//�Զ�װ��
		Integer i2 = 10;//���ڰ�װ��,java�ṩ�Ļ���
		Integer i3 = 10;//���ڰ�װ��,java�ṩ�Ļ���
		
		/*
		 * ��������������,�޶��������Դ�ֵ������
		 * 
		 * �Զ�����ת��
		 * ��̬ Animal aml = new Person();//�������ͼ�����������
		 * ��װ��,�Զ�װ��
		 * */
		System.out.println(i2+i3);
		int i = i2;
		//Double d = 10;
	}

}
