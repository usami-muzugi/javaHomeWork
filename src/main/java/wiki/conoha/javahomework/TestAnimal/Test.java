package wiki.conoha.javahomework.TestAnimal;

public class Test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        for(int i = 0;i<5;i++){
            double j = Math.random();
            j*=3;
            switch ((int)j){
                case 0 :
                    Cat cat = new Cat();
                    animals[i] = cat;
                    break;
                case 1 :
                    Dog dog = new Dog();
                    animals[i] = dog;
                    break;
                case 2 :
                    Sheep sheep = new Sheep();
                    animals[i] = sheep;
                    break;
            }
        }

        for (Animal animal:animals
             ) {
            if (animal instanceof Cat){
                Cat cat = (Cat)animal;
                cat.cry();
            }else if(animal instanceof Dog){
                Dog dog = (Dog) animal;
                dog.cry();
            }else{
                Sheep sheep = (Sheep) animal;
                sheep.cry();
            }
        }
    }
}
