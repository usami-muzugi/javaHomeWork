public class ForMianShi{
	public static void main(String[] args){
		
		/*
			1，最后i的值是	11
			2，判断了6次
			3，循环了5次
			4，上面的代码打印的值， 1，3，5，7，9
		*/
		for(int i = 1;i <=10; i +=2){	// i = 1,3,5,7,9 循环5次
			//执行判断 1，3，5，7，9，11	//判断6次
			System.out.println("i = "+i);
		}


		/*
			1，最后j的值是	13
			2，判断了5次
			3，循环了4次
			4，上面的代码打印的值， 2,5,8,11

				
				J	判断	循环	循环后
				1	1<=10	2		4
				4	4<=10	5		7
				7	7<=10	8		10
				10	10<=10	11		13
				13	GG		打印
				14

		*/
		
		
		for(int j = 1;j++<=10;j+=2){
			System.out.println("j = "+ j);
		}
	}
}