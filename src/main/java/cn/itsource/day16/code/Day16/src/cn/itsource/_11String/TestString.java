package cn.itsource.day16.code.Day16.src.cn.itsource._11String;

public class TestString {
	/*
	 * Sting������: ����Ԫģʽ������[Ԫ�ػ����������Թ���]
	 * 		����:
	 * 			1.String��Ϊ������ֵ,���Ի���ڳ�����
	 * 			2.Integer java��Ƶ�ʱ����Ѿ��������
	 * 		
	 * 		
	 * String str = "ABC"; ������ʽ��ֵ,�ͻὫ������������,����ڳ�������
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		String str = "ABC";
		String stt = "ABC";//��ֵ���鳣����,Ȼ�������,ֱ������
		
		System.out.println(str == stt);//�õĶ��ǳ���������Ķ���
		
		String sss = "CBA";
		
		String string = new String("ABC");//�����鳣����,ֱ�Ӵ�������
		System.out.println(string == str);
		
		//-----------------------------------------------------------
		String s1 = "A"+"BC";//ʹ�ó���ƴ��,���鳣����,����в��ᴴ��
		System.out.println(s1 == str);
		//ʹ�ñ���ƴ��,�����鳣����:��ֱ�Ӵ�������
		String s3 = new String("A");
		String s4 = new String("BC");
		String s5 = s3+s4;
		System.out.println(s5 == str);
		
		
		String s6 = "A";
		String s7 = "BC";
		String s8 = s6+s7;
		System.out.println(s8 == str);
//--------------------------------------------------
		System.out.println(str.equals(stt));//�õĶ��ǳ���������Ķ���
		System.out.println(string.equals(str));
		System.out.println(s1.equals(str));
		System.out.println(s5.equals(str));
		System.out.println(s8.equals(str));
		
		//ǿ��һ��,�Ƚ϶���Ӧ����equals
	}

}
