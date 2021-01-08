import java.io.*;

class CopyFile{

	public static void main(String arg[]) throws IOException{
		int i;
		FileInputStream fin;
		FileOutputStream fout;

		try{

			try{
				fin = new FileInputStream(arg[0]);
			}
			catch(FileNotFoundException e){ 
				System.out.println(arg[0] + " File not Found"); 
				return;
			}

			try{
				fout = new FileOutputStream(arg[1]);
			}
			catch(FileNotFoundException e){ 
				System.out.println(arg[1] + " File not Found"); 
				return;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception " + e);
			return;
		}

		try{
			do{
				i = fin.read();

				if(i != -1) fout.write(i);
			}while(i != -1);

			System.out.println("Copied Content successfully from " + arg[0] + " to " + arg[1]);
		}
		catch(IOException e){ System.out.println("Exception Caught " + e); }
		finally{
			fin.close();
			fout.close();
		}
	}
}