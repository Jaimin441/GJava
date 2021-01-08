import java.util.Scanner;

class NewThread implements Runnable{
	int lb, ub;
	Thread t;

	NewThread(int d_lb, int d_ub){
		lb = d_lb;
		ub = d_ub;
		t = new Thread(this, "Angstrom");
		t.start();
	}

	private int getNoDigit(int num){
		int cnt = 0;
		while(num != 0){
			num /= 10;
			cnt+= 1;
		}
		return cnt;
	}
	private int getPow(int x, int y){
		int ans = 1;
		for(int i = 0; i < y; i++){ ans*= x; }
			return ans;
	}
	public void run(){
		int tot_dig, sum, num;
		try{
				for(int i = lb; i <= ub; i++){
					num = i;
					tot_dig = getNoDigit(num);
				
					sum = 0;
					while(num != 0){
						sum += getPow(num%10, tot_dig);
						num /= 10;
					}
					if(sum == i){ System.out.println("Armstrong := " + i); }
					Thread.sleep(500);
				}
			}
			catch(InterruptedException e){ System.out.println("Child Thread Interrupted!!!"); }

			System.out.println("Child Thread Exiting");
		}
}

class Main{

	private static boolean isPrime(int num){
		if(num == 1) return false;
		else if(num == 2) return true;
		else{
			for(int i = 2; i < num; i++) if(num % i == 0 ) return false;

			return true;
		}
	}

	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);

		int low_bnd, up_bnd;
		
		System.out.print("Enter Lower bound:- ");
		low_bnd = inp.nextInt();

		System.out.print("Enter Upper bound:- ");
		up_bnd = inp.nextInt();

		NewThread t = new NewThread(low_bnd, up_bnd);

		try{
				for(int i = low_bnd; i <= up_bnd; i++){
				if(isPrime(i)){ System.out.println("Prime :- " + i); }
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e){ System.out.println("Main Thread Interrupted"); }

		System.out.println("Exiting Main Thread");
	}
}