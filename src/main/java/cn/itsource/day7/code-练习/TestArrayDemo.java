public class TestArrayDemo{

	public static void main(String[] args){

		/*
		1.动态数组声明
		int[] name; 声明数组
		name = new int[10];	初始化数组

		2.数组存值，取值
		存值
		数组名[索引值] = 值；
		
		数组的索引是从0开始，直到.length-1位置
		获取数组长度: 数组变量名.length;
		
		取值
		数组名[索引值]
		*/
		int[] names = new int[5];
		System.out.println("names length = "+names.length);
		names[0] = 9;
		names[1] = 9;
		names[2] = 2;
		names[3] = 3;
		names[4] = 3;
		//手动打印
		System.out.println("names = " + names[0]+" "+names[1]+" "+names[2]+" "+names[3]+" "+names[4]);

		//给指定数组元素赋值&替换
		names[4] = 99233;

		//打印指定元素
		System.out.println("names[4] = "+names[4]);



		//使用for循环来循环存取值
		for(int i = 0;i<names.length;i++){
			names[i] = i;
		}

		//使用for循环来循环取值并打印
		for(int i = 0;i<names.length;i++){
			System.out.print("names = "+names[i]+" ");	
		}
		
		System.out.println();
		//使用增强型for循环
		for(int index : names){
			System.out.print(index + " ");
		}

	}
}