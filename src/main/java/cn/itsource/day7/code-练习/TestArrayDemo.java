public class TestArrayDemo{

	public static void main(String[] args){

		/*
		1.��̬��������
		int[] name; ��������
		name = new int[10];	��ʼ������

		2.�����ֵ��ȡֵ
		��ֵ
		������[����ֵ] = ֵ��
		
		����������Ǵ�0��ʼ��ֱ��.length-1λ��
		��ȡ���鳤��: ���������.length;
		
		ȡֵ
		������[����ֵ]
		*/
		int[] names = new int[5];
		System.out.println("names length = "+names.length);
		names[0] = 9;
		names[1] = 9;
		names[2] = 2;
		names[3] = 3;
		names[4] = 3;
		//�ֶ���ӡ
		System.out.println("names = " + names[0]+" "+names[1]+" "+names[2]+" "+names[3]+" "+names[4]);

		//��ָ������Ԫ�ظ�ֵ&�滻
		names[4] = 99233;

		//��ӡָ��Ԫ��
		System.out.println("names[4] = "+names[4]);



		//ʹ��forѭ����ѭ����ȡֵ
		for(int i = 0;i<names.length;i++){
			names[i] = i;
		}

		//ʹ��forѭ����ѭ��ȡֵ����ӡ
		for(int i = 0;i<names.length;i++){
			System.out.print("names = "+names[i]+" ");	
		}
		
		System.out.println();
		//ʹ����ǿ��forѭ��
		for(int index : names){
			System.out.print(index + " ");
		}

	}
}