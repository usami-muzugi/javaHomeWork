package cn.itsource.day6.code;class _10ContinueLianXi{
	/*
		�����1��20֮�����в��ܱ�3���������������ܺ�  ����(�����)100�ĵ�һ������
			�ٱ���1~20
			���ж�����ܱ�3����,��Ҫcontinue
			��������ܱ�3����,�ۼ�
			��ÿ�ۼ�һ��,�ж��Ƿ���ڵ���100,
			��������ڵ���break;
			��������
	*/
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1;i<=20;i++){
			if(i%3==0){
				continue;
			}
			sum+=i;
			if(sum>=100){
				break;
			}
		}
		System.out.println(sum);
	}
}
