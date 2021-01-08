class gcd{
	static int GCD(int x, int y){
		if(x == y) return x;

		if(x == 0) return x;
		if(y == 0) return y;

		if(x > y) return GCD(x-y, y);
		return GCD(x, y-x);
	}
	public static void main(String arg[]){
		int a = Integer.parseInt(arg[0]);
		int b = Integer.parseInt(arg[1]);

		int ans = GCD(a, b);
		System.out.println("GCD of " + a + " & " + b + " is " + ans);
	}
}