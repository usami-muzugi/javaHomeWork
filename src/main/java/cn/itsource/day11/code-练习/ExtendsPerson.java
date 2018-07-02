class ExtendsPerson {
	public static void main(String[] args) {
		Person meixi = new Person();
		meixi.setName("梅西");
		meixi.gg();
		meixi.move();
		meixi.suoha();
		System.out.println(meixi.move("梅西"));


		System.out.println();

		Person neimaer = new Person();
		neimaer.setNumber(8);
		neimaer.setName("内马尔");
		neimaer.say();

		Animal animal = new Animal();
		animal.setName("梭哈");
		animal.suoha();
		System.out.println(animal.getName());
		



	}
}
class Animal{
	private String name;
	void say(){
		System.out.println("梭布粗伐");
	}

	//父类方法
	void move(){
		System.out.println("移动..");
	}

	String move(String string){
		return string;
	}

	//父类getAndSet方法
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
		
	public static void suoha(){
		System.out.println("梭哈梭哈，靠海别墅没得了");
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
		return string+"居然在球场散步";
	}


	//方法重写 方法覆盖
	@Override
	public void say(){
		 System.out.println("我是"+getName()+",我不是天生强大，我只是天生要强");
	}

	public void gg(){
		System.out.println("我是"+getName()+",我现在慌得一批");
	}

	public void move(){
		System.out.println("我是"+getName()+",我全场散步");	
	}


	//@Override	//不能实现覆盖，但是不是不可以自己有
	public static void suoha(){
		System.out.println("赢了会所嫩模，梭了下海干活");
	}

}

