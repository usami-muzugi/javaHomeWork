package wiki.conoha.javahomework.set;


import java.util.*;

public class DictionaryDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String >();
        System.out.println("请输入三组单词对应的注释，并存放到HashMap中");
        Scanner scanner = new Scanner(System.in);
        int i  = 0;
        while (i < 3) {
            System.out.println("请输入Key值(单词)");
            String key = scanner.next();
            System.out.println("请输入Value值(注释)");
            String value = scanner.next();
            map.put(key,value);
            i++;
        }
        System.out.println("***************************");

        System.out.println("使用迭代器输出所有的Value");
        Iterator<String> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+ " ");
        }
        System.out.println();
        System.out.println("***************************");

        //打印输出Key && Value的值
        //通过entrySet()方法得到KEY && VALUE
        System.out.println("通过entrySet()方法得到");
        Set<Map.Entry<String,String>> set = map.entrySet();
        for (Map.Entry s:set
             ) {
            System.out.print(s.getKey()+" ");
            System.out.println();
            System.out.print(s.getValue()+ " ");
        }
        System.out.println("***************************");
        System.out.println("你要查找哪个单词？请输入你要查找的单词");
        String string = scanner.next();
        Set<String> set1 = map.keySet();
        boolean flag = false;
        for (String s: set1
             ) {
            if (string.equals(s)) {
                System.out.println("找到了"+"键值对为;"+s+"-"+map.get(s));
                flag =true;
                break;
            }
        }
        if(!flag) System.out.println("没找到");
    }
}
