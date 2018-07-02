class WhyOverride {
	public static void main(String[] args) {
		Person person = new Person();
		person.move();	override 父类方法，优先使用子类方法
	}
}
class Animal{
	void move(){	//移动行为
		System.out.println("移动..");
	}
}

class Person extends Animal {
	void move(){	//移动行为
		System.out.println("走动..");
	}

}

class snake extends Animal {
	void move(){	//移动行为
		System.out.println("蛇皮走位..");
	}
}

