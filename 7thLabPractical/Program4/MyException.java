import java.util.Scanner;

class MyException extends Exception{
	String except;

	float cpi;
	int age;
	String dept;
	MyException(String d_dept, float d_cpi, int d_age){
		dept = d_dept;
		cpi = d_cpi;
		age = d_age;
		except = "Exception Caught\nDept:- [" +dept+ "] cpi:- [" +cpi+ "] age:-[" +age+ "]";
	}

	public String toString(){
		return except;
	}
}

class College{
	private String dept;
	private int age;
	private float cpi;

	void getData() throws MyException{
		Scanner inp = new Scanner(System.in);

		System.out.print("Enter Department:- ");
		dept = inp.nextLine();

		System.out.print("Enter CPI:- ");
		cpi = inp.nextFloat();

		System.out.print("Enter Age:- ");
		age = inp.nextInt();

		if(dept.equals("IT")){
			if (cpi >= 4.5 && cpi <= 6.5){
				if(age == 21){
					throw new MyException(dept, cpi, age);
				}
			}
		}
	}

	void display(){
		System.out.println("\nDisplaying data\nDepartment:- "+dept);
		System.out.println("CPI -> "+cpi);
		System.out.println("Age -> "+age);
	}
}

class CallerCollege{
	public static void main(String arg[]){
		
		Scanner inp = new Scanner(System.in);
		char choice;

		while(true){
			try{
				System.out.println("Enter data");
				College obj = new College();
				obj.getData();

				System.out.println("Data stored Successfully!!!");
			}
			catch(MyException e){
				System.out.println("Error caught:- " + e);
			}

			System.out.print("\nDo you want to enter another data?(y/n):- ");
			choice = inp.next().charAt(0);

			if(choice == 'n') break;
		}

		System.out.println("\nThanks for using over service");
	}
}