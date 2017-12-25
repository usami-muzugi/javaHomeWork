package wiki.conoha.javahomework.generic;

public class TwoNumGeneric<T,E> {
    private T num1;
    private E num2;

    public T getNum1() {
        return num1;
    }

    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public E getNum2() {
        return num2;
    }

    public void setNum2(E num2) {
        this.num2 = num2;
    }
    public void setnumber(T t,E e){
        this.num1 = t;
        this.num2 = e;
    };
    public static void main(String[] args) {
        TwoNumGeneric<Integer,Float> twoNumGeneric = new TwoNumGeneric<Integer, Float>();
        twoNumGeneric.setnumber(1,2.0f);
        twoNumGeneric.getNum1();
        twoNumGeneric.getNum2();
    }
}
