import java.util.*;

class shape{
	String name;

	shape(String d_name){
		name = d_name;
	}

	public void Show(){
		System.out.println("Shape is "+name);
	}
}

class rectangle extends shape{
	int l, b;

	rectangle(String d_name, int d_l, int d_b){
		super(d_name);
		l = d_l;
		b = d_b;
	}

	rectangle(){
		super("Rectangle");
		l = 0;
		b = 0;
	}

	public void Show(){
		super.Show();
		System.out.println("Length = "+l+" Breadth = "+b+" Area = "+(l*b));
	}
}

class inheritance{
	public static void main(String arg[]){
		String name = arg[0];
		int l = Integer.parseInt(arg[1]);
		int b = Integer.parseInt(arg[2]);

		rectangle obj = new rectangle(name, l, b);

		System.out.println("\nDisplaying Info.");
		obj.Show();
	}
}