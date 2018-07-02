package cn.itsource.day7.code;

class _03Test{
	/*
		����JVM�洢���ݷ���
			��Ϊ������������������

		JVM java�����:java���붼����������
			ջ:���Ǳ������Ǵ�����ջ�е�
			��:����new�����Ķ���,���ڶ���
	*/
	public static void main(String[] args) {
		//��������[] ������ = new ��������[���鳤��];
		int[] arr = new int[15];//new Int[10];�ڼ�����п�����������10�洢�ռ�
		/*
			int[] ����һ����������
			arr  ������
		*/
		System.out.println( arr );//[I@15db9742��ֵַ[ �����洢�ռ��һ����ַ���� ]
		arr[5] = 20;
		System.out.println(arr[5]);

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
		arr[10] = 1;
		arr[11] = 1;
		arr[12] = 1;
		arr[13] = 1;

		getSum(arr);
	}

	/*
		���һ������,���������ĺ�,
	*/
	static void getSum(int[] arr){
		int sum = 0;
		for(int i = 0;i<=arr.length-1;i++){
			sum+=arr[i];
		}
		System.out.println("sum = "+sum);
	}
}
