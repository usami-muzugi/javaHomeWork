package wiki.conoha.javahomework.generic;

public class NumberGeneric<T> {
    private T num;

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }

    //Test
    public static void main(String[] args) {
        NumberGeneric<Integer> intNum = new NumberGeneric<Integer>();
        intNum.setNum(new Integer(1));
        System.out.println("Integer:"+intNum.getNum());
        NumberGeneric<Float> floatNum = new NumberGeneric<Float>();
        floatNum.setNum(new Float(5.0F));
        System.out.println("Float:"+floatNum.getNum());
    }
}
