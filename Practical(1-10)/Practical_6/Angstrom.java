import java.util.*;
class Armstrong{

	//Function for getting Power of any number.
	static int pow(int n, int p){
		int ans = 1;
		for(int i = 0; i<p; i++){ ans *= n; }
		return ans;
	}

	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);

		int num, temp, r, sum = 0, n_digits = 0;
		System.out.println("Enter Numebr:- ");
		num = inp.nextInt();
		temp = num;
		
		//Couting the total number of digits in a number.
		while(num != 0){
			n_digits += 1;
			num /= 10;
		}

		//Re-assigning number is original value.
		num = temp;

		while(num != 0)
		{
			r = num % 10;
			sum += pow(r, n_digits);
			num /= 10;
		}

		//Printing result.
		if(temp == sum){ System.out.println("\nThe number IS Armstrong"); }
		else{ System.out.println("\nThe number NOT Armstrong"); }
	}
}