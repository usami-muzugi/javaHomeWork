package wiki.conoha.javahomework.wrappProj;

public class WrappTest {
    public static void main(String[] args) {
        Integer integer = new Integer(100);  //手动装箱
        Integer integer1 = new Integer(100); //同上
        System.out.println(integer==integer1);
        // ==比较的是引用，引用不相同的。
        // ==两遍放的是对象名的话，比较的是对象在内存当中的引用。而不是比较的对象的值。

        Integer integer2 = 100;//自动装箱
        System.out.println("integer2是否等于100:"+(integer2==100));
        //这里integer2==100 完成了一个自动拆箱的操作，这里比较的就是他们的值了。

        Integer integer3 = 100;
        System.out.println("integer2==integer3:"+(integer2==integer3));
        //在Java当中，当执行这条integer2==integer3的时候，编译器实际上是执行的这样的一个操作。
        //Integer integer3 = Integer.valueOf(100);
        //这里有一个缓存区(对象池)的概念，当执行Integer integer2 = 100 时，实际上Java会查看缓存去是否有这么一个空间
        //有的话，直接产生。没有的话，就实例化一个Integer对象
        //然而并没有所以生成一个，当执行Integer integer2 = 100 时，这时候就会去缓存区里面查找是否有这么一个 -128<X<127 的空间
        //然而有这么一个缓存，所以Java会直接引用这个缓存，所以这个时候比较这连个对象的引用空间就会得到 真。

        Integer integer4 = 200;
        System.out.println("integer4 ==200 : "+(integer4==200));

        Integer integer5 = 200;
        System.out.println("integer4 ==integer5 :"+(integer4==integer5));
        //false
        //因为这里的200超过了127了，所以这里并不进入缓存池去判断，而是直接实例化一个对象，
        //所以这里就是false

        Double d = Double.valueOf(100);
        System.out.println("d == 100:"+(d==100));

        Double d1 = Double.valueOf(100);
        System.out.println("d == d1 :"+(d ==d1));
        /**
         * Java当中8种基本类型里，除了Double 和Float  都可以应用对象常量池这个概念的。
         */
    }
}
