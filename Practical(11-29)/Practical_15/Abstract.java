import java.util.Scanner;

abstract class circle{
	final double pi = 3.14;
	int r;

	abstract void getRadius(int d_R);
	abstract double findArea();
}

class area extends circle{
	final double pi = 3.14;

	void getRadius(int d_R){ r = d_R; }

	double findArea(){
		return 2 * pi * r * r;
	}
}

class main{
	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);
		circle cref;
		
		System.out.println("Enter Raidus:- ");
		cref = new area();
		cref.getRadius(inp.nextInt());

		System.out.println("Radius = "+cref.r+"\tArea = "+cref.findArea());
	}
}