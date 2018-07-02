package cn.itsource.day7.code;

class _08ErFenSouSuo{
	/*
		����һ������,���ö�������,��������������ָ��Ԫ�ص�,����λ��
	*/
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int index = getIndex(arr,10);
		System.out.println(index);
	}
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
