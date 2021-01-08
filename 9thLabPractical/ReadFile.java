import java.io.*;

class ReadFile{
	public static void main(String arg[]) throws IOException{
		int i;
	
		FileInputStream fin;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try{
			fin = new FileInputStream(arg[0]);
		}
		catch(FileNotFoundException e){ System.out.println("Error in Opening file"); return;}
		catch(ArrayIndexOutOfBoundsException e){ System.out.println("No file mentioned"); return;}

		System.out.println("Printing content of "+arg[0]);
		do{
			i = fin.read();
			if(i != -1) System.out.print((char) i);
		}while(i != -1);

		fin.close();
	}
}