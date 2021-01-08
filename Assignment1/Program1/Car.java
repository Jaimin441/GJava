import java.util.Scanner;

class Car{
	int model_no;
	String name, color;
	Scanner inp = new Scanner(System.in);

	public void getCarDetials(){
		System.out.print("\nEnter Model Number:- ");
		model_no = inp.nextInt();

		System.out.print("Enter Name:- ");
		inp.nextLine();	//	This is just to catch the \n from previous input value
		name = inp.nextLine();

		System.out.print("Enter Color:- ");	//	no Need of black inp.nextLine() as upper value takes last \n char
		color = inp.nextLine();

		System.out.println("\nDetails Stored Successfully!!!!");
	}

	public void showCarDetials(){
		System.out.println("\nModel No:- " + model_no);
		System.out.println("Name:- " + name);
		System.out.println("Color:- " + color);
	}
}

class MainClass{
	public static void pattern(int limit, char ch){
		System.out.println();
		for(int i = 0; i < limit; i++) System.out.print(ch);
		System.out.println();
	}

	public static void main(String args[]){
		int i;
		int LIMIT = 30;
		System.out.print("Enter Car details");

		Car cars[] = new Car[3];
		pattern(LIMIT, '=');

		for(i = 0; i < 3; i++){
			System.out.println("Enter info of car " + (i+1));
			cars[i] = new Car();
			cars[i].getCarDetials();
		}

		System.out.println("\nPrinting Car Details");
		pattern(LIMIT, '=');
		for(i = 0; i < 3; i++){
			System.out.println("Detial for car No:- " + (i+1));
			cars[i].showCarDetials();
			pattern(LIMIT, '-');
		}
	}
}