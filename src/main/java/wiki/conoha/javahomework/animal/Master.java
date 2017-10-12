package wiki.conoha.javahomework.animal;

public class Master {
    /**
     * 喂宠物
     * 喂猫咪:吃完东西，出去完
     * 喂狗子:吃完东西，去睡觉
     */

    public void feed(Cat cat){
        cat.eat();
        cat.playBall();
    }


    public void feed(Dog dog){
        dog.eat();
        dog.sleep();
    }

    public void feed(Animal animal){
        if(animal instanceof Cat){
            Cat temp = (Cat) animal;
            temp.eat();
            temp.playBall();
        }else if (animal instanceof Dog){
            Dog temp = (Dog) animal;
            temp.eat();
            temp.sleep();
        }

    }
}
