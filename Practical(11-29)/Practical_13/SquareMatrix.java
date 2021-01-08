import java.util.*;
class SquareMatrix{

	static Boolean isMagicSquare(int mat[][]){
		int sumRow, sumCol, n_sumRow = 0, n_sumCol = 0;
		int i, j;
		for(i = 0; i< mat.length; i++){
			//Intitalizing value
			sumRow = 0;
			sumCol = 0;
			for(j = 0; j < mat[i].length; j++){
				sumRow += mat[i][j];
				sumCol += mat[j][i];
			}
			//Checking id sum of last row/col = sum of this row/col
			//If not then return false else store current value to specified vars.
			if( i == 0 ){
				n_sumRow = sumRow;
				n_sumCol = sumCol;
			 	continue;
			}
			if(sumRow != n_sumRow){ return false; }
			else if(sumCol != n_sumCol){ return false; }
			else{
				n_sumRow = sumRow;
				n_sumCol = sumCol;
			}
		}

		return true;
	}

	static void print(String str){
		System.out.println(str);
	}

	static void print(int mat[][]){
		print("\nPrinting Matrix");
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j< mat[i].length; j++){ System.out.print(mat[i][j]+" "); }
			print("");
		}
	}
	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);

		int r, c, i, j;
		int[][] mat;
		print("Enter the number of rows:- ");
		r = inp.nextInt();
		print("Enter the number of cols:- ");
		c = inp.nextInt();

		mat = new int[r][c];
		print("Enter Elements:- ");
		for(i = 0; i< r; i++){
			for(j = 0; j< c; j++){
				print("Mat["+i+"]["+j+"]:- ");
				mat[i][j] = inp.nextInt();
			}
		}

		print(mat);
		if(isMagicSquare(mat)){
			print("It is a Square Matrix");
		}
		else{
			print("No !! Not a Square Matrix");
		}

	}
}