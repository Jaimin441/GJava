import java.util.Scanner;

class class1{
	int a;

	class1(int d_a){
		a = d_a;
	}
}
class class2 extends class1{
	int b;

	class2(int d_a, int d_b){
		super(d_a);
		b = d_b;
	}
}
class class3 extends class2{
	int c;
	class3(int d_a, int d_b, int d_c){
		super(d_a, d_b);
		c = d_c;
	}
}
class class4 extends class3{
	int d;
	class4(int d_a, int d_b, int d_c, int d_d){
		super(d_a, d_b, d_c);
		d = d_d;
	}

	double avg(){
		return (a + b + c + d) / 4.0;
	}
}

class Caller{
	public static void main(String arg[]){
		int a = Integer.parseInt(arg[0]);
		int b = Integer.parseInt(arg[1]);
		int c = Integer.parseInt(arg[2]);
		int d = Integer.parseInt(arg[3]);

		class4 obj = new class4(a, b, c, d);

		System.out.println("Average = "+obj.avg());
	}
}