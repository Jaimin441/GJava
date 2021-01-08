import java.util.Scanner;

class AddMat{
	static void print(String str){ System.out.print(str); }

	static void printMat(int mat[][]){
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j< mat[i].length; j++){
				print(mat[i][j]+" ");
			}
			print("\n");
		}

	}
	static int [][] getMat(int mat[][]){
		Scanner inp = new Scanner(System.in);
		for(int i = 0; i< mat.length; i++){
			for(int j = 0; j<mat[i].length; j++) mat[i][j] = inp.nextInt();
		}

		return mat;
	}
	public static void main(String arg[]){
		Scanner inp = new Scanner(System.in);
		int mat1[][], mat2[][], mat3[][];
		int r, c;

		print("Enter the No. of Rows:- \n");
		r = inp.nextInt();

		print("Enter the No. of Columnss:- \n");
		c = inp.nextInt();

		//Initailizing all matrix
		mat1 = new int[r][c];
		mat2 = new int[r][c];
		mat3 = new int[r][c];

		print("Enter Element for Matrix 1 \n");
		getMat(mat1);

		print("Enter Element for Matrix 2 \n");
		getMat(mat2);
		for(int i = 0; i<r; i++){
			for(int j = 0; j< c; j++){mat3[i][j] = mat1[i][j] + mat2[i][j]; }
		}

		print("Matrix 1 = \n");
		printMat(mat1);

		print("Matrix 1 = \n");
		printMat(mat2);

		print("Mat1 + Mat2 = \n");
		printMat(mat3);
	}
}