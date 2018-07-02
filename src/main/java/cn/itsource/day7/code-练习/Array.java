public class Array{
	public static void main(String[] args){
		//int[] arr = {};
		//System.out.println(arr[1]);		//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
		//arr = null;
		//System.out.println(arr.length);	//Exception in thread "main" java.lang.NullPointerException
		int[] arr = new int[10];
		int[] arrs = add(arr);
		System.out.println(arr);	//[I@15db9742
		System.out.println(arrs);	//[I@15db9742
	}

	public static int[] add(int[] arr){
		for(int i = 0;i<arr.length;i++){
			arr[i] = 15;
		}
		return arr;
	}

	public static String[] adds(){
		return new String[10];
	}
}