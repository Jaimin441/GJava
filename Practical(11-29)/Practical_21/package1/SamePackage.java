package package1;
	class SamePackage {
	SamePackage() {
		Protection p = new Protection();
		System.out.println("same package constructor");
		System.out.println("n = " + p.n);
			
		//	Here we can use all variable of class
		//	By use of object but not private variable;

		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}