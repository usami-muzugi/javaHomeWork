package wiki.conoha.javahomework.IO;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by IntelliJ IDEA.
 * User: wzard
 * Date: 2018-01-02
 * Time: 11:37
 * ProjectName: javahomework
 * To change this template use File | Settings | File Templates.
 **/

public class GetWebFile {
        public static void main(String args[]) throws Exception {
            try {
                URL url = new URL("http://www.baidu.com");
                InputStream in =url.openStream();
                InputStreamReader isr = new InputStreamReader(in);
                BufferedReader bufr = new BufferedReader(isr);
                String str;
                while ((str = bufr.readLine()) != null) {
                    System.out.println(str);
                }
                bufr.close();
                isr.close();
                in.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
