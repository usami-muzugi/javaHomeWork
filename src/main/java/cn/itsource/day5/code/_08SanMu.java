package cn.itsource.day5.code;class _08SanMu{
	/*
		��Ŀ����:��Ԫ����[����Ԫ��]
		X ? Y : Z

		? �� : ��Ŀ������Ŷ���
		X:��һ���������͵�ֵ,�������߱��ʽ
		Y Z:һ��ֵ��������һ�µ�[y �� Z,������ֵ,�������߱��ʽ]

		�������:
		X:true    ��Ŀ������ʽ�Ľ������Y
		X:false   ��Ŀ������ʽ�Ľ������Z
	*/
	public static void main(String[] args) {
		System.out.println(false ? 10 : 20);
		//Y:��Z�Ľ��������һ�µ�;
		int sum = false ? 10 : 20;
		System.out.println(sum);
		//Y:��Z�Ľ�������ǲ�һ�µ�;���ʽ�Ľ��ֻ��ֱ��ʹ��,�����ñ�������,��Ϊֻ�����Ͳ���ֵ
		//String str = false ? "10" : 20;
		System.out.println(true ? "10" : 20);

	}
}
