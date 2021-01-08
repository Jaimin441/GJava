import java.util.*;

class SalvageVal{

	//Method to calculate salvage value 
	public static double get_sv(double d, double y, double p){ return (p - (d*y)); }

	public static void main(String arg[]){
		if(arg.length == 0){
			Scanner inp = new Scanner(System.in);

			System.out.print("Enter the Annual Depreciation Cost:- ");
			double dep = inp.nextDouble();

			System.out.print("Enter the Year of service:- ");
			double yos = inp.nextDouble();

			System.out.print("Enter Purchase price:- ");
			double pp = inp.nextDouble();

			System.out.println("Salvage Value = "+get_sv(dep, yos, pp));
		}
		else{
			double dep = Double.parseDouble(arg[0]);
			double yos = Double.parseDouble(arg[1]);
			double pp = Double.parseDouble(arg[2]);

			System.out.println("Salvage value = "+get_sv(dep, yos, pp));
		}
	}
}