class DoWhileTest {
	public static void main(String[] args) 
	{

		//计算1-10的累加
		int i = 1,sum = 0;
		do{
			sum +=i;
			i++;
		}while(i < 11);  //因为会加到10，所以意思就是说在i等于11的时候不会执行do循环体语句
		System.out.println("Sum = " + sum);
	}
}
