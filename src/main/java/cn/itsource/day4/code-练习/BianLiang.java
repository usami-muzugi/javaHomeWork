public class BianLiang2 {

    //成员变量可以不用初始化，会有一个默认值
    public static int i = 1;

    public static void main(String[] args) {

        //成员变量和局部变量同名，先使用局部变量 [ 就近原则 ]
        //局部变量在使用之前，必须要初始化
        int i;
        i = 2;
        System.out.println(i);


        //结构体内可以使用上层结构体的变量 外部结构体的变量内部结构体能使用，内部结构体的变量内部可以使用，外部不可以使用
//        同一个作用于当中[ 用一个结构体中，不能同时存在相同的变量名 ]
        {
            int y = 20;
            System.out.println(i);
        }
//        找不到符号 变量y
//        System.out.println( y);


        /*
        局部变量和成员变量的特点
        成员变量会随着对象的存在而一直存在
         */

    }

    public static void add(int num) {
        //局部变量，为了辅助方法的完成而临时创建的变量，方法结束，局部变量的生命周期也结束了
        int k = num;
        System.out.println("K: =" + k);
    }
}
