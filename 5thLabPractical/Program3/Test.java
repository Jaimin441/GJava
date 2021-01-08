import java.util.Scanner;

abstract class Test{
	abstract void callme();

	void callmetoo(){
		System.out.println("Calling callmetoo of Test");
	}
}
class Test2 extends Test{

	void callme(){
		System.out.println("Calling callme of Test2");
	}
}
class Caller{
	public static void main(String arg[]){
		Test2 obj = new Test2();
		obj.callme();
		obj.callmetoo();
	}
}