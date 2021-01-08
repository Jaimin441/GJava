import java.util.*;

class MatMul{
	//A general string printer function to just reucduce code row length.
	static void print(String str){ System.out.println(str); }

	//A Function for priting array.
	static void print_arr(int mat[][]){
		//Take range of length of matric i.e. No. of rows
		for(int i = 0; i < mat.length; i++)
		{
			//Take range of length of row in matric at ith row.
			for(int j = 0; j<mat[i].length; j++) System.out.print(mat[i][j]+" ");
			System.out.println("\n");
		}
	}

	//Function for getting input to array.
	static int[][] get_array(int row, int col){
		//Createing a Scanenr object
		int[][] arr = new int[row][col];
		Scanner  inp = new Scanner(System.in);
		print("Enter the elements of array row wise:- ");
		for(int i=0; i< arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++) arr[i][j] = inp.nextInt();
		}
		return arr;
	}

	public static void main(String arg[])
	{
		Scanner inp = new Scanner(System.in);
		int r1, c1, r2, c2;
		//Taking rows and cols for Matrix 1
		System.out.println("Enter Rows and Cols for 1st Matrix:- ");
		r1 = inp.nextInt();
		c1 = inp.nextInt();

		//Taking rows and cols for Matrix 2
		System.out.println("\nEnter Rows and Cols for 2nd Matrix:- ");
		r2 = inp.nextInt();
		c2 = inp.nextInt();

		//New matrix must have shape of Rows in mat1 X Cols in mat2
		if(c1 != r2){
			print("\n!!!Invalid shape for Matrix multiplication.");
			return;
		}

		print("Enter Elements of Matrix A:- ");
		int[][] mat1 = get_array(r1, c1);
		
		print("Enter Elements of Matrix B:- ");
		int[][] mat2 = get_array(r2, c2);

		int[][] mat3 = new int[r1][c2];
			
		//looping for matrix multiplication.
		for(int i = 0; i<r1; i++)
		{
			for(int j = 0; j<c2; j++)
			{
				//We need to loop either for No. of cols in Mat1 or No. of rows in Mat2
				int sum = 0;
				for(int k = 0; k < c1; k++){ sum += (mat1[i][k]*mat2[k][j]); }
				mat3[i][j] = sum;
			}
		}

		print("Matrix A = ");
		print_arr(mat1);
		
		print("Matrix B = ");
		print_arr(mat2);

		print("Matrix C = ");
		print_arr(mat3);
	}
}