import java.io.*;
import java.util.Scanner;
class SortValue{
	private static int[] getArray(String str){
		int i, cnt_val = 0;
		for(i = 0 ; i<str.length(); i++){
			if(str.charAt(i) == ' ') cnt_val += 1;
		}
		int[] val = new int[cnt_val];

		String temp = "";
		System.out.println("total Number = " + cnt_val);
		for(i = 0; i < str.length(); i++){
			if(str.charAt(i) == ' '){
				val[val.length - cnt_val] = Integer.parseInt(temp);
				cnt_val -= 1;
				temp = "";
				continue;
			}
			temp += str.charAt(i);
		}
		return val;
	}

	private static int[] sortArray(int arr[]){
		int min_ind, temp;
		System.out.println("Sorted array:-");
		for(int i = 0 ; i< arr.length-1; i++){
			min_ind = i;
			for(int j = i+1; j < arr.length; j++){
				if(arr[min_ind] > arr[j]) min_ind = j;
			}
			temp = arr[i];
			arr[i] = arr[min_ind];
			arr[min_ind] = temp;
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		return arr;
	}

	public static void main(String arg[])throws IOException{
		FileInputStream fin;
		FileOutputStream fout;
		OutputStreamWriter osw;
		Scanner fread;

		String str_vals = "";
		int val[];
		try{

			try{
				fin = new FileInputStream(arg[0]);
				fread = new Scanner(fin);
			}
			catch(FileNotFoundException e){
				System.out.println(arg[0] + " File not Found");
				return;
			}

			try{
				fout = new FileOutputStream("Output.txt");
				osw = new OutputStreamWriter(fout);
			}
			catch(FileNotFoundException e){
				System.out.println("'Output.txt' File not Found");
				return;
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Enter a File to read from!!!");
			return;
		}

		while(fread.hasNextLine()){
			str_vals += fread.nextLine() + " ";
		}

		System.out.println("Array read = " + str_vals);

		val = getArray(str_vals);

		val = sortArray(val);

		for(int i = 0; i < val.length; i++){
			String temp = "" + val[i] + "\n"; 
			osw.write(temp);
		}
		
		System.out.println("\nWriting completed");
		osw.close();
		fread.close();
		fin.close();
		fout.close();
	}
}