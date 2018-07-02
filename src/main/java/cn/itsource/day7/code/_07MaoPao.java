package cn.itsource.day7.code;

class _07MaoPao{

	public static void main(String[] args) {
		int[] arr = {35,38,33,31,4523,45,34,523,5,23,6,3,4,223,5,23,534};
		/*
		if(arr[0]>arr[1]){
			int temp = arr[0];
			arr[0] = arr[1];
			arr[1]= temp;
		}
		if(arr[1]>arr[2]){
			int temp = arr[1];
			arr[1] = arr[2];
			arr[2]= temp;
		}
		if(arr[2]>arr[3]){
			int temp = arr[2];
			arr[2] = arr[3];
			arr[3]= temp;
		}*/
		/*
		for(int i = 0;i < 3;i++){//0 1 2 //��һ�ֵıȽ����֮��
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1]= temp;
			}
		}
		for(int i = 0;i < 2;i++){//0 1 //�ڶ��ֵıȽ����֮��
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1]= temp;
			}
		}
		for(int i = 0;i < 1;i++){//0  //�����ֵıȽ����֮��
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1]= temp;
			}
		}*/
		//���������Ż�
		for(int j=0;j < arr.length - 1;j++){//���ƱȽϵ�����
												//3  2
			for(int i = 0;i < arr.length - 1 -j;i++){//ÿһ�ֵıȽ�,�ȽϵĴ���
				if(arr[i]>arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1]= temp;
				}
			}

		}

		//System.out.println(arr[3]);
		//System.out.println(arr[2]);

		//Ŀǰ,��ͬһ���ļ�����,������֮���ǿ����໥���ʵ�
		_06PrintlnArrays.print(arr);
	}
}
