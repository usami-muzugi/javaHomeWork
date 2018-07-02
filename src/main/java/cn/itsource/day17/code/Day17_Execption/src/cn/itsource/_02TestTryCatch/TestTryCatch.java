package cn.itsource.day17.code.Day17_Execption.src.cn.itsource._02TestTryCatch;

public class TestTryCatch {
	/*
	 * 
	 * �쳣�Լ�����
	 * 		try{
	 * 			���ܳ����쳣�Ĵ����
	 * 		}catch(�쳣����  ��ʽ����){//���catch�쳣��
	 * 			//�����쳣֮��Ҫ���Ĳ���
	 * 		}catch(�쳣���� ��ʽ����){
	 * 		}catch(){
	 * 		}catch(){
	 * 		}finally{
	 * 			�쳣����,һ����ִ�е��Ĵ���
	 * 			1.�ͷ�����Դ
	 * 			2.IO��,�ر�����Դ
	 * 			3.ע��:�������ǰ��ʵ����System.exit(0);finally��ִ�в���
	 * 		}
	 * */
	public static void main(String[] args) {
		//��finally  һ����ִ�е�
		try {
			
			System.out.println("sfdasdfasdfasdfasdfasdfsadfsad");
			System.out.println(1/0);
		} catch (Exception e) {
			System.exit(0);
		}finally{
			System.out.println("AAAAAAAAAAAAAAAAAAAAA");
		}
		//�۲���������,�쳣�����,����������������͵��쳣���ǿ��Բ����
		/*try {
			//System.out.println(1/0);
			int[] arr = null;
			System.out.println(arr.length);
		} catch (Exception e) {//�����˶�̬,����������,�쳣�����,����������������͵��쳣���ǿ��Բ����
			System.out.println("�쳣������");
		}*/
		//���쳣��,���Ը��ݲ������쳣����,����ԵĴ���
		/*try{
			
		}catch(ArithmeticException e){
			System.out.println("ArithmeticException");
		}catch(NullPointerException e){
			System.out.println("NullPointerException");
		}*/
		//����򵥵��﷨�ṹ
		/*try {
			System.out.println(1/0);
		} catch (ArithmeticException e) {
			System.out.println("���ArithmeticException����");
		}
		System.out.println("�ܹ�ִ�еõ�");*/

	}

}
