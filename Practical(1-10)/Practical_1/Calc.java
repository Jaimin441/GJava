import java.util.Scanner;

class Calc{
	public static void main(String arg[])
	{
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Enter Value for A:- ");
		int a = inp.nextInt();

		System.out.println("Enter Value for B:- ");
		int b = inp.nextInt();

		System.out.println("<----Enter you choice---->");
		System.out.println("1 - Addition");
		System.out.println("2 - Subtraction");
		System.out.println("3 - Multiplication");
		System.out.println("4 - Division");

		int ch = inp.nextInt();
		if(ch == 1){ System.out.println("A + B = "+(a+b)); }
		else if(ch == 2){ System.out.println("A - B = "+(a-b)); }
		else if(ch == 3){ System.out.println("A * B = "+(a*b)); }
		else if(ch == 4){ System.out.println("A / B = "+(a/b)); }
		else{ System.out.println(" Invalid Input "); }
	}
}