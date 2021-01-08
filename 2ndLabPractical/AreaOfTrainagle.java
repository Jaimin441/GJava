import java.util.*;
import java.lang.Math;
class AreaOfTriangle{

	public static double area(int a, int b, int c){
		double s = (a * b * c)/2.0;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	public static void main(String arg[]){
		int a, b, c;
		if(arg.length == 0){
			Scanner inp = new Scanner(System.in);
			System.out.print("Enter the value for side 1:- ");
			a = inp.nextInt();

			System.out.print("Enter the value for side 2:- ");
			b = inp.nextInt();

			System.out.print("Enter the value for side 3:- ");
			c = inp.nextInt();

			System.out.print("\nArea of triangle = "+area(a, b, c));
		}
		else{
			a = Integer.parseInt(arg[0]);
			b = Integer.parseInt(arg[1]);
			c = Integer.parseInt(arg[2]);

			System.out.print("\nArea of triangle = "+area(a, b, c));
		}
	}
}