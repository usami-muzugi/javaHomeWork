package cn.itsource.day6.code;class _07BreakDemo{
	/*
		4.1 break����ʾ��ֹ��ǰ����ѭ��
			��ֹ���ѭ��:
				�����ѭ��ȡ����,�ڲ�break ����
			��ֹѭ������û�н���
	*/
	public static void main(String[] args) {
		//��ֹ��ǰ����ѭ��
		test:for(int j = 1;j<=4;j++){
			System.out.println("------------------>���ǵ�"+j+"��");
			for(int i = 1;i<=7;i++){
				if(i == 4){
					break test;
				}
				System.out.println("һ��Լ�ĵ�"+i+"��");
			}
		}

		System.out.println("����....");
	}
}
