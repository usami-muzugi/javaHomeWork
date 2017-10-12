package wiki.conoha.javahomework.animal.homework511;

public class Test {
    /**
     * 使用接口的知识，
     * 定义接口IFly,创建三个类Plane类、Bird类、Balloon类，
     * 分别重写接口中的fly( )方法，然后再测试类中进行调用。
     *
     * 任务分析：
     1、创建接口IFly( )
        方法：创建抽象方法 fly() 方法
        2、创建子类：Plane
     方法：实现接口中的方法fly( )，输出信息“飞机在天上飞”
     创建子类：Bird
     方法：实现接口中的方法fly( )，输出信息“小鸟在天空翱翔"”
     创建子类：Balloon(气球)
     方法：实现接口中的方法fly( )，输出信息“气球飞上天空”

     3、创建测试类，分别创建Plane、Bird、Balloon类的对象，调用 fly( ) 方法，输出效果参考效果图
     */


    public static void main(String[] args) {
        Balloon balloon = new Balloon();
        Bird bird = new Bird();
        Plane plane = new Plane();
        balloon.fly();
        bird.fly();
        plane.fly();
    }
}
