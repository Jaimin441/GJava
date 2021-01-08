import java.util.Scanner;

class UsingThread implements Runnable{
	Thread t;
	Scanner inp = new Scanner(System.in);

	UsingThread(String name){
		t = new Thread(this, name);
		t.start();
	}

	public void run(){
		
		if(t.getName().equals("Prime")){

			if(getPrime()){
				System.out.println("Number is Prime");
			}
			else{
				System.out.println("Number is Not Prime");	
			}
		}
		else{
			if(getOddEven()){
				System.out.println("Number is Even");
			}
			else{
				System.out.println("Number is Not Odd");	
			}
		}
	}

	private synchronized boolean getPrime(){
		System.out.print("Enter the number:- ");
		int num = inp.nextInt();
	
		if(num == 0 || num == 1) return false;
		else if(num == 2) return true;

		else{
			for(int i = 2; i < num; i++){
				if(num % i == 0 ) return false;
			}

			return true;
		}
	}

	private synchronized boolean getOddEven(){
		System.out.print("Enter the number:- ");
		int num = inp.nextInt();
		
		if(num % 2 == 0) return true;
		else return false;
	}

}

class mainClass{
	public static void main(String arg[]){
		UsingThread obj1 = new UsingThread("Prime");
		UsingThread obj2 = new UsingThread("OddEven");

		try{
			obj1.t.join();
			obj2.t.join();
		}
		catch(InterruptedException e){
			System.out.println("Thread execution interrupted");
		}
	}
}