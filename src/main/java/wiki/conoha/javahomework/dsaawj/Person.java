package wiki.conoha.javahomework.dsaawj;

public class Person {
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return this.getName()+" "+this.getAge();
    }

    public static void main(String[] args) {
        Person john = new Person();
        Person james = new Person();
        john.setAge(18);
        john.setName(new String("john"));
        james.setName(new String ("james"));
        james.setAge(new Integer(12));
        boolean flag = false;
        while (james.getAge()==john.getAge()|james.getName()==john.getName()){
            flag = true;
        }
        if (flag){
            System.out.println("james==john");
        }else
        {
            System.out.println("james!=john");
        }
        if(james.getAge()>john.getAge()){
            System.out.println("james age> john age");
        }else if (james.getAge()==john.getAge()){
            System.out.println("james age = john age");
        }else {
            System.out.println("james age < john age");
        }
        System.out.println(james);
        System.out.println(john);
    }
}
