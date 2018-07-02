package cn.itsource.day7.code;

class _02ArrayDemo{
	/*
		�����ͬѧ������:

		����Ļ����﷨:

		1.��̬����֮������ͬʱ��ֵ
				�������� [] ������ = new ��������[���鳤��];
				int[] arr = new int[10];

		2.�����ʹ��:
			��ֵ: ������[����ֵ] = ֵ;
			ȡֵ: ������[����ֵ]

			�������:
	*/
	public static void main(String[] args) {
		int[] arr = new int[5];//������һ��int���͵�����,������Ϊarr,����Ϊ5
		
		arr[0] = 18;
		arr[1] = 19;
		arr[2] = 20;
		arr[3] = 21;
		arr[4] = 22;
		/*
		System.out.println(arr[0]+" "+arr[2]+" "+arr[1]+" "+arr[3]+" "+arr[4]);
		arr[4] = 55;
		System.out.println("arr[4]="+arr[4]);*/

		for(int i = 0;i <= 4;i++){
			System.out.println(arr[i]);
		}
	}
}
