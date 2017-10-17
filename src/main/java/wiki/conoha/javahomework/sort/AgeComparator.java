package wiki.conoha.javahomework.sort;

import java.util.Comparator;

public class AgeComparator implements Comparator<Cat> {


    public int compare(Cat o1, Cat o2) {
        //降序排序
        int var1 = o1.getAge();
        int var2 = o2.getAge();
        return var2-var1;
    }
}
