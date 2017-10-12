package wiki.conoha.javahomework.testhomework;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int result = test();
        System.out.println(result);
    }


    //thows 用于抛出异常，并不处理异常，谁调用这个方法，谁就处理这个方法抛出的异常。
    public static int test(int a,int b) {//thows
        if (a > b) {
            return  a;
        }else return b;

    }


    /**
     *
     *  try{}catch{}finally{} 先执行try 然后执行catch最后执行finall，try的值会再后面的catch和finally调用，但是return
     *  若再finally里，最终调用只会再finall调用
     */
    public static int test(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input first var:");
        try {

            int a = scanner.nextInt();
            System.out.println("input second var:");
            int b = scanner.nextInt();
            if (a > b) {
                return a;
            } else {
                return b;
            }
        }catch (Exception e) {
            return 10086;
        }finally {
            //return 0;
            System.out.println("");
        }

    }
}
