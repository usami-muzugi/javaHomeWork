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

/*        while (false) {       //����ط�������Ҫ�������벻ͨ���� X����Ϊ���� false��������������ǿ��Ե�
            System.out.println();

        }*/
        int qqq = 1;
        
        while(qqq<100){
            System.out.println(qqq+"��");
            qqq++;
        }
    }
}
