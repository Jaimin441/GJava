import java.util.*;
class ShowResult{

	public static boolean inRange(int val, int high, int low){
		if(val <= high && val >= low) return true;
		else{ return false; }
	}
	public static void display(int marks){
		if(inRange(marks, 100, 80)){ System.out.println("\nDistinction"); }
		else if(inRange(marks, 79, 60)){ System.out.println("\nFirst Class"); }
		else if(inRange(marks, 59, 35)){ System.out.println("\nSecond Class"); }
		else{ System.out.println("\nFail"); }
	}

	public static void main(String arg[]){
		int marks;
		if(arg.length == 0){
			Scanner inp = new Scanner(System.in);
			System.out.print("Enter Marks:- ");
			marks = inp.nextInt();

			display(marks);
		}
		else{
			marks = Integer.parseInt(arg[0]);
			display(marks);
		}
	}
}