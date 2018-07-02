public class DaXinXinDemo{
	public static void main(String[] args){
		//stop talk show me your code.
		for(int i = 1;i<=5;i++){
			for(int j = 1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------");

		for(int i = 1;i<=5;i++){
			for(int j = 0;j<=5-i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("----------");

		int length = 10;
		for(int i = 0;i<length;i++){
			for(int j = 0;j<length-i;j++){
				System.out.print(" ");
			}
			for(int k = 0;k <=i;k++){
				System.out.print(" *");
			}
			System.out.println();
		}

		System.out.println("----------");

		for(int i = 0;i<length;i++){
			for(int j = 0;j<=i;j++){
				System.out.print(" ");
			}
			for(int k = 0;k <length-i;k++){
				System.out.print(" *");
			}
			System.out.println();
		}

	}
}