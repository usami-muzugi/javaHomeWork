public class JieCheng{
	//��1-10�Ľ׳�
	public static void main(String[] args){
		//��������ʼ��һ��int���͵ı���sum���ڴ洢�׳˵�ֵ
		int sum = 1;
		for(int i = 1;i<=10;i++){	
			sum *=i;	//sum = sum * i;
		}
		System.out.println(sum);
		//result:3628800
	}
}