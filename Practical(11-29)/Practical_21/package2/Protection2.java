package package2;
class Protection2 extends package1.Protection {
	
	Protection2() {
		System.out.println("derived other package constructor");
			
		//	Here we cannot use Private and No-access specifier variables

		System.out.println("n_pro = " + n_pro);
		System.out.println("n_pub = " + n_pub);
	}
}