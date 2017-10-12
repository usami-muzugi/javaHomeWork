package wiki.conoha.javahomework.animal.homework610;

public class BallTest implements Ball {
    public void play() {

    }

    void playBall(Ball ball){

    }


    /**
     * 成员内部类
     */
    class Inner_m implements Ball{

        public void play() {
            System.out.println("成员内部类:");
            System.out.println("打篮球");
        }
    }


    /**
     * 方法内部类
     */
     public void info(){
        class Inner_f implements Ball{
             public void play() {
                System.out.println("**********");
                System.out.println("方法内部类:");
                System.out.println("打乒乓球");
            }
        }
        new Inner_f().play();
    }

}
