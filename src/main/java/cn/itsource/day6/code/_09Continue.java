package cn.itsource.day6.code;class _09Continue{
	/*
		continue  ��������ѭ����������һ��ѭ��

		��ǰ����:
	*/
	public static void main(String[] args) {
		for(int i = 1;i<=7;i++){
			if(i==4){
				continue;
			}
			System.out.println("ҫ�ĵĵ�"+i+"��");
		}

		for(int j = 1;j<=4;j++){
			System.out.println("��"+j+"��");
			for(int i = 1;i<=7;i++){
				if(i==4){
					continue;
				}
				System.out.println("ҫ�ĵĵ�"+i+"��");
			}
		}
	}
}
