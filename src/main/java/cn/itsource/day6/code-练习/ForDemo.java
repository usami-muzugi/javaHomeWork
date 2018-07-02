public class ForDemo{

	public static void main(String[] args){
		/*

			for循环语法:
			for(循环初始化语句;循环判断语句;循环后语句){
				//循环功能语句
			}

			执行流程:
			A-----仅仅执行一次
			B----true----D---C
			........
			B-false
		
		*/

		//模仿while()写打印十句话
		for(int i  = 0;i < 10;i++){
			System.out.println("爱学习 " + i+"次");
		
		}


		//for循环的一些特别之处

		//s使用for()模仿while()循环
		int i = 0;
		for(;i<=10;){
			System.out.println("爱学习，爱生活");
			i++;
		}
		i = 0;

		//for()循环没有结构体
		for(i = 0;i<10;i++);

		//for(;;){
		//
		//}
		

	}
}