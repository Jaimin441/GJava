import java.util.*;

class Dates{

	private int size = 10;
	private String dates;
	private String[] month = {"January", "February", "March", "April", "May" , "June", "July", "August", "September",
							  "October", "November", "December"};

	public Scanner inp = new Scanner(System.in);

	public void getDates(){
		System.out.println("\nEnter the Dates in 'DD/MM/YY' Format:");
		dates = inp.nextLine();
	}
	
	public String formatDate(String old_date){
		//Input date will of DD / MM / YY. We will omit '/' sign
		char[] val = old_date.toCharArray();
		String str = ""+val[0]+val[1];
		int date = Integer.parseInt(str);
		
		str = ""+val[3]+val[4];
		int mnth = Integer.parseInt(str)-1;

		str = ""+val[6]+val[7];
		int year = Integer.parseInt(str);
		System.out.println("mnth = " + mnth);
		String final_date = Integer.toString(date)+"th "+month[mnth]+" 19"+Integer.toString(year); 
		return final_date;

	}
	public void printDate(){
		System.out.println("\nPrinting Date:");

		String formattedDate = formatDate(dates);
		System.out.println("Your Dates is :- " + formattedDate);
	}
}	
class caller{
	public static void main(String arg[]){
		Dates obj = new Dates();
		obj.getDates();
		obj.printDate();
	}
}