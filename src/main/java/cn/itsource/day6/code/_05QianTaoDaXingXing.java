package cn.itsource.day6.code;class _05QianTaoDaXingXing{
	public static void main(String[] args) {
		/*
			*
			**
			***
			****
			*****
		*/
		/*
		for(int j = 0;j<5;j++){//����������
			for(int i = 0;i<= j;i++){//��������һ�д�ӡ�������
				System.out.print("*");
			}
			System.out.println();
		}*/

		/*
			*****
			****
			***
			**
			*
		*/
		for(int j = 0;j<5;j++){//����������
			for(int i = 0;i< 5-j;i++){//��������һ�д�ӡ�������
				System.out.print("*");
			}
			System.out.println();
		}
		/*
			        *
				   * *
				  * * *
				 * * * *
				* * * * *
		
		*/
		for(int j = 0;j<5;j++){//����������
			for(int k = 0;k < 4 - j;k++){//0 1 2 3
				System.out.print(" ");
			}
			for(int i = 0;i<= j;i++){//��������һ�д�ӡ�������
				System.out.print("* ");
			}
			System.out.println();
		}
		/*
			* * * * *
			 * * * *
			  * * *
			   * *
			    *
		*/
		for(int j = 0;j<5;j++){//����������
			for(int k = 0;k < j;k++){//0 1 2 3
				System.out.print(" ");
			}
			for(int i = 0;i< 5-j;i++){//��������һ�д�ӡ�������
				System.out.print("* ");
			}
			System.out.println();
		}


	}
}
