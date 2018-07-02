package cn.itsource.day5.code;class _12SwitchDemo{
	/*
		switch(x){//x�� ��������һ�����ʽ:��ֵ������,java�涨������
			case �����Ŀ���ֵ1: �������;break; 
			case �����Ŀ���ֵ2: �������;break;
			case �����Ŀ���ֵ3: �������;break;
			........
			default:�������;break;
		}
		ִ������:
			���ݴ����xֵ,��case�н���ƥ��,���ƥ��ִ��,����break;����
			�����ƥ��:ִ��default;
	*/
	public static void main(String[] args) {
		/*
		int week = 50;//��ʾ����
		switch(week){
			case 1 :System.out.println("��ѧϰ");break;
			case 2 :System.out.println("ѧϰʹ�Ҹе�����");break;
			case 3 :System.out.println("ѧϰ����û����ô���ֹ�");break;
			case 4 :System.out.println("����־ͬ���ϵ���ҫ��");break;
			case 5 :System.out.println("��һ��");break;
			case 6 :System.out.println("ϴ��˯��");break;
			case 7 :System.out.println("һ�������Ҹ�����:�۷�");break;
			default:System.out.println("��������������");break;
		}*/


		/*
			switch��һЩ�������:
					1.ִ��˳�����������������е�caseֵ����ƥ��,�������ƥ��Ż�ִ��default
					2.case�����ֵӦ�úͱ���������һ��
					3.case��˳�򣨰���default�� ����������ģ����ǽ����Ȱ���case��ֵ�Ĵ�С˳������,default�����
					4.break�����ã�������ǰ�����switch�ṹ
						�١��ӵ�һ��ƥ���������ʼ������һ��break֮�������case�ж�ʧЧ 
						�ڡ���ִ�й������ʱ�������ĩβ��û��break,�Զ�������������ѭ����ȥ�� 
						�ۡ����һ��break ����ʡ�Ե������ǽ��黹��д��
		*/
		int week = 50;//��ʾ����
		switch(week){
			default:System.out.println("��������������");
			//case 3.14 :System.out.println("��һ��");break;
			case 1 :System.out.println("��ѧϰ");
			case 2 :System.out.println("ѧϰʹ�Ҹе�����");
			case 3 :System.out.println("ѧϰ����û����ô���ֹ�");break;
			case 4 :System.out.println("����־ͬ���ϵ���ҫ��");break;
			case 6 :System.out.println("ϴ��˯��");break;
			case 7 :System.out.println("һ�������Ҹ�����:�۷�");
			
			
		}
		//��5.������һ��break�����ṹ�ص�ʾ���������ﶬ�����ӣ�
		int mouth = 11;
		switch(mouth){
			case 1 : 
			case 2 : 
			case 3 : System.out.println("�������˺��˷�");break;
			case 4 : 
			case 5 : 
			case 6 : System.out.println("�������˸��˷�");break;
			case 7 : 
			case 8 : 
			case 9 : System.out.println("���������ջ�ļ���");break;
			case 10 : 
			case 11 : 
			case 12 : System.out.println("���������˴���û����ô�˷�");break;
		}

		//swithc֧���ַ���
		String name = "����";
		switch(name){
			case "����" : System.out.println("���Ʋ�ס�Լ�"); break;
			case "����" : System.out.println("����"); break;
		}
	}
}
