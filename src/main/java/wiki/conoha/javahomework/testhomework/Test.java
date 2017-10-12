package wiki.conoha.javahomework.testhomework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String [] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("====================");
//        System.out.print("输入一个数:");
//        int a = scanner.nextInt();
//        System.out.print("输入第二个数:");
//        int b = scanner.nextInt();
//
//        System.out.println("除数 = "+a/b);
//        System.out.println("====================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("====================");
        System.out.print("输入一个数:");
        try {
            //System.exit(1);
            int a = scanner.nextInt();
            System.out.print("输入第二个数:");
            int b = scanner.nextInt();

            System.out.println("除数 = "+a/b);
        }catch (ArithmeticException e){
            System.out.println("算数异常");
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("输入异常，请输入一个整数");
            e.printStackTrace();
        }catch (Exception e){  //父类来处理异常是要放在最后，因为放在最前不管是什么异常都会被父类的catch给捕获，所以放在最后
            System.out.println("程序出错");
            e.printStackTrace();
        }finally {
            System.out.println("====================");
        }
    }
}
