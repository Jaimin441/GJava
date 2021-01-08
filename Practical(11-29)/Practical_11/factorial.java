//Program for finding factorial using recursion
class factorial{
	static int fact(int val){
		if(val == 1) return 1;
		else return val*fact(val-1);
	}
	public static void main(String arg[]){
		int x = Integer.parseInt(arg[0]);
		int ans = fact(x);
		System.out.println(x + "! = " + ans);
	}
}