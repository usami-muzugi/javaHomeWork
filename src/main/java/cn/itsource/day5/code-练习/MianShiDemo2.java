class  MianShiDemo2{
	public static void main(String[] args) 
	{
		int i = 5;
		i++; //i = 6
		System.out.println(i); //6
		++i; //i = 7
		System.out.println(i); //7
		int a =++i; //a = 8, i = 8
		System.out.println(a); //8
		a = a++; //a = 8  //The Value Changed at 'a++' is never used
		System.out.println(a); //8
		a = ++a;
		System.out.println(a); //9
	}
}
