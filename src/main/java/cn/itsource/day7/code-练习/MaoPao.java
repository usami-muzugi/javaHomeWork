public class MaoPao{
	public static void main(String[] args){
		int[] arr = {35,38,33,31};
		int temp;
		if(arr[0]>arr[1]){
			temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
		}
		if(arr[1]>arr[2]){
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
		}
		if(arr[2]>arr[3]){
			temp = arr[2];
			arr[2] = arr[3];
			arr[3] = temp;
		}
		//System.out.println(arr[3]);

		arr = new int[] {35,38,33,31};
		for(int index : arr){
			System.out.print(index + " ");
		}
		System.out.println();
		for(int i = 0;i<arr.length - 1;i++){
			if(arr[i]>arr[i + 1]){
				temp = arr[i];
				arr[i] = arr[1 + 1];
				arr[i + 1] = temp;
			}
		}

		for(int index : arr){
			System.out.print(index + " ");
		}
		System.out.println();

		for(int i = 0;i<arr.length - 2;i++){
			if(arr[i]>arr[i + 1]){
				temp = arr[i];
				arr[i] = arr[1 + 1];
				arr[i + 1] = temp;
			}
		}

		for(int index : arr){
			System.out.print(index + " ");
		}
	}
}