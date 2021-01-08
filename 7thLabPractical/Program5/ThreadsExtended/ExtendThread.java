import java.util.Scanner;
class NewThread extends Thread {
	int lb, ub;
	Scanner t_inp = new Scanner(System.in);

	NewThread(int d_lb, int d_ub){
		super("Pallindrome");

		lb = d_lb;
		ub = d_ub;

		System.out.println("Pallindrome Thread created " + this);
		//Start thread
		start();
	}

	public void run(){
		int sum;

			System.out.println("\n\nPrinting Pallindrome in Range [" + lb + " - " + ub + "]");
			//Looping from [lb - ub]
			while(lb <= ub){
				sum = 0;
				int num = lb;
				
				//Checking if lb is pallindrome
				while(num != 0){
					sum = (sum*10) + (num % 10);
					num /= 10;
				}

				if(sum == lb)System.out.print(lb + " ");
				lb += 1;
			}
		System.out.println("\nPallindrome Terminated!!!\n");
	}
}

class ExtendThread{

	public static void main(String arg[]){

		Scanner inp = new Scanner(System.in);
		int lb, ub;

		System.out.print("Enter Lower Bound:- ");
		lb = inp.nextInt();

		System.out.print("Enter Upper Bound:- ");
		ub = inp.nextInt();
		new NewThread(lb, ub);

		try{
			System.out.println("\nExcuting Main Thread");
			System.out.println("\nPrinting all number divisible by 5 in range ["+ lb + " - " + ub +"]");
			for(int i = lb; i <= ub; i++){
				if(i % 5 == 0) System.out.print(i + " ");	
			}
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("Main thread Interupted" + e);
		}

		System.out.println("\nMain thread Terminated\n");

	}
}