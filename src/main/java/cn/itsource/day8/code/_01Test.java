package cn.itsource.day8.code;

class _01Test{//������,������һ��������,���������������
	public static void main(String[] args) {
		int[] arr = {2,7,5,8,1,9,3,4,10};
		ArraysTools.print(arr);
		ArraysTools.maoPao(arr);//�����ǶԿռ��ֵ�����˽���
		ArraysTools.print(arr);
		int index = ArraysTools.getIndex(arr,10);
		System.out.println(index);
	}
}
//������,�������������һ����
class ArraysTools{//��������ͬһ���ļ�����,�ǿ����໥���ʵ�,��̬��ͨ������.������+�����б�ʹ��
	//��ӡ����
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
	//����������  ����
	static void maoPao(int[] arr){
		for(int j=0;j < arr.length - 1;j++){//���ƱȽϵ�����
			for(int i = 0;i < arr.length - 1 -j;i++){//ÿһ�ֵıȽ�,�ȽϵĴ���
				if(arr[i]>arr[i+1]){
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1]= temp;
				}
			}

		}
	}
	//��������,�ҵ���ӦԪ�ص�����λ��
	static int getIndex(int[] arr,int ele){
		int minIndex = 0;
		int maxIndex = arr.length-1;
		int midIndex = (minIndex+maxIndex)/2;
		while(minIndex<=maxIndex){
			if(ele>arr[midIndex]){
				minIndex = midIndex+1;
			}else if(ele<arr[midIndex]){
				maxIndex = midIndex-1;
			}else{
				return midIndex;
			}
			midIndex = (minIndex+maxIndex)/2;
		}
		return -1;//����һ����ʶ,��ʶû��������
	}
}
