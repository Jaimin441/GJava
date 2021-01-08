import java.util.Scanner;

interface InterFce{
	void calculate(int num);
}

class Pallindrome implements InterFce{
	public void calculate(int num){
		int r, sum = 0, temp;
		temp = num;
		while(num != 0){
			r = num%10;
			sum = sum*10 + r;
			num/=10;
		}

		if(sum == temp) System.out.println("Pallindrome Number");
		else System.out.println("Not Pallindrome Number");
	}
}

class Unknown implements InterFce{
	public void calculate(int num){
		int sum = 0;
		for(int i = 1; i < num; i++){
			if(num % i == 0) sum += i;
		}

		if(sum == num) System.out.println("SAME");
		else System.out.println("NOT SAME");
	}
}

class Interface{
	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);

		System.out.println("Enter a number to check if it is pallindrome or not:- ");
		int pal = inp.nextInt();
		Pallindrome pal_obj = new Pallindrome();
		pal_obj.calculate(pal);

		System.out.println("Enter a number to check if its what you need or not:- ");
		int uk = inp.nextInt();
		Unknown uk_obj = new Unknown();
		uk_obj.calculate(uk);
	}
}