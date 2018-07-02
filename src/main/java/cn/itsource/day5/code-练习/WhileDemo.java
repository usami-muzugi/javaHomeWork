public class WhileDemo {
    public static void main(String[] args) {
        boolean flag = true;
        int i = 0;
        while (flag) {
            if (i < 100) {
                i++;
            } else {
                flag = false;
            }
            System.out.println(i);
        }

/*        while (true) {
            System.out.println("Allways true");
        }*/

/*        while (false) {       //这个地方编译器要报错，编译不通过， X不能为常量 false，但是这里变量是可以的
            System.out.println();

        }*/
        int qqq = 1;
        
        while(qqq<100){
            System.out.println(qqq+"次");
            qqq++;
        }
    }
}
