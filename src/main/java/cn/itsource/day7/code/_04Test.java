package cn.itsource.day7.code;

class _04Test{
	/*
		5.�����ص�
			1.���������޶���������Դ�ŵ��������� 
			2.һ��������Դ洢���Ԫ��
			3.һ������ [����] �������ã���ô�䳤�Ⱦ͹̶�������
			4��̬����������֮�󣬻��Զ�����Ĭ��ֵ���������е����������йأ�����֮ǰ��Ա������Ĭ��ֵ��
				�������������,���洢�ռ����Ĭ��ֵ

		��������[] ������ = new ��������[���鳤��];

		6.��������
			1.��������Խ�硾��������Щ�������ķ�Χ�����������鶼��һ��length���ԣ���
				0~length-1
			2.��ָ�����
			3.����з���ֵ����֪��returnд������
	*/
	public static void main(String[] args) {
		int[] arr = new int[11];
		
		arr[1] = 10;
		//1.
		//arr[2] = 18.0;
		System.out.println(arr.length);

		System.out.println(arr[5]);

		String[] str = new String[10];

		System.out.println(str[5]);

		//getSum(arr);//����Խ��Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 11

		int[] ar2 = null;//��ʾû��ָ��һ������������Ĵ洢�ռ�

		//getSum(ar2);//�����ڲ���code.length  ������null.length//Exception in thread "main" java.lang.NullPointerException
	
		int[] arr2 = getArrays(arr);//�˴�ʹ�õ���arr�ĵ�ֵַ�����˸÷���

		for(int i = 0;i <= arr2.length-1;i++){
			System.out.println("arr["+i+"] = "+arr2[i]);
		}
		//����������ǵ�ֵַ:�����ڲ��õĸ����صĵ�ֵַ��һ����:ָ�����ͬһ�������Ĵ洢�ռ�
		System.out.println("arr2��ַ: " +arr2);
		System.out.println("arr��ַ: " +arr);
	}
	static int[] getArrays(int[] arr){
		for(int i = 0;i <= arr.length-1;i++){
			//System.out.println(code[i]);
			arr[i] = 15;
		}
		return arr;
	}
	static void getSum(int[] code){
		for(int i = 0;i <= code.length;i++){
			System.out.println(code[i]);
		}
	}

	

}
