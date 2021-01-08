import java.util.Scanner;

class Area{
	private int l, b;
	Area(int d_l, int d_b){
		l = d_l;
		b = d_b;
	}
	Area(){ l = b = 0; }

	public int returnArea(){
		return l*b;
	}
}

class main{

	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);

		int len, bre;
		System.out.println("Enter the length of rectangle:- ");
		len = inp.nextInt();

		System.out.println("Enter the Breadth of rectangle:- ");
		bre = inp.nextInt();

		Area obj = new Area(len, bre);

		System.out.println("Area of rectangle = "+obj.returnArea());
	}
}