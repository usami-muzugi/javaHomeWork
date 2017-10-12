package wiki.conoha.javahomework;

import java.util.Scanner;

public class javaHomeWork {

    /**     需求：定义一个类，对数组中的数据进行管理
     *      1，插入数据 insertData()
     *      2，显示所有数据 showData()
     *      3，在指定位置插入数据 insertAtArray()
     *      4，查询能被3整除的数据 dirThree()
     *      5，显示提示方法 notice()
     *
     *      ※ 调用方法 homeWork()
     */

    /**
     *  放一个常量来确定数组元素个数
     */
    public static final int length = 10;



    /**
     *      所有方法的在 homeWork() 方法中调用
     */
    public static void homeWork(int[] a) {

        /*
            调用显示方法 notice()
         */
        notice();

        Scanner scanner = new Scanner(System.in);
        /*
            1，插入数据 insertData()
            2，显示所有数据 showData()
            3，在指定位置插入数据 insertAtArray()
            4，查询能被3整除的数据 dirThree()
            5，显示提示方法 notice()
         */
        System.out.println("请输入对应的数字进行操作");
        int var = scanner.nextInt();


        /**
            System.exit(0);很重要，DeBug看了一下，发现case0仅结束了当前方法。但之前调用它的方法还没有执行完，
            还会继续执行下面的hoemWork();
         */
        switch (var) {
            case 0 : System.out.println("Exit.");System.exit(0);break;
            default: System.out.println("输入有误，请输入0-4数字"); homeWork(a); break;
            case 1 : insertData(a); break;
            case 2 : showData(a); break;
            case 3 : insertAtArray(a); break;
            case 4 : dirThree(a); break;
        } // end switch

        /*
        if(var==0){
            System.out.println("Exit.");
        }else if(var==1){
            insertData(a);
        }else if(var==2){
            showData(a);
        }else if(var==3){
            insertAtArray(a);
        }else if(var ==4){
            dirThree(a);
        }else{
            System.out.println("输入有误，请输入0-4数字");
        }
        */
    }


    /**
            显示提示方法
            public static void notice()
     */
    public static void notice(){
        System.out.println();
        System.out.println("**************************************");
        System.out.println("          1--插入数据");
        System.out.println("          2--显示所有数据");
        System.out.println("          3--在指定位置处插入数据");
        System.out.println("          4--查询能被3整除的数据");
        System.out.println("          0--退出");
        System.out.println("**************************************");

    }

    /**
     *      插入数据方法 insertData()
     *
     */
    public static void insertData(int[] arr) {
        arr = new int[length];
        Scanner scanner = new Scanner(System.in);


        /**
            输入的值不能为0;
         */

        for (int j = 0; j <arr.length-1; j++) {
            System.out.println();
            System.out.println("请输入第"+(j+1)+"个数据:");
            int i = scanner.nextInt();
            if(i==0){
                System.out.println("输入的数据不能为0，请重新输入");
                j--;
            }else{
                arr[j] = i;
            }
        }
        System.out.println();
        showData(arr);
        /**
         * 注释掉showData(),因为DeBug看了下showData方法里面调用了homeWork();所以showData执行完成后，
         * 返回insertData()继续执行下面的语句，homeWork();导致退出会输入多次0。
         *
         * 办法是homeWork()方法的switch case0 执行System.exit(0);或者将insertData()方法里的showData()改写。
         */

        /*
        System.out.println("数组元素为:");
        for (int a:arr
                ) {
            if(a!=0){
                System.out.print(a+"   ");
            }
        }
         */

        System.out.println();

        /**
            将元素添加好之后传递到homeWork()方法里
         */
        homeWork(arr);
    }


    /**
     *      显示所有数据方法 showData()
     *
     */
    public static void showData(int[] arr) {
        if (arr==null){
            System.out.println("数组为空，请先插入数据");
            homeWork(arr);
        }else{
            System.out.println("数组元素为:");
            for (int a:arr
                    ) {
                if(a!=0){
                    System.out.print(a+"   ");
                }
            }
            System.out.println();

            homeWork(arr);
        }
    }

    /**
     *      在指定位置处插入数据方法 insertAtArray()
     *
     */
    public static void insertAtArray(int[] a) {
        if(a==null){
            System.out.println("数组为空，请先插入数据");
            homeWork(a);
        }else{
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入要插入的数据");
            int var = scanner.nextInt();
            if(var==0){
                System.out.println("插入的数据不能为0，请重新输入");
                insertAtArray(a);
            }
            int local;

            for(;;){
                System.out.println("请输入要插入数据的位置（数组下标位置）");
                local = scanner.nextInt();
                if(local>=length){
                    System.out.println("※ NullPointerException,Please reput.");
                    System.out.println();
                }else break;
            }

            for(int i = 1;i<length-local;i++){
                a[length-i] =a[length-i-1];
            }
            a[local] = var;
            System.out.println("插入完成,插入值="+var+",插入位置="+local);
            homeWork(a);
        }
    }

    /**
     *      查询能被3整除方法 dirThree()
     *
     */
    public static void dirThree(int[] a) {
        if(a==null){
            System.out.println("数组为空，请先插入数据");
            homeWork(a);
        }else{
            System.out.println("能被3整除的元素:");
            boolean flag = false;
            for (int i:a
                    ) {
                if (i%3==0&i!=0) {
                    System.out.print(i+"   ");
                    flag = true;
                }
            }
            if(!flag) System.out.print("数组里没有能被3整除的数");
            System.out.println();

            homeWork(a);
        }
    }


    public static void main(String[] args) {
        int[] arr = null;

        javaHomeWork javaHomeWork = new javaHomeWork();
        javaHomeWork.homeWork(arr);
    }
}
