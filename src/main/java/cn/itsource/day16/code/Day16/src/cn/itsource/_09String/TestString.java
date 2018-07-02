package cn.itsource.day16.code.Day16.src.cn.itsource._09String;

public class TestString {
	/* String��:   �ַ���(һ���ַ�,����ַ�)   ������   ����Ҫ,������Ҫѧϰ
	 * String str = "123456";
	 * 
	 * String ������ַ�����Java �����е������ַ�������ֵ���� "abc" ������Ϊ�����ʵ��ʵ�֡�
	 * 		"abc" ����String���һ������ 

		�ַ����ǳ��������ǵ�ֵ�ڴ���֮���ܸ��ġ�
			"123"  ���ַ����ǲ����Ըı��
			String strr = "GGGG";//�ַ�����,�ڶ���һ����������,���ɱ�
		�ַ���������֧�ֿɱ���ַ�������Ϊ String �����ǲ��ɱ�ģ����Կ��Թ������磺 
			Sting str = "ABC";//strջ��,�����һ��״̬
			str �ɱ�:ָ����ַ��������ַ���Ա仯
			str = "1234";
			//����
			String stt = str;
	 * 
	 * 	��ʶ�ַ������ʱ������˵��private final char value[];
	 * 		һ���ַ�,�����Ǳ�����,��һ��һ�����ַ�,�ŵ���String�����ڲ���һ��final���ε��ַ�����
	 * 		value ���ɸı�
	 * 		һ������һ����������֮��,���ܸı�
	 * */
	public static void main(String[] args) {
		String string = new String("123");
		System.out.println(string);

	}

}
