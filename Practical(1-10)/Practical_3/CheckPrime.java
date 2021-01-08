import java.util.*;
class CheckPrime{
	public static void main(String agr[])
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter from where you want to start:- ");
		int strt = inp.nextInt();
		System.out.println("Enter where to end:- ");
		int end = inp.nextInt();

		//Looping from start to end to find all prime number
		for(int i = strt; i < end; i++)
		{	
			if(i == 2){ System.out.println(i+" is Prime"); }
			else if(i % 2 == 0){ continue; }
			else{
				int flag = 0;
				//Loop from 2 to i-1 to see if I has any factorial if not than its print its prime
				for(int j = 2; j <i; j++){ if(i % j == 0){ flag = 1; break;} }
					//Check for flag bit if is 0 than number is Prime
					if(flag == 0){ System.out.println(i+" is Prime"); }
				}
		}		
	}

}