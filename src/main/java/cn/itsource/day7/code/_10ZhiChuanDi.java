package cn.itsource.day7.code;

class _10ZhiChuanDi{
	/*
		������������
			ֵ����
			ֵ����
	*/
	public static void main(String[] args) {
		int i = 100;//��������������,�洢��ֵ�ı���
		int[] arr = {100};//��������������,������,���ֵ����[��ֵַ]
		System.out.println(i);//100
		System.out.println(arr[0]);//100

		change(i);//�������ֵ
		change(arr);//������ǵ�ֵַ
		
		System.out.println(i);//100
		System.out.println(arr[0]);//10
	}
	static void change(int i){
		i = 10;
	}
	static void change(int[] arr){
		arr[0] = 10;
	}


}
