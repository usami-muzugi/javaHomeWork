class SumSum {
	public static void main(String[] args) 
	{
		//声明并初始化一个两个int变量i，sum。i用于执行自增，sum用于统计结果
		int i = 1,sum = 0;
		while(i <= 10){
			sum += i;	//sum = sum + i,原始的sum的值加上i的值
			i++;
		}
		System.out.println("sum = " + sum);
	}
}
