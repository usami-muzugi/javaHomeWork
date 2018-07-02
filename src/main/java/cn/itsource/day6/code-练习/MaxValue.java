public class MaxValue{
    public static void main(String[] args){
        //1)	定义一个方法，接受三个int参数，计算打印最大的一个数。
        max(4,4,3);
    }

    public static void max(int i,int j, int k){
        int index = 0;
        if(i > j && i > k){
            index = i;
        }else if(j > i && j > k){
            index = j;
        }else if(k > i && k > j){
            index = k;
        }
        if(!(index==0))
            System.out.println("The Max Value = "+index);
        else
            System.out.println("The Max Value not exist!");
    }
}