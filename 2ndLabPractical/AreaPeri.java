import java.util.*;

class AreaPeri{

	public static void main(String arg[]){
		if(arg.length == 0){
			Scanner inp = new Scanner(System.in);
			System.out.println("Enter the Length and Breath of Rectangle:- ");
			
			int l = inp.nextInt();
			int b = inp.nextInt();

			//Area = l*b
			System.out.println("Area of rectangle = "+(l*b));

			//Perimeter = 2*(l + b)
			System.out.println("Perimeter of rectangle = "+(2*(l + b)));
		}
		else{
			//Agrument from cmd prompt are string hence string can be converted to integer by Integer class
			int l = Integer.parseInt(arg[0]);
			int b = Integer.parseInt(arg[1]);
			
			System.out.println("Area of rectangle = "+(l*b));
			System.out.println("Perimeter of rectangle = "+(2*(l + b)));
		}
	}
}