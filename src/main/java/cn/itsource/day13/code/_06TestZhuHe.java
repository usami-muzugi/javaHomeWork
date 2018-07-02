package cn.itsource.day13.code;

class _06TestZhuHe{
	/*
		���һ���ֻ�,��ѯ�ֻ�����
	*/
	public static void main(String[] args) {
		//�������
		Card card = new Card("15988888888");
		CellPhone cp = new CellPhone(card);
		cp.showPhNum();
	}
}
class Card{
	String phNum;//�ֻ�����
	public String getPhNum(){
		return phNum; 
	}
	Card(String phNum){
		this.phNum = phNum;
	}
}
class CellPhone{
	Card card;
	CellPhone(Card card){
		this.card = card;
	}
	public void showPhNum(){
		String pN = this.card.getPhNum();
		System.out.println("����������:"+pN);
	}
	/*
	class Card{
		String phNum;//�ֻ�����
		public String getPhNum(){
			return phNum; 
		}
		Card(String phNum){
			this.phNum = phNum;
		}
	}
	*/
}
