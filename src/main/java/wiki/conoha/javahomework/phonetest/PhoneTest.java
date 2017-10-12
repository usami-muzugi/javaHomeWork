package wiki.conoha.javahomework.phonetest;


import wiki.conoha.javahomework.phone.*;

public class PhoneTest {
    public static void main(String[] args) {
        XPhone xPhone = new XPhone();
        xPhone.call();
        xPhone.message();
        xPhone.video();
        xPhone.music();
        xPhone.photo();
        xPhone.network();
        System.out.println("==============================");
        IPhoto iPhoto = new XPhone();
        iPhoto.photo();
        iPhoto = new Camera();
        iPhoto.photo();
        System.out.println("=============================");
        System.out.println(INet.TEMP);
        System.out.println("=======================");
        INet wacth = new Wacth();


    }
}
