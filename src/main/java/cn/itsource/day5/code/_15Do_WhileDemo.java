package cn.itsource.day5.code;class _15Do_WhileDemo{
	/*
		�ټ��﷨�ṹ
			do{
				// ѭ����
			}while(����);
			ִ��˳��:
				����do�ṹ��,ִ��ѭ����
				while�ж�----true---->����do�ṹ��,ִ��ѭ����
				while�ж�----true---->����do�ṹ��,ִ��ѭ����
				while�ж�----true---->����do�ṹ��,ִ��ѭ����
				......
				while�ж�----false,����ѭ��
		��do-while�ĳ���Ӧ�÷�ʽ
			int i = 0;//ѭ����ʼ�����A
			do{
				ѭ���������C
				i++;//ѭ�������D
			}while(x);//ѭ���ж����B
			A--����ִ��һ��
			C-->D-->B---true
			C-->D-->B---true
			C-->D-->B---true
			.......
			C-->D-->B---false����

			��ӡʮ�仰
	*/
	public static void main(String[] args) {
		//�ټ��﷨�ṹ
		//����:һ��������һ��[ Ŀǰ��� ]
			boolean rse = false;
			do{
				System.out.println("����û?");
			}while(rse);
			

			//while��do-while������:
			while(rse){
				System.out.println("�����ֻ���?");
			}
		//����
			do{
				System.out.println("���˳Ա㵱");
			}while(false);
			/*
			while(false){
			}*/

			//��do-while�ĳ���Ӧ�÷�ʽ:��ӡʮ�仰
			int i = 0;
			do{
				System.out.println(i+" ���ϳԼ�");
				i++;
			}while(i<=10);
			
	}
}
