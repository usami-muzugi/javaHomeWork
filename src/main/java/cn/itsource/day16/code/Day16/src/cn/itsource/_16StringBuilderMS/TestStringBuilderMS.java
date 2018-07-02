package cn.itsource.day16.code.Day16.src.cn.itsource._16StringBuilderMS;

public class TestStringBuilderMS {
	/*
	 * ������
	 * 
	 * */
	public static void main(String[] args) {
		String s1 = "AAA";
		String s2 = "BBB";
		StringBuilder sb1 = new StringBuilder("KKK");
		StringBuilder sb2 = new StringBuilder("QQQ");

		System.out.println("ǰ--->"+s1);//AAA
		System.out.println("ǰ--->"+s2);//BBB
		System.out.println("ǰ--->"+sb1);//KKK
		System.out.println("ǰ--->"+sb2);//QQQ
		
		change(s1,s2,sb1,sb2);
		System.out.println("��--->"+s1);//AAA
		System.out.println("��--->"+s2);//BBB
		System.out.println("��--->"+sb1);//KKKYYY
		System.out.println("��--->"+sb2);//QQQZZZ
		
	}
	//��ʾ:String s1,String s2,StringBuilder sb1,StringBuilder sb2  : �ֲ�����
	static void change(String s1,String s2,StringBuilder sb1,StringBuilder sb2){
		s1 = "CCC";
		s2 = s2.concat("GGG");//һ���Ǵ������µĶ���
		sb1.append("YYY");
		sb2 = sb2.append("ZZZ");
		System.out.println("��--->"+s1);//CCC
		System.out.println("��--->"+s2);//BBBGGG
		System.out.println("��--->"+sb1);//KKKYYY
		System.out.println("��--->"+sb2);//QQQZZZ
		
	}

}
