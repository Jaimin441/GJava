import java.io.*;
import java.util.Scanner;
import java.lang.Math;

 class Angstrong{
 	private static int[] getArray(String str) throws IOException{
 		//We are having only two values so not to create any much dynamic code for now.
 		String vals[] = str.split(" ");
 		int[] range = new int[vals.length];

 		for(int i = 0; i < vals.length; i++){
 			range[i] = Integer.parseInt(vals[i]);
 		}

 		return range;
 	}
 	private static boolean isAngstrong(int val){
 		int no_dig = 0, sum = 0, temp;
 		temp = val;

 		while(temp != 0){ 
 			no_dig += 1;
 			temp /= 10;
 		}
 		temp = val;

 		while(temp != 0){
 			sum += (int) Math.pow(temp%10, no_dig);
 			temp /= 10;
 		}

 		if(sum == val) return true;
 		else return false;
 	}
 	private static void writeAngstrong(FileOutputStream fout, int range[]) throws IOException{
 		int i;
 		OutputStreamWriter fwrite = new OutputStreamWriter(fout);
 		
		System.out.println("Starting writing in file");
		System.out.println("LB = " + range[0] + " up = " + range[1]);
		for(i = range[0]; i < range[1]; i++){
			if(isAngstrong(i)){
				fwrite.write(i + "\t is Angstrong\n");
			}
		}
		System.out.println("Writing complted");
		fwrite.close();
 		fout.close();
 	}
 	public static void main(String arg[]) throws IOException {
 		FileInputStream fin;
 		FileOutputStream fout;
 		Scanner fread;

 		int[] range = new int[2];
 		try{
 			fin = new FileInputStream("AngstrongRange.txt");
 			fread = new Scanner(fin);
 		}catch(FileNotFoundException e){ 
 			System.out.println("Exceptiong = " + e); 
 			return;
 		}

 		try{
 			fout = new FileOutputStream("AngstrongOutput.txt");
 		}catch(FileNotFoundException e){ 
 			System.out.println("Exceptiong = " + e); 
 			return;
 		}

 		//Reading section 
 		while(fread.hasNextLine()){
 			range = getArray(fread.nextLine() + " ");
 		}
 	
 		writeAngstrong(fout, range);

 		fread.close();
 		fin.close();
 	}
 }