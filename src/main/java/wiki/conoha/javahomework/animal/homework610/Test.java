package wiki.conoha.javahomework.animal.homework610;


public class Test {

    /**
     * 分别通过成员内部类、方法内部类、
     * 匿名内部类完成接口Ball，在测试类BallTest中的调用。
     * <p>
     * <p>
     * 任务分析：
     * 1.    创建接口Ball
     * 包含抽象方法play( )
     * <p>
     * 2.    创建外部类BallTest
     * 定义方法 void playBall(Ball ball)，调用接口中的 play( ) 方法
     * <p>
     * 3.    分别通过成员内部类、方法内部类以及匿名内部类完成接口实现
     * 在BallTest中，创建成员内部类 Inner_m 实现接口Ball，在类中重写 play( ) 方法，
     * 输出两条信息，分别为"成员内部类:"和"打篮球"
     * 在BallTest中， 创建成员方法 info() ，在方法中创建方法内部类 Inner_f 实现Ball接口，
     * 重写 play( ) 方法，输出三条信息，分别为"**********"，"方法内部类:" 和 "打乒乓球"
     * 在测试类Test中通过匿名内部类实现接口Ball，并重写 play( )方法，输出两条信息，
     * 分别为 "**********"，"匿名内部类:" 和 "打排球"
     * <p>
     * 4.    创建测试类Test，通过创建BallTest类及相关内部类实例，
     * 调用相关方法，依次完成相关内部类测试。运行效果参见效果图
     * @param ball
     */

     public static void getVar(Ball ball){
        ball.play();
     }


    public static void main(String[] args) {
        BallTest ballTest = new BallTest();
        BallTest.Inner_m bi = new BallTest().new Inner_m();
        bi.play();
        ballTest.info();

        getVar(new Ball() {
            public void play() {
                System.out.println("**********");
                System.out.println("匿名内部类:");
                System.out.println("打排球");
            }
        });
    }
}
