package cn.itsource.day8.code;

class _02TestArrays{
	public static void main(String[] args) {
		int[] arr = {2,7,5,8,1,9,3,4,10};
		/*����
			static void sort(int[] a) 
            ��ָ���� int �����鰴��������������� 
		
		*/
		java.util.Arrays.sort(arr);
		/*
			static String toString(int[] a) 
          ����ָ���������ݵ��ַ�����ʾ��ʽ�� 
		
		*/
		String str = java.util.Arrays.toString(arr);
		System.out.println(str);

		/*
			static int binarySearch(int[] a, int key) 
          ʹ�ö���������������ָ���� int �����飬�Ի��ָ����ֵ�� 
			1.����ͬһ���ļ���
				��ȫ�޶��� ��·��+����
				java.util.Arrays
			2.û������
		*/
		int index = java.util.Arrays.binarySearch(arr,9);
		System.out.println(index);
	}
}
