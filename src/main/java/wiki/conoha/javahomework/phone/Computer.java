package wiki.conoha.javahomework.phone;

public class Computer implements INet{

    /**
     * 接口的方法必须要实现，如果不实现，那么需要将该类添加上抽象关键字
     */

    public void netWork(){
        System.out.println("电脑可以上网");
    }

    public void Connect() {

    }

    public void music(){
        System.out.println("电脑可以听音乐");
    }
    public void video(){
        System.out.println("电脑可以看视频");
    }

}
