import java.io.*;

class PrintWrite{
	public static void main(String arg[]){
		PrintWriter pw = new PrintWriter(System.out, true);

		pw.println("Printing String");
		int x = 20;
		pw.println(x);

		double j = 4.5e-7;
		pw.println(j);
	}
}