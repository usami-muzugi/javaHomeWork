class ObjectLearning {

	/*
protected  Object clone() 
          ���������ش˶����һ�������� 
 boolean equals(Object obj) 
          ָʾ����ĳ�������Ƿ���˶�����ȡ��� 
 Class<?> getClass() 
          ���ش� Object ������ʱ�ࡣ 
 int hashCode() 
          ���ظö���Ĺ�ϣ��ֵ�� 
 String toString() 
          ���ظö�����ַ�����ʾ�� 
	*/
	public static void main(String[] args) {
		String string = "123";

		/*
			Class ����������һ���������class��õĶ��󣬾��Ǿ����������ͣ��ࡣ
		*/
		// Class<?> getClass()           ���ش� Object ������ʱ�ࡣ 
		Class classTest = string.getClass();	//�࣬Ҳ��һ�࣬�����һ���࣬Ҳ��һ������
		System.out.println(classTest);

		//classTest.getName();
		//classTest.getInstance();

		// int hashCode()           ���ظö���Ĺ�ϣ��ֵ�� 
		Integer integer	= new A().hashCode();

		Student С�� = new Student("С��",22);
		System.out.println(С��);	//һ��������ַ��������Ƕ���ĵ�ֵַ...
		string = С��.toString();
		System.out.println(string);	//������ڲ�����Ҳ���ڵ���toString() ���� ��ǰ��������Լ���toString() ���û����дtoString�����ӡ���Ǹ����
/*
    public String toString() {		//Object��toString()����
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
*/




/*
 boolean equals(Object obj)  ָʾ����ĳ�������Ƿ���˶�����ȡ���  
 object.equals(obj)   �˶���object �������� obj��

     public boolean equals(Object obj) {
        return (this == obj);
    }

*/
		Student �ɥ饴�� = new Student("�ɥ饴��",10000);
		System.out.println(�ɥ饴�� == С�� );// ==�Ž��бȽϣ��ǱȽ��������ñ����ĵ�ֵַ���Ƚ����������������ͱ�����ֵ
		System.out.println(�ɥ饴��.equals(С��));// .equals()�Ƚϵ������������Ƿ������ֵ�Ƿ���ͬ

		С��.name ="�ɥ饴��";
		С��.age = 10000;
		System.out.println(�ɥ饴��.equals(С��));//Ҫ��д.equals	����ıȽϣ�������Ϊ��ֵַ��ͬ������ͬһ������

	}
}
class Student{
	String name;
	int age;
	
	public void eat(){
	
	}

	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}


/*
    public String toString() {		//Object��toString()����	���ص��Ƕ��������
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
*/

	//��ʾ:���������Ӧ���Ƕ���ľ�̬����
	//����Student����student�����˸����toString���صĶ�����������������ʵ���ڶ��������
	@Override	//��дtoString()		//����toString
	public String toString(){
		return "";
	}

	//Objetc���equals()�������ǱȽϵ���������ĵ�ֵַ�����ܲ����ϣ���Ҫ�Լ���д
	@Override
	public boolean equals(Object ojbk){
		/*
			�ж����������Ƿ��ֵַ��ȣ���Ⱦ���ָ��Ķ���ͬһ���ռ䣬���Է���true
		*/
		if(this == ojbk) return true;

		/*
			�ж������������Class�Ƿ���ͬ������ͬ�͸�������ͬ������new�����Ķ������Է���false
		*/
		if(ojbk == null || getClass() != ojbk.getClass()) return false;
		
		
		//if(!((ojbk instanceof Student) && (ojbk != null))) return false;

		if(ojbk==null|| !(ojbk instanceof Student ) ) return false;
		//���ojbk��student��ʵ��������ojbk��Ϊnull 
		/*
			��Objetc����ojbkǿ��ת�ͳ�Student,��Ϊ����������Objetc���󣬲����Ѿ��жϹ��������Ϊ�գ�
			��ojbk��Class�ͱ��������Class��ͬ������������ǿ��ת��ΪStudent����������������������
		*/
		Student that = (Student)ojbk;	//ǿ��ת��

		/*
			
		*/

		//if(name != that.name && age != that.age) return false;
		if(age != that.age ) return false;		//���������ֵ���жϣ�Ȼ�������Ƕ�����бȽ�
		return name != null ? name.equals(that.name) : that.name == name;
		//���age��Ϊ��    �� �Ƚ��������������age��ֵ�Ƿ���ȣ���ȵĻ�������true������Ⱦ�����������������Ի����в���ȵģ����Է���false�� : Ϊ�յĻ����Ϳ���һ�������age�Ƿ�Ϊ�գ�Ϊ�յĻ���������������null�����Է���true�������һ�������ageΪnull�������������Ϊnull�����Ծͷ���fallse��

	}


	/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExtendsAnimal that = (ExtendsAnimal) o;

        if (age != that.age) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }	
	
	*/
}

class A{
}