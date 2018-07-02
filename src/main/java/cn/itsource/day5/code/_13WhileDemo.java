package cn.itsource.day5.code;class _13WhileDemo{
	/*
		��while�ļ��﷨
			while(x){//x:�������͵�ֵ,����,���ʽ
				//�������
			}
		ִ������:
			x:true  : 
				1.���뵽�������ڲ�ִ�����
				2.�ص�x�����ж�  ---true--->���뵽�������ڲ�ִ�����
				3.�ص�x�����ж�  ---true--->���뵽�������ڲ�ִ�����
				......
				�ص�x�����ж�  ---fasle ����ѭ��
			y:false:����ѭ��

		��while�ĳ��ýṹ:��ӡʮ�仰
			int i = 0;//ѭ����ʼ�����A
			while(i<=10){//ѭ���ж����B
				//�������C
				i++;//ѭ�������D
			}
			A--����ִ��һ��
			B-->true-->C-->D
			B-->true-->C-->D
			......
			B-->false����
	*/
	public static void main(String[] args) {
		//��while���﷨�ṹ
		//����:����ֵΪfalse��ʱ�������ͨ����
		boolean sta = true;
		/*
		while(sta){
			System.out.println("������������");
		}*/
		//����:true,�������ж�����:false  _13WhileDemo.java:24: ����: �޷����ʵ����
		/*
		while(false){
			System.out.println("����......");
		}*/
		//while����Ӧ�÷�ʽ
		int i = 0;//0 10
		while(i < 10){
			System.out.println(i + "=�氮ѧϰ");
			i++;
		}
	}
}
