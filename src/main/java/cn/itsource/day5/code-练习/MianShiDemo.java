class  MianShiDemo{
	public static void main(String[] args) 
	{
		int i = 3;
		int a = i++ + i++ + i++; //a = 3 + 4 + 5; reslut:12
		int b  =++i + ++i + ++i; //b = 7 + 8 + 9; result:21
		System.out.println(i);   //result i = 9
		System.out.println(a);	 //result a = 12
		System.out.println(b);   //result b = 24
	}
}
