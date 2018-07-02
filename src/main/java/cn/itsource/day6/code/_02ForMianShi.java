package cn.itsource.day6.code;class _02ForMianShi{
	public static void main(String[] args) {
		/*
			1.���i��ֵ�Ƕ��٣�  9          11
			2.�ж��˼��Σ�   5     6
			3.ѭ���˼��Σ�   4     5
			4.����Ĵ����ӡ��ֵ��1 3 5 7 9

			iֵ    �ж�     ѭ��    ��ӡֵ
			1      1        1       1
			3      2        2       3
			5      3        3       5
			7      4        4       7
			9      5        5       9
			11     6
		*/
		/*
		for(int i = 1;i<=10;i+=2){
			System.out.println("i="+i);
		}*/



		/*
			1.���i��ֵ�Ƕ��٣� 13    14     11   
			2.�ж��˼��Σ�  5    5
			3.ѭ���˼��Σ�  4    4
			4.����Ĵ����ӡ��ֵ��2 5 8 11 
			iֵ    �ж�     ѭ��    ��ӡֵ
			1      1        1       2
			4      2        2       5
			7      3        3       8
			10     4        4       11
			13     5
			14
		*/
		//
		for(int j = 1;j++<=10;j+=2){
			System.out.println("j="+j);
		}


	}
}
