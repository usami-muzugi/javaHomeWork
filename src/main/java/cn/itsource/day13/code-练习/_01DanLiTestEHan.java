public class _01DanLiTestEHan{
	/*
		1.����ģʽ �������⡿
			����ģʽ
		�ܽ�: ����ģʽ�����ǵ��û�ȡ�����ʱ�򣬲������߶�ʮһ�����ȸ���newһ��ʵ����������˽���ֶ����棬Ȼ��������ٸ���
			  ����ģʽ�����ǵ��û�ȡ�����ʱ�����Ȳ�����newһ��ʵ������Ҫ���õ�ʱ������ǳ��ε����Ҹ���newһ��ʵ����
			  ���ݸ�instance�ֶΣ�Ȼ�󷵻ظ��㣬���instance�Ѿ����ˣ�˵�����Ѿ����ù��ˣ��Ҿ�ֱ�Ӹ��㷵��һ��ʵ��

	*/
	public static void main(String[] args){
		DanLi.test();	//��ʹ��DanLi��ķ������߱�����ʱ�򣬾ͻ����һ�� ���췽��
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
	
	private static DanLi instance;


	//�ڶ�����ֻ�б����õ�ʱ��Żᱻ����
	public static DanLi getInstance(){
		if(instance ==null)		//��ʼ��ʱinstance��null�ģ�����жϵ�instance����null�����Ǵ�������
			instance = new DanLi();	
		return instance;
	}

	//����:����ִ��һ����ľ�̬�����Ƿ�ֻ�����һ�ι��췽��
	public static void test(){
		System.out.println("Test Function");
	}

}