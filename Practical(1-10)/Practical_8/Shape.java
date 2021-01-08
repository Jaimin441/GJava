import java.util.*;

class Shape{
	private int l, b;
	String shape_name;

	Shape(){
		l = 0;
		b = 0;
		shape_name ="None";
	}
	Shape(int d_x){
		l = b = d_x;
		shape_name = "Square";
	}
	Shape(int d_l, int d_b){
		l = d_l;
		b = d_b;
		shape_name = "Rectangle";
	}

	void increaseLen(int x){
		l += x;
		System.out.println("\nNew length = "+l);
	}

	void increaseLen(int x, int y){
		l += x;
		b += y;
		System.out.println("\nNew length = "+l);
		System.out.println("New Breadth = "+b);
	}

	void printArea(){
		System.out.println("\nShape: "+shape_name);
		if(shape_name == "Square") System.out.println("Length = "+l);
		else{
			System.out.println("Length = "+l);
			System.out.println("Breadth = "+b);
		}
		System.out.println("Area = "+(l*b));
	}
}

class caller{

	public static void main(String arg[]){

		Shape sqr = new Shape(5);
		Shape rect = new Shape(3, 4);

		sqr.printArea();
		rect.printArea();

		sqr.increaseLen(1);
		rect.increaseLen(2, 1);

		sqr.printArea();
		rect.printArea();

	}
}