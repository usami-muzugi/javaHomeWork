class SumOneToTen {
	public static void main(String[] args) 
	{
		//声明一个变量i并初始化为1，用于数字的增加.
		//声明一个变量indexVar,用于存放能被2整除的数。
		int i = 1,indexVar = 0;
		//执行循环10次，从1-10
		while(i<=10){
			if(i%2==0){		//如果i能够被2整除，执行判断语句
				indexVar += i;		//indexVar加上这个偶数值
			}
			i++;		//判断完成，执行自增
		}
		System.out.println("Sum = "+ indexVar);		//最终打印输出
	}
}
