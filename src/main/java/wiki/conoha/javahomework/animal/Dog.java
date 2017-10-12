package wiki.conoha.javahomework.animal;

public class Dog extends Animal {
    private String sex;
    public Dog(){

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Dog(String name, int age, String sex){
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);

    }

    /**
     *
     */
    public void sleep(){
        System.out.println("狗子要午休啦");
    }

    @Override
    public void eat() {
        System.out.println("狗子爱吃肉");
    }
}
