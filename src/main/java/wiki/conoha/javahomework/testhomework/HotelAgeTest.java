package wiki.conoha.javahomework.testhomework;


import java.util.Scanner;

public class HotelAgeTest {
    public static void main(String[] args) {
        try {
            testAge();
        } catch (HotelAgeException e) {
            System.out.println(e.getMessage());
            System.out.println("酒店前台工作人员不允许办理入住登记");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testAge() throws HotelAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("put an age");
        int age = scanner.nextInt();
        if (age<18||age>80) {
            throw new HotelAgeException("age too low or too high");
        }
    }
}
