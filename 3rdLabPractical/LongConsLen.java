import java.util.Scanner;

class LongConsLen{
	static void print(String str){ System.out.println(str); }

	static int [] sort(int arr[]){
		int i, j;
		for(i = 0; i< arr.length-1; i++){
			for(j = i+1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		return arr;
	}

	static int findConsLen(int arr[]){
		int arr_len = arr.length;
		int i, j;
		int cnt, seq_no, max_cnt = 0;
		arr = sort(arr);
		
		for(i = 0; i< arr_len; i++){
			cnt = 0;
			seq_no = arr[i];
			for(j = i+1; j<arr_len; j++){
				if(seq_no == (arr[j]-1) ){ cnt+=1; seq_no = arr[j];}
				else{ break; }
			}
			if(cnt > max_cnt) max_cnt = cnt;
		}
		return max_cnt+1;
	}
	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);

		int n;
		print("Enter the length of array:- ");
		n = inp.nextInt();
		int[] a = new int[n];

		print("\nEnter the elements:- ");
		for(int i = 0; i< n; i++) a[i] = inp.nextInt();

		int len = findConsLen(a);
		print("\nLongest Sequence length = "+len);
	}
}