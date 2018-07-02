public class ObjectDemo{
	String name;
	int age;
	boolean sex;

	public void print(){
		System.out.println("name = "+name+"\tage = "+age+"\tsex = "+sex);
	}

	public String toString(){
		return
			"name = "+name+"\tage = "+age+"\tsex = "+sex;
	}
}