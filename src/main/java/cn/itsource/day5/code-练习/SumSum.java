class SumSum {
	public static void main(String[] args) 
	{
		//��������ʼ��һ������int����i��sum��i����ִ��������sum����ͳ�ƽ��
		int i = 1,sum = 0;
		while(i <= 10){
			sum += i;	//sum = sum + i,ԭʼ��sum��ֵ����i��ֵ
			i++;
		}
		System.out.println("sum = " + sum);
	}
}
