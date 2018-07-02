package cn.itsource.day16.code.Day16.src.cn.itsource._19RandomCode;

import java.util.Random;

public class TestRandomCode {
	/*ʹ�������,���������֤��
	 * 		˼·:
	 * 		1.����һЩ����,Ȼ���ܹ������ȡ������Ϊ��֤��ķ���
	 * 		   String str = "qwertyuio@#$%^&*ZXCVBNMDFGHJK31767164181767268";
	 * 		2.�����������ȥ��������λ�õ��ַ�,ȡ����ƴ��һ��
	 * 		3.char charAt(int index)
	 * 		4.��������
	 * 			0 ~ str.length
	 * 
	 * 		Ҫ��ͬѧ��,��ȡ����,��������һ��intֵ������֤��ĳ���
	 * 		���ҷ�����֤��!Ȼ���ӡ
	 * 
	 * */
	
	public static void main(String[] args) {
		String code = getCode(4);
		System.out.println(code);
	}
	static String getCode(int num){
		String str = "qwertyuio@#$%^&*ZXCVBNMDFGHJK31767164181767268"; 
		Random random = new Random();
		String code = "";
		for (int i = 0; i < num; i++) {//�ڲ�����һ�и㶨
			int nextInt = random.nextInt(str.length());
			char charAt = str.charAt(nextInt);
			code+=charAt;
			//code+=str.charAt(random.nextInt( str.length() ));
		}
		return code;
	}
/*	static String str = "qwertyuio@#$%^&*ZXCVBNMDFGHJK31767164181767268"; 
	public static void main(String[] args) {
		Random random = new Random();
		String code = "";
		for(int i = 0;i < 6;i++){
			int nextInt = random.nextInt(str.length());
			char charAt = str.charAt(nextInt);
			code+=charAt;
		}
		System.out.println(code);	
	}
*/
}
