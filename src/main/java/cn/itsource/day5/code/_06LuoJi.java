package cn.itsource.day5.code;class _06LuoJi{
	/*
		&[��]   |[��]   &&[˫�� �߼���]   ||[˫�� �߼���]  ^[���]   ��[��]
		���ֱȽ������ֻ����Ԫ�ز�������,����е���������һ���ж�!
		
		�߼������:��������ж�
		�����������������,���ǲ�������

		&:���ߵĽ����Ϊtrue ,�����߼�����Ľ��Ϊtrue,����Ϊfalse
			Ԭ��:��ҫ��
			Ԭ�� ��ҫ�� ����
			Ԭ�� ��ҫ�� ��ϸ
		|:���ߵĽ����һ��Ϊtrue ,���������Ϊtrue

		&&:���ߵĽ����Ϊtrue ,�����߼�����Ľ��Ϊtrue,����Ϊfalse
			��·��Ϊ:���ǰ�涼Ϊfalse ,����Ͳ���ִ����,û��Ҫ������
		||:���ߵĽ����һ��Ϊtrue ,���������Ϊtrue
			��·��Ϊ:���ǰ��Ϊtrue ,����Ͳ���������

	*/
	public static void main(String[] args) {
		int num = 3;//
		boolean result = num>2 & num<5;
		System.out.println(result);

		System.out.println(false | true);//true

		//System.out.println(true && 1/0==0);

		//System.out.println(false || 1/0==0);

		//^[���] �����ߵĽ����һ����ʱ��,���Ϊtrue
		System.out.println(false ^ false);
		System.out.println(true ^ false); //true
		System.out.println(true ^ true);//fasle

		//��[��]ȡ��
		System.out.println(!false);//true

	}
}
