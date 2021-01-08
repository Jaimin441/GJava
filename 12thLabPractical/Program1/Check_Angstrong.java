import java.util.Scanner;
import java.io.*;

class Check_Angstrong{

	public static boolean isAngstrong(String val){
		int num = Integer.parseInt(val);
		int sum = 0, temp = num, r;

		while(temp != 0){
			r = (temp%10);
			sum += (r*r*r);
			temp /= 10;
		}

		if(num == sum )return true;
		else return false;
	}

	public static void main(String arg[]) throws IOException {
		FileInputStream fin;
		Scanner fread;
		FileOutputStream fout;
		OutputStreamWriter fwrite;

		String fin_name = "input.txt";
		String fout_name = "ouput.cpp";

		String num;
		try{
			fin = new FileInputStream(fin_name);
			fread = new Scanner(fin);
		}
		catch(FileNotFoundException e){
			System.out.println("No file with name " + fin_name + " found");
			return;
		}

		try{
			fout = new FileOutputStream(fout_name);
			fwrite = new OutputStreamWriter(fout);
		}
		catch(FileNotFoundException e){
			System.out.println("No file with name " + fout_name + " found");
			return;
		}

		System.out.println("Files provided for input are successfully accepted");
		while(fread.hasNextLine()){

			num = fread.nextLine();
			if(isAngstrong(num)){
				fwrite.write(num + "\t is Angstrong\n");
			}
			else{
				fwrite.write(num + "\t is NOT Angstrong\n");	
			}
		}

		System.out.println("Reading file end Successfully");
		fread.close();
		fwrite.close();
		fin.close();
		fout.close();
	}
}