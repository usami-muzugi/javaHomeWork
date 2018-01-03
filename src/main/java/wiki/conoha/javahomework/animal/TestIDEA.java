package wiki.conoha.javahomework.animal;

import java.sql.Time;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-03
 * Time: 10:47
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

public class TestIDEA {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(System.currentTimeMillis());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
