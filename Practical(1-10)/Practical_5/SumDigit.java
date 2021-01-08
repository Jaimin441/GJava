import java.util.*;

class SumDigit{

	public static void main(String arg[])
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter Numebr :- ");
		int num = inp.nextInt();

		//Intializing pre-requistic vars
		int sum = 0, temp = num, r;
		while(num != 0)
		{
			r = (num % 10);
			sum += r;
			num /= 10;
		}
		System.out.print("\nSum of digits of "+temp+" is = "+sum);
	}
}