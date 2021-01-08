import java.io.*;
import java.util.Scanner;
class Regex{

	private static boolean inRange(int val, int lwr, int upr){
		if(val >= lwr && val <= upr) return true;
		else return false;
	}

	public static void main(String arg[]) throws IOException{
		int charCnt = 0, digitCnt = 0, i;
		FileInputStream fin;
		try{
			fin = new FileInputStream(arg[0]);
		}catch(FileNotFoundException e){
			System.out.println("Mentioned File not Found");
			return;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Please mention an InputFile");
			return;
		}

		do{
			i = fin.read();
			if(inRange(i, 48, 59)) digitCnt += 1;
			else if(inRange(i, 65, 90) || inRange(i, 97, 122)) charCnt += 1;
			else{ continue; } 
		}while(i != -1);

		System.out.println("In File " + arg[0]);
		System.out.println("Total No. of Characters are " + charCnt);
		System.out.println("Total No. of Digits are " + digitCnt);
	}
}