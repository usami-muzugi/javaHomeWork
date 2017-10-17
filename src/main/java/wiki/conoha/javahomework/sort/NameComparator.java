package wiki.conoha.javahomework.sort;



import java.util.Comparator;

public class NameComparator implements Comparator<Cat>{


    public int compare(Cat o1, Cat o2) {
        //按名字升序排序
        String name1 = o1.getName();
        String name2 = o2.getName();
        int n = name1.compareTo(name2);
        //int n = name2.compareTo(name1); 倒叙排序
        return n;
    }
}
