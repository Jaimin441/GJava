import java.util.Scanner;

class MyException extends Exception{
	int i, j;

	MyException(int d_i, int d_j){
		//Stroing the indices where error is occured.
		i = d_i;
		j = d_j;
	}

	public String toString(){
		return "Invalid value at Index '"+ i +"' & '"+ j +"' ";
	}
}

class HillValley{
	int[] seq;
	int len;

	HillValley(int d_len){
		len = d_len;
		seq = new int[len];
	}

	Scanner inpSeq = new Scanner(System.in);

	void getSeq(){
		int i = 0;

		System.out.println("Enter the Numbers:- ");

		for(i = 0; i < len; i++){
			seq[i] = inpSeq.nextInt();
		}
	}

	void checkSeq() throws MyException{
		int i;
		//Checking for 1st half which is Increasing
		for(i = 0; i < (len/2) - 1; i++){
			if(seq[i+1] < seq[i]) throw new MyException(i, i+1);
		}

		for(i = (len/2); i < len-1; i++){
			if(seq[i] > seq[i+1]) throw new MyException(i, i+1);
		}
	}
}

class MainClass{
	public static void main(String arg[]){
		char choice;
		int len;
		Scanner inp = new Scanner(System.in);
		while(true){
			try{

				System.out.println("\nEnter the number of element:");
				len = inp.nextInt();

				HillValley obj = new HillValley(len);

				obj.getSeq();
				obj.checkSeq();

				System.out.println("\nEntered Sequence is Hill-Valley Sequence.");
			}
			catch(MyException e){
				System.out.println("Error Caught:- " + e);
			}
			
			System.out.println("Do you want to check another Seq?(y/n)");
			choice = inp.next().charAt(0);

			if(choice == 'n') break;
		}	

		System.out.println("Thanks for using our service");
	}
}