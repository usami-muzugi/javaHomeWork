package wiki.conoha.javahomework.animal;

public class Cat extends Animal {
    //属性：体重
    private double weight;

    public Cat(){

    }

    public Cat(String name,int age,double weight){
        super(name,age);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //方法：跑动
    public void run(){
        System.out.println("小猫快跑");
    }

    public static void say(){
        System.out.println("猫的打招呼方法，碰胡须");
    }
    //重写父类吃东的方法
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void playBall() {
        System.out.println("小猫喜欢玩线球");
    }
}
