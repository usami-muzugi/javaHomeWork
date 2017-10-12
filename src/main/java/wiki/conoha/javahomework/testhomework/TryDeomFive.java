package wiki.conoha.javahomework.testhomework;

public class TryDeomFive {
    public static void main(String[] args) {
        try {
            testThree();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testOne() throws HotelAgeException {
        throw new HotelAgeException();
    }


    /**
     * 这种 Exception("".e) 将上一个异常一同传递的，叫做异常链
     */
    public static void testTwo() throws Exception {
        try {
            testOne();
        } catch (HotelAgeException e) {
            throw new Exception("我是新产生的异常1",e);
        }
    }

    public static void testThree() throws Exception {
        try {
            testTwo();
        } catch (Exception e) {
            throw new Exception("我是新的异常2",e);
        }
    }
}
