package wiki.conoha.javahomework.dsaawj;

import java.util.Scanner;

public class StringTest {
     String string;
    public void func(String stirng){
        this.string = stirng;
    }
    public static void main(String[] args) {
        String string = "good dog zhangcaiyuan";
        Scanner scanner = new Scanner(string);
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        scanner.useDelimiter(",");
        new StringTest().func("1");

    }

}
