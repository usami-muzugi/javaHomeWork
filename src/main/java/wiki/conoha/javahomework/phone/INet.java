package wiki.conoha.javahomework.phone;


/**
 * 接口的访问修饰符: public 默认 ×proteced
 */
public interface INet {

    /**
     * 当一个类实现接口的时候，需要实现这个接口类的所有方法
     * 如果不想实现抽象类的所有方法，需要将那个类修饰 为抽象方法
     */
    //接口当中抽象方法可以不写abstract关键字
    public abstract void netWork();
    void Connect();


    static final int TEMP = 20;
}
