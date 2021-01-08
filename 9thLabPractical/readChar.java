import java.io.*;

class readChar{

	public static void main(String arg[]){
		int i;

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 'q' or 'Q' to exit\n");

		try{
			do{
				i = (char) bf.read();

				if(i != 'q'){
					System.out.println((char) i);
				}
			}while(i != 'q');
		}
		catch(IOException e){ System.out.println("\nException caught."); }
	}
}