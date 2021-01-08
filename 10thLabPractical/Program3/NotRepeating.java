import java.util.Scanner;

class NotRepeating{
	public static String findNotRepeating(String word){
		
		String non_repeat_str = "";
		boolean is_unique;;
		for(int i = 0; i < word.length(); i++){
			is_unique = true;
			for(int j = 0; j < word.length(); j++){
				if(i != j && Character.toLowerCase(word.charAt(i)) == Character.toLowerCase(word.charAt(j))){
					is_unique = false;
					break;
				}
			}

			if(is_unique) non_repeat_str += word.charAt(i) + ", ";
		}

		non_repeat_str = non_repeat_str.substring(0, non_repeat_str.length()-2);
		return non_repeat_str;
	}

	public static void main(String arg[]){
		String word;
		String non_repeat;
		if(arg.length != 0){
			word = arg[0];
		}
		else{
			Scanner inp = new Scanner(System.in);
			System.out.print("Enter String:- ");
			word = inp.nextLine();
		}

		non_repeat = findNotRepeating(word);

		if(non_repeat.length() > 0) System.out.println("Non Repeating Characters are:- " + non_repeat);
		else{
			System.out.println("Non Unique Character found");
		}
	}
}