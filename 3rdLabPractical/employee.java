import java.util.Scanner;

class Employee{
	private int salary, no_of_hrs;
	private Scanner inp;
	Employee(){
		inp = new Scanner(System.in);
	}
	void getInfo(){
		System.out.println("Enter the Salary:- ");
		salary = inp.nextInt();

		System.out.println("Enter the number of Hours per Day:- ");
		no_of_hrs = inp.nextInt();
	}

	void AddSal(){ salary += 10; }

	void AddWork(){ salary += 5; }

	void printSal(){
		if(salary < 500) AddSal();

		if(no_of_hrs > 6) AddWork();

		System.out.println("Your Salary is :- $"+salary);
	}
}

class EmpCaller{

	public static void main(String arg[]){
		Employee obj = new Employee();
		obj.getInfo();
		obj.printSal();
	}
}