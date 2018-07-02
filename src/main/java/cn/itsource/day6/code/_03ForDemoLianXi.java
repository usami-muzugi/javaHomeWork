package cn.itsource.day6.code;class _03ForDemoLianXi{
	/*
		1.��forѭ������1-10�� ��
			1.����1~10
			2.�ۼƻ�
			1*2*3*4.....*10
	*/
	public static void main(String[] args) {
		int ji = 1;
		for(int i = 1;i<=10;i++){
			//System.out.println(i);
			ji*=i;//ji = ji * i;
		}
		System.out.println(ji);
	}
}
