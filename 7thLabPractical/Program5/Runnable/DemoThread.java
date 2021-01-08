import java.util.Scanner;
class NewThread implements Runnable{
	Thread t;
	int lb, ub;
	Scanner t_inp = new Scanner(System.in);

	NewThread(int d_lb, int d_ub){
		t = new Thread(this, "Pallindrome");

		lb = d_lb;
		ub = d_ub;

		System.out.println("Demo Thread created " + t);
		System.out.println("Parent Thread = " + this);
		//Start thread
		t.start();
	}

	public void run(){
		int sum;

			System.out.println("\nPrinting Pallindrome in Range [" + lb + " - " + ub + "]");
			//Looping from [lb - ub]
			while(lb <= ub){
				sum = 0;
				int num = lb;
				
				//Checking if lb is pallindrome
				while(num != 0){
					sum = (sum*10) + (num % 10);
					num /= 10;
				}

				if(sum == lb)System.out.println(lb + " ");
				lb += 1;
			}
		System.out.println("Pallindrome Terminated!!!");
	}
}

class DemoThread{

	public static void main(String arg[]){

		Scanner inp = new Scanner(System.in);
		int lb, ub;

		System.out.print("Enter Lower Bound:- ");
		lb = inp.nextInt();

		System.out.print("Enter Upper Bound:- ");
		ub = inp.nextInt();
		new NewThread(lb, ub);

		try{
			System.out.println("Excuting Main Thread");
			System.out.println("Printing all number divisible by 5 in range ["+ lb + " - " + ub +"]");
			for(int i = lb; i <= ub; i++){
				if(i % 5 == 0) System.out.print(i + " ");	
			}
			Thread.sleep(1000);
		}
		catch(InterruptedException e){
			System.out.println("Main thread Interupted" + e);
		}

		System.out.println("Main thread Terminated");

	}
}