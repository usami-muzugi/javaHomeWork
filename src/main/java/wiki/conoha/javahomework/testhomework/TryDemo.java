package wiki.conoha.javahomework.testhomework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemo {
    public static void main(String[] args) {

        //方案1   通过throws抛出异常时、针对可能出现的多种异常情况，解决方案
        //1、throws后面接多个异常
        //方案2   通过再throws后面接Exception
        //        try {
//            int result = test();
//            System.out.println("a /b = " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("除数不允许为 0 ");
//            e.printStackTrace();
//        } catch (InputMismatchException e) {
//            System.out.println("请输入整数");
//            e.printStackTrace();
//        }

        try{
            int result = test();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    /**
     * 测试接受的两个数据哪儿一个比较大
     * @return  返回的是比较大的数据
     * @throws ArithmeticException
     * @throws InputMismatchException
     */
    public static int test() throws ArithmeticException,InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input first var:");

            int a = scanner.nextInt();
            System.out.println("input second var:");
            int b = scanner.nextInt();
            if (a > b) {
                return a;
            } else {
                return b;
            }
    }


//    public static int test() throws Exception{
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("input first var:");
//
//        int a = scanner.nextInt();
//        System.out.println("input second var:");
//        int b = scanner.nextInt();
//        if (a > b) {
//            return a;
//        } else {
//            return b;
//        }
//    }
}
