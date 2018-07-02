class DoWhileDemo {
	public static void main(String[] args) 
	{
		//do...while 循环
		//先进入do的结构体，执行循环体，
		//然后会回到while进行判断，如果为true，则继续do结构体执行，如果为false，则跳出循环
		boolean flag = false;

		//do{
		//System.out.println("饿了么");
		//}while(flag);

		do{
		System.out.println("饿辣");	//这里还是会执行一次
		}while(flag);		//这里能直接使用false

		//while和do...while的总结

		//常量 fasle

		do{
		
		}while(false);   //accept


		//while(false){   //unsuccess
		//
		//}
	}
}
