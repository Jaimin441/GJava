import java.util.Scanner;

abstract class Figure{
	protected Scanner inp = new Scanner(System.in);

	abstract void area();
}

class Square extends Figure{
	double l;

	void get_data(){
		System.out.println("Enter the value of length:- ");
		l = inp.nextDouble();
	}

	void area(){
		System.out.println("Area of Square = "+(l*l));
	}
}

class Triangle extends Figure{
	double l, b;

	void get_data(){
		System.out.println("Enter the value of L:-");
		l = inp.nextDouble();

		System.out.println("Enter the value of B:-");
		b = inp.nextDouble();
	}

	void area(){
		System.out.println("Area of Triangle = "+(0.5*l*b));
	}
}

class Caller{

	public static void main(String arg[]){
		Square sobj = new Square();
		sobj.get_data();
		sobj.area();

		Triangle tobj = new Triangle();
		tobj.get_data();
		tobj.area();		
	}
}