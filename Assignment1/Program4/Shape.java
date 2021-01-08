import java.util.Scanner;

abstract class Shape{
	double dim1, dim2;
	String color;

	Shape(int d_dim1, int d_dim2, String d_clr){
		dim1 = d_dim1;
		dim2 = d_dim2;
		color = d_clr;	
	}

	Shape(int d_dim1, String d_clr){
		dim1 = d_dim1;
		dim2 = 0;
		color = d_clr;
	}
	public void display(){
		System.out.print("\nDisplaying Property of ");
	}
	public abstract void area();
}

class Triangle extends Shape{
	Triangle(int dim1, int dim2, String clr){
		super(dim1, dim2, clr);
	}

	public void display(){
		super.display();
		System.out.println("Triangle");
		System.out.println("Length = " + dim1);
		System.out.println("Height = " + dim2);
		System.out.println("Color = " + color);
		area();
	}
	public void area(){
		System.out.println("Area of Triangle = " + (0.5*dim1*dim2));
	}
}

class Square extends Shape{
	Square(int dim1, int dim2, String clr){
		super(dim1, dim2, clr);
	}

	public void display(){
		super.display();
		System.out.println("Square");
		System.out.println("Length = " + dim1);
		System.out.println("Breadth = " + dim2);
		System.out.println("Color = " + color);
		area();
	}
	public void area(){
		System.out.println("Area of Square = " + (dim1*dim2));
	}
}

class Rectangle extends Shape{
	Rectangle(int dim1, int dim2, String clr){
		super(dim1, dim2, clr);
	}

	public void display(){
		super.display();
		System.out.println("Rectangle");
		System.out.println("Length = " + dim1);
		System.out.println("Breadth = " + dim2);
		System.out.println("Color = " + color);
		area();
	}
	public void area(){
		System.out.println("Area of Rectangle = " + (2*(dim1+dim2)));
	}
}

class Circle extends Shape{

	Circle(int dim1, String clr){
		super(dim1, clr);
	}

	public void display(){
		super.display();
		System.out.println("Circle");
		System.out.println("Radius = " + dim1);
		System.out.println("Color = " + color);
		area();
	}
	public void area(){
		System.out.println("Area of Circle = " + (2*3.14*dim1*dim1));
	}
}

class MainCaller{
	public static void main(String arg[]){
		Triangle triangle = new Triangle(5, 4, "Red");
		Rectangle rectangle = new Rectangle(4, 6, "Orange");
		Square square = new Square(5, 5, "Black");
		Circle circle = new Circle(7, "Cyan");

		triangle.display();

		rectangle.display();

		square.display();

		circle.display();
	}
}