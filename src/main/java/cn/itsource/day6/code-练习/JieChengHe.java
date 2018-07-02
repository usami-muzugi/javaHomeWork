public class JieChengHe{

	public static void main(String[] args){
		int sum = 0;
		//1*1 + 1*2 + 1*2*3 + 1*2*3*4 + 1*2*3*4*5 
		for(int i = 1,index =1;i<=5;i++){
			index *= i;		//i!
			sum += index;	//sum += i!
		}
		System.out.println(sum);
	}
}