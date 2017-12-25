package wiki.conoha.javahomework.generic;

public class GenericMethod {
    //定义一个泛型方法
    public <T> void  printMethod(T t){
        System.out.println(t);
    }
    public <T extends Number> void printMethod(T t){
        System.out.println(t);
    }

    //调用一个泛型方法
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.printMethod(23);
        genericMethod.printMethod("hello");
        genericMethod.printMethod(23.2F);
        genericMethod.printMethod(genericMethod);
    }
}
