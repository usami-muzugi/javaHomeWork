package cn.itsource.day5.code;class _07ErJinZhi{
	/*
		λ����:���������ݵ�����
		&    |    ^     ~    <<  >>>>>

		12+13
		 12
		+13
		-------------
		 25
		
		3&4 :&�������  1������true  0������false 
		 0000 0011
		&0000 0100
		----------------
		 0000 0000

		3|4 :|�������  1������true  0������false 
		 0000 0011
		&0000 0100
		----------------
		 0000 0111     7




	*/
	public static void main(String[] args) {
		System.out.println(3&4);
		System.out.println(3|4);
	}
}
