public class JieCheng{
	//求1-10的阶乘
	public static void main(String[] args){
		//声明并初始化一个int类型的变量sum用于存储阶乘的值
		int sum = 1;
		for(int i = 1;i<=10;i++){	
			sum *=i;	//sum = sum * i;
		}
		System.out.println(sum);
		//result:3628800
	}
}