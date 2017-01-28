import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CellShift {

	public static void main(String[] args) {
		int rows, columns;
		Random random = new Random();
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number of rows: ");
		rows = scan.nextInt();
		System.out.println("Enter the number of columns: ");
		columns = scan.nextInt();

		int [][]matrix = new int[rows][columns];
		for( int i = 0 ; i < matrix.length ; i++ ) { 
			for ( int j = 0 ; j < matrix[i].length ; j++ ) { 
				matrix[i][j] = random.nextInt(101);
			}
		}
		System.out.println("Original Matrix: ");
		for( int[] a : matrix ) { 
			System.out.println( Arrays.toString( a ));
		}
		int shifted[][] = cellShift(matrix);
		System.out.println("Shifted matrix: ");
		for (int[] s : shifted){
			System.out.println(Arrays.toString(s));
		}


	}


	public static int [][] cellShift(int matrix[][]){
		for(int row = 0; row< matrix.length-1;row+=2){
			for(int column=0; column< matrix[0].length; column++){
				int temp = matrix[row][column];
				matrix[row][column] = matrix[row+1][column];
				matrix[row+1][column] = temp;
			}
		}
		return matrix;
	}

}
