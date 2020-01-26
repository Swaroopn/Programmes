package com.interview;

import java.util.Scanner;

public class SubMatrix
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int tc = Integer.parseInt( sc.nextLine() );
		for ( int i = 0; i < tc; i++ )
		{
			int startRow = Integer.parseInt( sc.nextLine().split( " " )[0] );
			String[] input = sc.nextLine().split( " " );
			int[] arr = new int[input.length];
			for ( int j = 0; j < input.length; j++ )
			{
				arr[j] = Integer.parseInt( input[j] );
			}

			String[] startEnd = sc.nextLine().split( " " );
			findSubMatrixSum( arr, startRow, Integer.parseInt( startEnd[0] ), Integer.parseInt( startEnd[1] ), Integer.parseInt( startEnd[2] ), Integer.parseInt( startEnd[3] ) );
		}
		
		sc.close();
	}

	private static void findSubMatrixSum( int[] arr, int totRow, int startRow, int startCol, int endRow, int endCol )
	{
		int sum = 0;
		for ( int row = startRow - 1; row < endRow; row++ )
		{
			for ( int col = startCol - 1; col < endCol; col++ )
			{
				sum += arr[row * totRow + col];
			}
		}

		System.out.println( sum );
	}
}
