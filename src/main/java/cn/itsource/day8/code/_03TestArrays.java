package cn.itsource.day8.code;

class _03TestArrays{
	/*
		Arrays�еķ���ʹ��
	*/
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		/*
			static int binarySearch(int[] a, int fromIndex, int toIndex, int key) 
          ʹ�ö���������������ָ���� int ������ķ�Χ���Ի��ָ����ֵ�� 
		*/
		int index = java.util.Arrays.binarySearch(arr,1,3,4);
		System.out.println(index);
		/*
			static int[] copyOf(int[] original, int newLength) 
          ����ָ�������飬��ȡ���� 0 ��䣨���б�Ҫ������ʹ��������ָ���ĳ��ȡ� 
		  ������������?
		*/
		int[] ar2 = java.util.Arrays.copyOf(arr,20);
		System.out.println( java.util.Arrays.toString(ar2)  );
		/*
		static int[] copyOfRange(int[] original, int from, int to) 
          ��ָ�������ָ����Χ���Ƶ�һ�������顣 
		*/


		/*
		static boolean equals(int[] a, int[] a2) 
          �������ָ���� int ������˴���ȣ��򷵻� true�� 
		*/
		int[] ar3 = {1,2};
		int[] ar4 = {1,2};
		System.out.println(   java.util.Arrays.equals(ar3,ar4)    );

		/*
			static void fill(int[] a, int val) 
          ��ָ���� int ֵ�����ָ�� int �������ÿ��Ԫ�ء� 
			static void fill(int[] a, int fromIndex, int toIndex, int val) 
          ��ָ���� int ֵ�����ָ�� int ������ָ����Χ�е�ÿ��Ԫ�� 

		*/
		java.util.Arrays.fill(arr,10);
		System.out.println( java.util.Arrays.toString(arr)  );

		/*
			static int hashCode(int[] a) 
          ����ָ����������ݷ��ع�ϣ�롣 ����һ���㷨,��ʱ���ù�����,֪�����ʹ�÷��������������
		*/
		int hashCode = java.util.Arrays.hashCode(arr);
		System.out.println(hashCode);

		/*
			static void sort(int[] a) 
          ��ָ���� int �����鰴��������������� 
			static void sort(int[] a, int fromIndex, int toIndex) 
          ��ָ�� int �������ָ����Χ����������������� 

		*/

	}
}
