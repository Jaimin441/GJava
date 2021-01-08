import java.util.Scanner;
class StringPermu{
	public static void getPermutation(String word){
		int len = word.length();
		int i, j, cnt;
		String per;
		for(i = 0; i < len; i++){
			per = ""; 	// Initializing for first time
			per += word.charAt(i);	// Appending the ith char

			for(j = 1; j <= (len-1); j++){
				cnt = i+j;	//	Moving the counter through all words
				System.out.print("Permutation = " + per);
				while((len-1) > 0){
					cnt %= word.length();
					if(word.charAt(cnt) != word.charAt(i)){	// Skipping the letter that is the already the first letter
						System.out.print(word.charAt(cnt));
						len -= 1;
					}
					cnt += 1;
				}
				System.out.println();
				len = word.length();
			}
		}
	}

	public static void main(String arg[]){
		String word;
		if(arg.length != 0){
			word = arg[0];
		}
		else{
			Scanner inp = new Scanner(System.in);
			System.out.print("Enter a string:- ");
			word = inp.nextLine();
		}

		getPermutation(word);
	}
}