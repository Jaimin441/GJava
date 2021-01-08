import java.io.*;

class TinyEditor{

	public static void main(String arg[]){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = new String[100];
		int i;
		System.out.println("Enter 'stop' when done");
		try{
				for(i = 0; i< 100; i++){
				str[i] = br.readLine();

				if(str[i].equals("stop")) break;
			}

			System.out.println("\nPrinting entered text");

				for(i = 0 ; i < 100; i++){ 
					if(str[i].equals("stop")) break;
					System.out.println(str[i]); 
				}
		}
		catch(IOException e){ System.out.println("\nCaught Exception"); }
	}
}