package package2;
class OtherPackage {
	OtherPackage() {
		package1.Protection p = new package1.Protection();
		System.out.println("other package constructor");
			
		//	Here we can only access to public variable of package1 class
		//	and that also by use of object

		System.out.println("n_pub = " + p.n_pub);
	}
}