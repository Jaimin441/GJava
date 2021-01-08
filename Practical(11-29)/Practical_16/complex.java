import java.util.Scanner;

class complex{
	private double r, img;
	private Scanner inp = new Scanner(System.in);
	complex(){r = img = 0;}
	complex(double d_r, double d_img){
		r = d_r;
		img = d_img;
	}

	public void get(){
		System.out.print("Enter Real part:- ");
		r = inp.nextDouble();

		System.out.print("Enter imaginary part:- ");
		img = inp.nextDouble();
	}
	public complex add(complex obj){
		complex new_obj = new complex();
		new_obj.r = this.r + obj.r;
		new_obj.img = this.img + obj.img;
		return new_obj;
	}

	public complex subtract(complex obj){
		complex new_obj = new complex();
		new_obj.r = this.r - obj.r;
		new_obj.img = this.img - obj.img;
		return new_obj;
	}
	public void display(){
		System.out.println(r+" + i"+img);
	}
}

class caller{
	public static void main(String arg[])
	{
		complex obj1 = new complex();
		obj1.get();

		complex obj2 = new complex(2, 3);

		complex obj3 = obj1.add(obj2);
		complex obj4 = obj1.subtract(obj2);

		System.out.println("\nDisplaying objects ");

		obj1.display();
		obj2.display();

		System.out.println("Displaying obj1 + obj2");
		obj3.display();

		System.out.println("Displaying obj1 - obj2");
		obj4.display();
	}
}