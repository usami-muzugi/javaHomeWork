package wiki.conoha.javahomework.dsaawj;

import java.util.Scanner;

public class GewnericCoin {
    private static int sum =0;
    public void run(){
        double rand = Math.random();
        rand *= 10;

        if(rand>=5){
            sum +=1;
        }
    }

    public static void main(String[] args) {
//        System.out.println(Math.random());
        GewnericCoin gewnericCoin = new GewnericCoin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("put a number");
        int sum = scanner.nextInt();
        for (int i = 0; i < sum; i++) {
            gewnericCoin.run();
        }
        System.out.println(sum);
    }
}
