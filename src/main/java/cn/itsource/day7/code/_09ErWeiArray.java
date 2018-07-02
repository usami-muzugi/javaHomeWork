package cn.itsource.day7.code;

class _09ErWeiArray{
	//�����д����һά����,��������Ƕ�ά����
	public static void main(String[] args) {
		int[] ar1 = {1,2,3};//���������޶���,�洢�ռ���Դ�ֵ������
		int[] ar2 = {4,5,6};
		int[] ar3 = {7,8,9};

		//��ά����,��������һά����
		int[][] arr = {ar1,ar2,ar3};

		//��ά����ı���
		for(int i = 0;i<=arr.length-1;i++){
			//System.out.println(arr[i]);
			int[] temp = arr[i];//��ÿһ��,����������һά����,����һ����ʱ��һά����temp
			for(int j = 0;j<=temp.length-1;j++){
				System.out.print(temp[j]+" ");
			}
			System.out.println();
		}

		int[][] arr2 = {{25,26,27},{28,29,30},{15,16,17}};
		//   3 һ�������ά����ĳ���  2����һ�����ִ����е�һά����Ĵ洢�ռ�����
		int[][] arr3 = new int[3][2];
		//arr3[0] = ar1;
		//arr3[1] = ar1;
		//arr3[2] = ar1;

		arr3[1][1] = 15;
			
	}
}
