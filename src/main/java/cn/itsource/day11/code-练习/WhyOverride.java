class WhyOverride {
	public static void main(String[] args) {
		Person person = new Person();
		person.move();	override ���෽��������ʹ�����෽��
	}
}
class Animal{
	void move(){	//�ƶ���Ϊ
		System.out.println("�ƶ�..");
	}
}

class Person extends Animal {
	void move(){	//�ƶ���Ϊ
		System.out.println("�߶�..");
	}

}

class snake extends Animal {
	void move(){	//�ƶ���Ϊ
		System.out.println("��Ƥ��λ..");
	}
}

