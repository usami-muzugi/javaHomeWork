class ExtendsPerson {
	public static void main(String[] args) {
		Person meixi = new Person();
		meixi.setName("÷��");
		meixi.gg();
		meixi.move();
		meixi.suoha();
		System.out.println(meixi.move("÷��"));


		System.out.println();

		Person neimaer = new Person();
		neimaer.setNumber(8);
		neimaer.setName("�����");
		neimaer.say();

		Animal animal = new Animal();
		animal.setName("���");
		animal.suoha();
		System.out.println(animal.getName());
		



	}
}
class Animal{
	private String name;
	void say(){
		System.out.println("�󲼴ַ�");
	}

	//���෽��
	void move(){
		System.out.println("�ƶ�..");
	}

	String move(String string){
		return string;
	}

	//����getAndSet����
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
		
	public static void suoha(){
		System.out.println("����������������û����");
	}
}

class Person extends Animal {
	private int number;


	//getAndSet
	public void setNumber(Integer number){
		this.number = number;
	}

	public Integer getNumber(){
		return number;
	}

	@Override
	public String move(String string){
		return string+"��Ȼ����ɢ��";
	}


	//������д ��������
	@Override
	public void say(){
		 System.out.println("����"+getName()+",�Ҳ�������ǿ����ֻ������Ҫǿ");
	}

	public void gg(){
		System.out.println("����"+getName()+",�����ڻŵ�һ��");
	}

	public void move(){
		System.out.println("����"+getName()+",��ȫ��ɢ��");	
	}


	//@Override	//����ʵ�ָ��ǣ����ǲ��ǲ������Լ���
	public static void suoha(){
		System.out.println("Ӯ�˻�����ģ�������º��ɻ�");
	}

}

