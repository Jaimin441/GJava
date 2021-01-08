import java.util.*;

class pallin{
	public static void main(String arg[])
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = inp.nextInt();
		int temp = num;
		int sum = 0;
		int r;

		while(num != 0)
		{
			r = num%10;
			sum = (sum*10) + r;
			num /= 10;
		}

		if(temp == sum){ System.out.println("Number is Pallindrome"); }
		else{ System.out.println("Number is not Pallindrome"); }

	}
}