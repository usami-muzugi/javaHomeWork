class DoWhileTest {
	public static void main(String[] args) 
	{

		//����1-10���ۼ�
		int i = 1,sum = 0;
		do{
			sum +=i;
			i++;
		}while(i < 11);  //��Ϊ��ӵ�10��������˼����˵��i����11��ʱ�򲻻�ִ��doѭ�������
		System.out.println("Sum = " + sum);
	}
}
