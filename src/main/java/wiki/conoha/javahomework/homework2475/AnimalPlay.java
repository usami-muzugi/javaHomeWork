package wiki.conoha.javahomework.homework2475;

import java.util.List;

public class AnimalPlay{
    //按任务要求实现该类
    public static void play(List<? extends Animal> Animal){
        for (Animal animal:Animal
             ) {
            animal.play();
        }
    }
}