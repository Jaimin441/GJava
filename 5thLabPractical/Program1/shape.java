import java.util.Scanner;
class Shape{
	double l, b;
	private Scanner inp = new Scanner(System.in);
	public void get_data(){
		System.out.println("Enter the value for L:- ");
		l = inp.nextDouble();

		System.out.println("Enter the value for B:- ");
		b = inp.nextDouble();
	}
}

class Rectangle extends Shape{
	double area;
	public void display_area(){
		super.get_data();

		area = l*b;
		System.out.println("Area of Rectangle = "+area);
	}
}

class Triangle extends Shape{
	double area;

	public void display_area(){
		super.get_data();

		area = 0.5*l*b;
		System.out.println("Area of Triangle = "+area);
	}	
}

class Caller{
	public static void main(String arg[]){
		Rectangle robj = new Rectangle();

		System.out.println("\nEnter length & breadth of rectangle");
		robj.display_area();

		Triangle tobj = new Triangle();
		System.out.println("\nEnter Length & base of Triangle");
		tobj.display_area();
	}
}