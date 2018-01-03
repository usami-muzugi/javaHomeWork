package wiki.conoha.javahomework.IO;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.Buffer;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-03
 * Time: 15:44
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

public class Web {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.baidu.com");
            InputStreamReader inputStreamReader = new InputStreamReader(url.openStream());
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String string;
            for (;;) {
                string = bufferedReader.readLine();
                if (string == null) {
                    break;
                }
                System.out.println(string);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
