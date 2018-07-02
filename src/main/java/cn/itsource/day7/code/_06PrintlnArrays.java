package cn.itsource.day7.code;

class _06PrintlnArrays{
	/*
		Ҫ����һ������,��ӡ����Ҫ���ʽ[1,2,3,4,5]
			
	*/
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,43,5,234,5234,5,324,5,2345,234,523,4};
		print(arr);
	}
	//ʾ����,�������е�Ԫ��,ƴ�ӳ��ַ���,Ȼ��һ�δ�ӡ���
	static void print(int[] arr){
		String str = "[";
		for(int i = 0;i < arr.length;i++){
			if(i == arr.length-1){
				str+=arr[i]+"]";
			}else{
				str+=arr[i]+",";
			}
		}
		System.out.println(str);
	}
	//ʾ��2:���������ÿһ������,��ӡ����,���ո�ʽ[ֱ�Ӵ�ӡÿһ������]
	/*
	static void print(int[] arr){
		System.out.print("[");
		for(int i = 0;i <= arr.length-1;i++){//��������
			if(i == arr.length - 1){//�ж��Ƿ������һ��Ԫ��
				System.out.print(arr[i]+"]");//�����һ��Ԫ��,��ӡ���ݺ����]
			}else{
				System.out.print(arr[i]+",");//�м�Ԫ�� ��ӡ���ݺ����,
			}
		}
	}*/
	//ʾ��1
	/*
	static void print(int[] arr){
		System.out.println(arr);
	}*/
}
