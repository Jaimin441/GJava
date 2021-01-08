class something{
	something(){
		System.out.println("Something is intialized");
	}

	protected void finalize(){
		System.out.println("Object destroyed");
	}
}
class CallSomething{
	
	public static void main(String arg[]){
		System.out.println("Going in block");

		{
			something obj = new something();
		}
	}	
}