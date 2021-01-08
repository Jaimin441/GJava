import java.util.*;
import java.lang.Math;

class QuadEquSolver{
	public static void findRoot(double a, double b, double c){
		double d;
		d = (b*b - (4*a*c));
		if(d < 0){ System.out.println("Roots are complex");}
		else{
			System.out.println("D = "+d);
			System.out.println("sqrt(d) = "+Math.sqrt(d));
			double x1, x2;
			x1 = ( (-b) + Math.sqrt(d) ) / (2*a);
			x2 = ( (-b) - Math.sqrt(d) ) / (2*a);

			System.out.println("\nRoots are "+x1+" & "+ x2);
		}
	}
	public static void main(String arg[]){
		double a, b, c, d;
		if(arg.length == 0){
			Scanner inp = new Scanner(System.in);
			System.out.print("Enter Co-efficient of X^2:- ");
			a = inp.nextDouble();

			System.out.print("Enter Co-efficient of X^1:- ");
			b = inp.nextDouble();

			System.out.print("Enter Co-efficient of X^0:- ");
			c = inp.nextDouble();

			findRoot(a, b, c);
		}
		else{
			a = Double.parseDouble(arg[0]);
			b = Double.parseDouble(arg[1]);
			c = Double.parseDouble(arg[2]);

			findRoot(a, b, c);
		}
	}
}