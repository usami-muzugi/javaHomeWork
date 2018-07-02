package cn.itsource.day16.code.Day16.src.cn.itsource._14StringBulider;

public class TestStringBulider {
	/*
	 * �� ����ʾ�ַ����У������Ϊ�ַ�����
		CharSequence   ���ַ����еĽӿڣ�
		     |--- String
		     |----StringBuffer
		     |----StringBuilder
		�� ����
		String  :  ���Ķ���һ����������ôֵ�ͳ��Ⱦ͹̶�������
		StringBuffer   : ���Ķ��������ǿ��Ա��ı��;
		   ���̰߳�ȫ��
		   �汾��1.0
		StringBuilder  : ���Ķ��������ǿ��Ա��ı��;
		   ���̲߳���ȫ��
		   �汾�� 1.5
		   �൱��StringBufferЧ�ʸ���һ��
		   
		 1.String StringBuffer StringBulider  �⼸�������ǲ�һ����
		 2.StringBuffer StringBulider:ͨ��ѧϰ����һ��,����һ�ּ���һ��,�����̰߳�ȫ����
		 
		 
		 StringBuilder���췽��
		 	StringBuilder() 
			          ����һ�������κ��ַ����ַ��������������ʼ����Ϊ 16 ���ַ��� 
			          �ַ����ڲ���,һ���ַ������ڱ����ַ���
			         �̳е���һ���ַ�����char value[] ����16
			StringBuilder(int capacity) 
			          ����һ�������κ��ַ����ַ��������������ʼ������ capacity ����ָ���� 
			StringBuilder(String str) 
			          ����һ���ַ���������������ʼ��Ϊָ�����ַ������ݡ�
			StringBuilder(CharSequence seq) 
			          ����һ���ַ�������������������ָ���� CharSequence ��ͬ���ַ��� 
	 * */
	public static void main(String[] args) {
		//StringBuilder sb = "sb";
		StringBuilder stringBuilder = new StringBuilder();
		StringBuilder sb2 = new StringBuilder(50);//capacity�ڲ����鳤��
		System.out.println(sb2);
		StringBuilder stringBuilder2 = new StringBuilder("1234567890");
		System.out.println(stringBuilder2);
		
		String str = "6666";
		StringBuffer stringBuffer = new StringBuffer("999999");
		
		StringBuffer stringBuffer2 = new StringBuffer(str);
		StringBuffer stringBuffer3 = new StringBuffer(stringBuilder2);
		StringBuffer stringBuffer4 = new StringBuffer(stringBuffer);
		System.out.println(stringBuffer2);
		System.out.println(stringBuffer3);
		System.out.println(stringBuffer4);
	}

}
