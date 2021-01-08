import java.util.Scanner;

class removeDup{

	static int [] overLap(int[] arr, int start, int end){
		for(int i = start; i< end-1; i++) arr[i] = arr[i+1];
		return arr;
	}

	static void print(int[] arr, int len){
		for(int i = 0; i< len; i++){ System.out.print(arr[i]+" "); }
	}

	static int remove_dup(int[] arr){
		int len = 0;
		for(int i = 0; i< arr.length-len-1; i++){
			
			for(int j = i+1; j < arr.length-len; j++){
				
				if(arr[i] == arr[j]){ 	
					arr = overLap(arr, j, arr.length-len-1);
					len+=1;
				}
			}
		}

		return (arr.length-len);
	}

	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);

		int n;
		int[] arr;
		System.out.println("Enter the length of array:- ");
		n = inp.nextInt();
		arr = new int[n];

		System.out.println("Enter the element in array:- ");
		for(int i = 0;i < n; i++) arr[i] = inp.nextInt();

		int len = remove_dup(arr);

		System.out.println("\nPrinting array\n");
		print(arr, len);
	}
}