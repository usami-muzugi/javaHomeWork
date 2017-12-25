package wiki.conoha.javahomework.testAnimal;


/**
 * 使用abstract后，该类就不能实例化了，但是可以通过向上转型
 * 指向他的子类实例
 */
public  class Animal {
    private String kind;
    public Animal(){

    }
    public Animal(String kind){

    }

    public void cry(){
        System.out.println("动物都会哭");
    }

    public String getKind() {
        return kind;
    }


    /**
     * 抽象方法是不能有方法体
     * 子类中需要重写父类的抽象方法
     * 否者，子类也是抽象类
     * private static final 是不能与abstract一同使用的
     */
    public  void eat(){};
    public void setKind(String kind) {
        this.kind = kind;
    }
}
