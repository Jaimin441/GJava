import java.util.Scanner;

class MyException extends Exception{
	private int val;

	MyException(int d_val){
		val = d_val;
	}

	public String toString(){
		return "Number ["+val+"] is a perfect Number";
	}
}

class Perfect{
	int n;

	Perfect(){
		n = 0;
	}

	Perfect(int d_n){
		n = d_n;
	}	
	void ifPerfect() throws MyException{
		int i, sum = 0;

		for(i = 1; i< n; i++){
			if( n%i == 0) sum += i;
		}

		//If its perfect number then throw MyException object.
		if(sum == n){ throw new MyException(n);}
	}
}

class mainClass{
	public static void main(String arg[]){
		int num;
		Scanner inp = new Scanner(System.in);

		System.out.println("Enter '-1' When done !!!\n");
		Perfect obj = new Perfect();

		while(true){
			try{
				System.out.print("\nEnter number:- ");
				obj.n = inp.nextInt();
				
				if(obj.n == -1) break;

				obj.ifPerfect();

				System.out.println("Number "+obj.n+" is not a Perfect Number");
			}
			catch(MyException e){
				System.out.println("Error Caught:- " + e);
			}
		}
	}
}