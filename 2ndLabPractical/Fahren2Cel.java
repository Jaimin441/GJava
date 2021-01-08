import java.util.*;

//Choice variable here specifies the chocie that to convert Celcius to Fahrenheit or ViceVersa
//If choice is 1 than Celcius to Fahrenheit if 2 than Fahrenheit to Celcius
class UnitConverter{

	//Method to convert unit from Fahrenheit to Celcius
	public static Double c2F(double celcius){ return ((1.8*celcius) + 32); }

	//Method to convert unit from celcius to Fahrenheit
	public static Double f2C(double fahrenheit){ return ((fahrenheit-32)*5)/9; }

	public static void main(String arg[]){
		double unit;
		int choice;
		if(arg.length == 0){
			Scanner inp = new Scanner(System.in);
			System.out.print("Enter the Temprature:- ");
			unit = inp.nextDouble();

			System.out.println("Enter chocie");
			System.out.println("1 -> Celcius to Fahrenheit");
			System.out.println("2 -> Fahrenheit to Celcius");
			choice = inp.nextInt();
			
			if(choice == 1){ System.out.print("Answer = "+c2F(unit)+" F"); }
			else{ System.out.println("Answer = "+f2C(unit)+" C"); }
		}
		else{
			unit = Double.parseDouble(arg[0]);
			choice = Integer.parseInt(arg[1]);

			if(choice == 1){ System.out.print("Answer = "+c2F(unit)+" F"); }
			else{ System.out.println("Answer = "+f2C(unit)+" C"); }
		}
	}
}