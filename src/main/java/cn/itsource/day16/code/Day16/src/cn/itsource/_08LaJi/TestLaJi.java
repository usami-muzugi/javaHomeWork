package cn.itsource.day16.code.Day16.src.cn.itsource._08LaJi;

public class TestLaJi {
	/*
	 * �������ջ���:
	 * 		java��ʲô������:������ʧȥ���õ�ʱ��,�ö���û���ô���,��������
	 * 		�������ջ���:java�������е��㷨,����������û�õĶ���
	 * 
	 * ��ô����Ч��:��ô����ʧȥ���õĶ��󱻻���
	 * 
	 * ��Object��finalize(),������,�������������յ�ʱ��,�������ĵ��ø÷���
	 * 
	 * */
	public static void main(String[] args) {
		/*Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		Integer i3 = new Integer(1);
		Integer i4 = new Integer(1);
		Integer i5 = new Integer(1);
		i1 = null;
		i2 = null;
		i3 = null;
		i4 = null;
		i5 = null;*/
		
		LaJi lj1 = new LaJi("ҫ��");
		LaJi lj2 = new LaJi("����");
		LaJi lj3 = new LaJi("С����");
		LaJi lj4 = new LaJi("����");
		LaJi lj5 = new LaJi("����");
		LaJi lj6 = new LaJi("Ԭ��");
		
		lj1 = null;
		lj2 = null;
		lj3 = null;
		lj4 = null;
		lj5 = null;
		lj6 = null;
		
		System.gc();

	}

}
