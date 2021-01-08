package package1;

class Derived extends Protection{
	Derived() {
		System.out.println("derived constructor");
		System.out.println("n = " + n);
		
		//	As this is a derived class
		//	we cannot make use of priate varibale
		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}