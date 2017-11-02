package interview;

import java.util.Scanner;

public class TransposeOfMatrix
{

	public static void main( String[] args )
	{
		Scanner scanner = new Scanner( System.in );
		System.out.println( "Enter No of Rows:" );
		int rows = scanner.nextInt();
		System.out.println( "Enter No of Rows:" );
		int cols = scanner.nextInt();

		int[][] matrix = new int[rows][cols];

		System.out.println( "Enter matrix" );
		for ( int i = 0; i < rows; i++ )
			for ( int j = 0; j < cols; j++ )
				matrix[i][j] = scanner.nextInt();

		printMatrix( matrix );
		printTransposeMatrix( matrix );

		scanner.close();
	}

	private static void printTransposeMatrix( int[][] matrix )
	{
		for ( int i = 0; i < matrix[0].length; i++ )
		{
			for ( int j = 0; j < matrix.length; j++ )
			{
				System.out.print( matrix[j][i] + " " );
			}
			System.out.println();
		}
	}

	private static void printMatrix( int[][] matrix )
	{
		for ( int i = 0; i < matrix.length; i++ )
		{
			for ( int j = 0; j < matrix[0].length; j++ )
			{
				System.out.print( matrix[i][j] + " " );
			}
			System.out.println();
		}
	}

}
