class Countinue {
	public static void main(String[] args) 
	{
		test:for(int i = 1;i<=180;i++){
			if(i ==5) break test;
			System.out.println("��ѵ��"+i+"��");
		}

		//��100����ǰ5��2�ı���
		String string = "100����ǰ5��2�ı���:"; //�����ڵľֲ���������Ҫ�ó�ʼֵ��String�ĳ�ʼֵΪnull��
		int sum = 0;
		for(int i = 1;i <= 100;i++){
			if(i%2 == 0){
				if(sum == 5 ) break;
				string += i + " ";
				sum++;
			}
		}
		System.out.println(string+"\n����:"+sum+"��");
	}
}
