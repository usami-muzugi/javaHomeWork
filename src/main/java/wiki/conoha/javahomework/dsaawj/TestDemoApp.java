package wiki.conoha.javahomework.dsaawj;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.Scanner;

public class TestDemoApp {
    public static void main(String[] args) {
        int [][] arr = new int[2][2];
        int sum = 1;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                arr[i][j] = sum;
                sum++;
            }
        }
        for (int[] ar:arr
             ) {
            for (int a:ar
                 ) {
                System.out.println(a);
            }
        }
    }
}
