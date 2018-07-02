class WenGuoYinNiuBi {
	public static void main(String[] args) 
	{
		test:for(int i = 1;i<=180;i++){
			if(i ==5) break test;
			System.out.println("培训第"+i+"天");
		}

		//求100以内前5个2的倍数
		String string = "100以内前5个2的倍数:"; //方法内的局部变量必须要用初始值，String的初始值为null。
		int sum = 0;
		for(int i = 1;i <= 100;i++){
			if(i%2 == 0){
				if(sum == 5 ) break;
				string += i + " ";
				sum++;
			}
		}
		System.out.println(string+"\n个数:"+sum+"个");
	}
}
