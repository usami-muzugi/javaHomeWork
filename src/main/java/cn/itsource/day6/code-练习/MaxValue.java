public class MaxValue{
    public static void main(String[] args){
        //1)	����һ����������������int�����������ӡ����һ������
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