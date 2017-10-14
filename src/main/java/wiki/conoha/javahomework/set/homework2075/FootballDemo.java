package wiki.conoha.javahomework.set.homework2075;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 将夺冠年份作为key值，冠名队名作为value值，存储至少三条数据到HashMap中，并循环打印输出。
 */
public class FootballDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String, String>();
        //定义HashMap的对象并添加数据
        map.put("1998","法国");
        map.put("2002","巴西");
        map.put("2006","意大利");
        map.put("2010","西班牙");
        map.put("2014","德国");
        //使用迭代器的方式遍历
        String string = "冠军球队:";
        Iterator<String> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            string+= iterator.next()+"  ";
        }
        System.out.println(string);
        System.out.println("***********************************");
        //使用EntrySet同时获取key和value
        string = "冠军球队:";
        Set<Map.Entry<String,String>> set = map.entrySet();
        for (Map.Entry s : set
                ) {
            string+=s.getValue()+"  ";
        }
        System.out.println(string);
    }
}
