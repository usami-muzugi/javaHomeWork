public class _01DanLiTest{
	/*
		1.����ģʽ �������⡿
			�� :	һ��
			�� :	Instance(ʵ��)
			��һ��Ӧ��֮�У�����һ������
	*/
	public static void main(String[] args){
		DanLi.test();	//��ʹ��DanLi��ķ������߱�����ʱ�򣨱����ص�ʱ�򣩣��ͻ����һ�� ���췽��
		DanLi danli = DanLi.getInstance();
		System.out.println(danli);

		DanLi2 danli2 = new DanLi2();
		new DanLi2();
		new DanLi2();
		new DanLi2();
		
	}
}

class DanLi2{
	public DanLi2(){
		System.out.println("Test");	
	}


}

//*ʵ��* ����ģʽ ֮ ����ģʽ
class DanLi{

	//��һ��
	//��Ҫ˽�л����й��췽��
	//���췽��˽�л�
	private DanLi(){
		System.out.println("����˽�й��췽����");
	} 
	
	//�ڶ���
	//��Ľṹ���У�new һ�����У����ֶα�������
	static DanLi instance = new DanLi();
		
	//������
	//ʵ���ֶΣ������Ǿ�̬�� �ⲿ��Ҫ������ܷ��ʣ����ǹ��췽���Ѿ�˽�л������ܷ���
	//ʹ��static�����ֶ�:�� ����.�ֶ���

	public static DanLi getInstance(){
		return instance;
	}

	public static void test(){
		System.out.println("Test Function");
	}
}