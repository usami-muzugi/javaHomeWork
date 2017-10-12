package wiki.conoha.javahomework.animal;

public class Animal {
    private String name;
    private int age;


    /**
     * 这种方法只能被子类使用，而无法被子类重写。
     */
    public static void say(){
        System.out.println("动物间打招呼");
    }


    public Animal(){

    }

    public Animal(String name,int age){
        this.setName(name);
        this.setAge(age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void eat(){
        System.out.println("动物都有吃东西的能力！");
    }


}
