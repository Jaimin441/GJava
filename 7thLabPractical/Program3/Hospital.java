import java.util.Scanner;

class MyException extends Exception{
	String name, desig;
	float sal;

	MyException(String d_name, String d_desig, float d_sal){
		name = d_name;
		sal = d_sal;
		desig = d_desig;
	}	

	public String toString(){
		return " Name starts with ["+name+"] and Salary is " + sal + " in range (5-6)lakh";
	}
}

class Hospital{
	String name;
	float salary;
	Scanner hos_inp = new Scanner(System.in);

	public void getVal() throws MyException{
		System.out.print("\nEnter the name:- ");
		name = hos_inp.nextLine();

		System.out.printl("Enter ")
		System.out.print("Enter Salaray(Lakh):- ");
		salary = hos_inp.nextFloat();

		if(name.toUpperCase().startsWith("SA") && salary >= 5 && salary <= 6) throw new MyException("SA", salary);
	}

}

class MainCalss{
	public static void main(String arg[]){
		char choice;
		Scanner inp = new Scanner(System.in);

		while(true){

			try{
				Hospital obj = new Hospital();

				obj.getVal();

				System.out.println("Data stored Successfully!!!");
			}
			catch(MyException e){
				System.out.println("Error caught:- " + e);
			}

			System.out.print("\nDo you want to enter another data?(y/n):-  ");
			choice = inp.next().charAt(0);

			if(choice == 'n') break;
		}

		System.out.println("\nThank you for using our service.");
	}
}