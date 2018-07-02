package cn.itsource.day5.code;class _02ZiZeng{
	/*
		������ʾ
	*/
	public static void main(String[] args) {
		//����������������ڱ�������
		int i = 10;
		i++;//�����ڲ���ֵ��1
		System.out.println(i);
		++i;
		System.out.println(i);//12  11  12
		//������������ʽ�Ľ��,��ֵ����������
		int j = 10;

		int k = j++;//���ʽ:++���ұ�:���ʽ�Ľ��Ϊ:����ԭ����ֵ
		System.out.println("k--"+k);
		System.out.println("j--"+j);

		int r = 10;
		int f = ++r;//���ʽ:++�����:���ʽ�Ľ��Ϊ:Ϊ��������֮���ֵ,��Ϊ���ʽ�Ľ��
		System.out.println("r---"+r);
		System.out.println("f---"+f);

		//������������ʽ�Ľ��,��ֵ����������
		int e = 10;

		e = e++;//���ʽ:++���ұ�:
		System.out.println("e---"+e);//10

		e = ++e;//���ʽ:++���ұ�:
		System.out.println("e..."+e);//11


	}
}
