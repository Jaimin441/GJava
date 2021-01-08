import java.util.Scanner;
import java.io.*;

class Pallindrome{
	private static boolean isPallin(String str){
		StringBuffer sb_obj = new StringBuffer(str);
		int num1 = Integer.parseInt(sb_obj.toString());
		int num2 = Integer.parseInt(sb_obj.reverse().toString());

		if(num1 == num2) return true;
		else return false;

	}
	public static void main(String arg[])throws IOException{
		FileInputStream fin;
		FileOutputStream fout;
		Scanner fread;
		OutputStreamWriter fwrite;
		String foutName = "PallindromeOP.txt";
		String num;
		try{
			if(!arg[0].endsWith(".txt")) arg[0] += ".txt";

			fin = new FileInputStream(arg[0]);
			fread = new Scanner(fin);
		}
		catch(FileNotFoundException e){
			System.out.println(arg[0] + ": Mentioned file not found");
			return;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please mention a File to read data from");
			return;
		}

		try{
			fout = new FileOutputStream(foutName);
			fwrite = new OutputStreamWriter(fout);
		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
			return;
		}

		System.out.println("Reading data...");
		while(fread.hasNextLine()){
			num = fread.nextLine();
			if(isPallin(num)){
				fwrite.write(num + "\tis Pallindrome\n");
			}
			else{
				fwrite.write(num + "\tis NOT Pallindrome\n");
			}
		}

		System.out.println("Reading data Completed");
		System.out.println("\nYou can check Output in '" + foutName +"' File");
		fread.close();
		fwrite.close();
		fin.close();
		fout.close();
	}
}