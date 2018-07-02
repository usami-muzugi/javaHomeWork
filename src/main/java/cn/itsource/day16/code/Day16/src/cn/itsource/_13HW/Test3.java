package cn.itsource.day16.code.Day16.src.cn.itsource._13HW;

public class Test3 {
	/*
	 * дһ�γ��������1��1000����������Ȼ���ӡ�������Գ�������ʱ��
	 * 		����1~1000    3
	 * 		10k           193   
	 * 		10w           25714
	 * 		100w   
	 * 
	 *      �ַ���,ƴ��:�ַ��ǲ���ı��,ƴ�ӵĻ��ᴴ��һ���µĶ���
	 *		
	 *		����1~1000    1
	 * 		10k           7    
	 * 		10w           42
	 * 		100w          6226
	 *		
	 * */
	public static void main(String[] args) {
		print2(1000000);

	}
	static void print(int num){
		long start = System.currentTimeMillis();
		String str = "";
		for (int i = 1; i <= num; i++) {
			str+=i;
		}
		System.out.println(str);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	static void print2(int num){
		long start = System.currentTimeMillis();
		StringBuilder str = new StringBuilder();
		for (int i = 1; i <= num; i++) {
			str.append(""+i);
		}
		System.out.println(str);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
}
