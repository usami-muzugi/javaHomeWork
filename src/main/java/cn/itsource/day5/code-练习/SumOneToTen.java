class SumOneToTen {
	public static void main(String[] args) 
	{
		//����һ������i����ʼ��Ϊ1���������ֵ�����.
		//����һ������indexVar,���ڴ���ܱ�2����������
		int i = 1,indexVar = 0;
		//ִ��ѭ��10�Σ���1-10
		while(i<=10){
			if(i%2==0){		//���i�ܹ���2������ִ���ж����
				indexVar += i;		//indexVar�������ż��ֵ
			}
			i++;		//�ж���ɣ�ִ������
		}
		System.out.println("Sum = "+ indexVar);		//���մ�ӡ���
	}
}
