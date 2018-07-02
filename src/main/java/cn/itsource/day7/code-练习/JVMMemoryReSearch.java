public class JVMMemoryReSearch{

	public static void main(String[] args){
		/*
			数组JVM内存存储数据分析
			数组为引用数据类型

			JVM虚拟机

			栈:	凡是变量都是存在于栈中的，包括方法、常量(常量池)
			堆: 凡是引用数据本身都是存在于堆中。
		*/
		//数据类型[] 数组名 = new 数组类型[数组长度];
		int[] arr = new int[10];

		//int[] 就是一个数据类型
		//arr就是一个变量名

		System.out.println(arr);	//[I@15db9742	可以把这个看成一个引用内存地址

		/*
			设计一个方法求多个整数的和

		*/
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		arr[4] = 1;
		arr[5] = 1;
		arr[6] = 1;
		arr[7] = 1;
		arr[8] = 1;
		arr[9] = 1;

		getSum(arr);

	}

	public static void getSum(int[] arr){
		int sum = 0;
		//数组有一个属性length,可以拿到数组的长度
		for(int i = 0;i<arr.length;i++){
			sum += arr[i];
		}
		System.out.println("sum = "+sum);
	}
}