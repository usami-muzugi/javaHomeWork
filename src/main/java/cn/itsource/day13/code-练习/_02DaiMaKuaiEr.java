public class _02DaiMaKuaiEr extends DaiMaKuai{
	//����� AllInOne

	private final Integer i;	//finial���ε��ֶ��������ʼ���ᱨ��see line 18

	//��̬�����
	static{
		//д����Ľṹ��� static�����		//���أ����أ����أ��Ǽ��أ�
		System.out.println("�������ྲ̬�����");	
	}

	//��������
	{
		//д����Ľṹ��Ĵ����
		//����������ʼ����Ա�ֶ�
		//����������ڹ��췽���и���һ�ݣ�����
		//����������Ϊʲôִ���˹��췽��Ȼ������û�м���ִ�ж�����ת��������������ȥ��
		System.out.println("�������๹������");
		i = 20;	//�������ڹ��������г�ʼ�������ܳ�ʼ����

	}

	public _02DaiMaKuaiEr(){
		System.out.println("�������๹�췽��");
	}

	@Override
	public void test(){
		System.out.println("����������ͨ��д����");
	}

	public static void main(String[] args){

		_02DaiMaKuaiEr test1 = new _02DaiMaKuaiEr();
		_02DaiMaKuaiEr test2 = new _02DaiMaKuaiEr();
		_02DaiMaKuaiEr test3 = new _02DaiMaKuaiEr();
		_02DaiMaKuaiEr test4 = new _02DaiMaKuaiEr();
		_02DaiMaKuaiEr test5 = new _02DaiMaKuaiEr();


		/*
			ִ������:
			1.	result�� ���Ǹ��ྲ̬�����
				new _02DaiMaKuaiEr()ʱ��*����������_02DaiMaKuaiEr��*������_02DaiMaKuaiEr��̳и���DaiMaKuai��
				����ִ�����๹�췽��֮ǰ��*���ظ���DaiMaKuai��*��ִ�и���DaiMaKuai�Ĺ��췽����
				���ڼ����˸���DaiMaKuai�࣬����ִ�и��ྲ̬����飬��ӡresult�����ྲ̬�����ִ�н�������ת���������ྲ̬����顣
				*��̬��������ڼ��أ�ִֻ��һ�Σ���*

			2.	result:	�������ྲ̬�����
				��Ϊ����������_02DaiMaKuaiEr�࣬����ִ�����ྲ̬����飬��ӡ���ྲ̬��������ݣ�ִ�н�������ת���������๹�췽����
				*��̬��������ڼ��أ�ִֻ��һ�Σ���*

			3.	result: ���Ǹ��๹������
				����̳и��࣬�����ȼ��ظ��๹�췽�����������ڸ����й������飬���Ի�����ִ�й������飬��ӡ��ִ�н�����
				ִ�и��๹�췽������䣬ִ�н�������ת���������๹�췽����

			3. result��

		
		*/

		System.out.println("����main����");


		//��������д�ڷ������еĴ�������
		{
			//�ֲ���������û�ж�������
			//�����ִ�����̻���˳��ִ��
			//һ����if for ��������
			//ע��������
			System.out.println("���Ǿֲ�������");
		}
	}
}

class DaiMaKuai{
	

	//���ྲ̬�����
	static {
		System.out.println("���Ǹ��ྲ̬�����");	
	}

	//��������
	{
		System.out.println("���Ǹ��๹������");
	}

	//���๹�췽��
	public DaiMaKuai(){
		System.out.println("���Ǹ��๹�췽��");
	}
	
	//������ͨ����
	public void test(){
		System.out.println("���Ǹ�����ͨ����");
	}
}