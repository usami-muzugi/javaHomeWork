public class ForDemo{

	public static void main(String[] args){
		/*

			forѭ���﷨:
			for(ѭ����ʼ�����;ѭ���ж����;ѭ�������){
				//ѭ���������
			}

			ִ������:
			A-----����ִ��һ��
			B----true----D---C
			........
			B-false
		
		*/

		//ģ��while()д��ӡʮ�仰
		for(int i  = 0;i < 10;i++){
			System.out.println("��ѧϰ " + i+"��");
		
		}


		//forѭ����һЩ�ر�֮��

		//sʹ��for()ģ��while()ѭ��
		int i = 0;
		for(;i<=10;){
			System.out.println("��ѧϰ��������");
			i++;
		}
		i = 0;

		//for()ѭ��û�нṹ��
		for(i = 0;i<10;i++);

		//for(;;){
		//
		//}
		

	}
}