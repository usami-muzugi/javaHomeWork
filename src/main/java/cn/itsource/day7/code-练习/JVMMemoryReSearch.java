public class JVMMemoryReSearch{

	public static void main(String[] args){
		/*
			����JVM�ڴ�洢���ݷ���
			����Ϊ������������

			JVM�����

			ջ:	���Ǳ������Ǵ�����ջ�еģ���������������(������)
			��: �����������ݱ����Ǵ����ڶ��С�
		*/
		//��������[] ������ = new ��������[���鳤��];
		int[] arr = new int[10];

		//int[] ����һ����������
		//arr����һ��������

		System.out.println(arr);	//[I@15db9742	���԰��������һ�������ڴ��ַ

		/*
			���һ���������������ĺ�

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
		//������һ������length,�����õ�����ĳ���
		for(int i = 0;i<arr.length;i++){
			sum += arr[i];
		}
		System.out.println("sum = "+sum);
	}
}