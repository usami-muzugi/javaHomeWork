package cn.itsource.day5.code;class _14WhileLianXi{
	/*
		1.дһ�δ������1-10�ĺ͡�
			�ٱ���1~10
			���õ�ֵ��,�ۼ�����
		2.���10����2�ı��������� �� ������
			�ٱ���0~10;ѭ��ȡ��ÿһ������
			��ȡ����ÿһ������
				�ж��Ƿ���2�ı���if
				��:�����ִ�ӡ����,
					���Ҽ���
					�ⲿ����һ������,����һ�����ı���,����һ��
		3.��� 1-10������ż���ĺ�
			�ٱ���0~10;ѭ��ȡ��ÿһ������
			��ȡ����ÿһ������
				�ж�ȡ���������Ƿ�Ϊ2�ı���
				��:
					�ۼ�
	*/
	public static void main(String[] args) {
		//��
		int k = 0;
		int num = 0;//�Լ����԰��������д��while�ڲ�
		while(k<=10){
			//int num = 0;//??????????????????????????????
			if(k%2==0){
				num+=k;
			}
			k++;
		}
		System.out.println("num="+num);
		//��
		int j = 0;
		int count = 0;
		while(j<=10){
			if(j%2==0){
				System.out.println("j="+j);
				count++;
			}
			j++;
		}
		System.out.println("count="+count);


		//��
		int i = 1;
		int sum = 0;
		while(i<=10){
			//System.out.println("i= "+i);
			sum+=i;//sum = sum + i;
			i++;
		}
		System.out.println("sum="+sum);
	}	
}
