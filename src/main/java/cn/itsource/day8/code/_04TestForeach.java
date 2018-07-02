package cn.itsource.day8.code;

class _04TestForeach{
	/*
		for(Դ��Ԫ������ e  �� Դ ){
			ֱ��ʹ��e�Ϳ�����
		}
		Դ �� ������������߼��ϣ�Iterable�ӿڵ�ʵ���ࣩ
		e  :   ��ʽ����,ÿ�δ�Դ�б���������,����ʱ���������,������ѭ���ڲ�,ͨ��eʹ�õ�ÿһ��Ԫ��
		int[] arr = {1,2,3,4,5,6};


		ȱ��:û������,���Բ��ܾ���Ĳ���ĳһ���洢�ռ�
	*/
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		for(int e:arr){
			System.out.println(e);
		}

		int[][] ar2 ={{1,2,3},{4,5,6},{7,8,9}};
		for(int[] e :ar2){
			//System.out.println(e);
			int[] ar3 = e;
			for(int i:ar3){
				System.out.print(i+",");
			}
			System.out.println();
		}
	}
}
