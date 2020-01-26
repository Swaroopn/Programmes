package com.datastructures.arrays;

import java.io.IOException;
import java.util.Scanner;

public class HourGlass
{
	// Complete the hourglassSum function below.
	static int hourglassSum( int[][] arr )
	{
		int rowStart = 0;
		int colStart = 1;
		int max = Integer.MIN_VALUE;
		int sum = 0;

		for ( int i = 0; i < arr.length - 2; i++ )
		{
			for ( int j = 0; j < arr[0].length - 2; j++ )
			{
				sum = arr[i][rowStart] + arr[i][rowStart + 1] + arr[i][rowStart + 2] + arr[i + 1][colStart] + arr[i + 2][rowStart] + arr[i + 2][rowStart + 1] + arr[i + 2][rowStart + 2];
				if ( sum > max )
					max = sum;
				
				rowStart++;
				colStart++;
			}

			rowStart = 0;
			colStart = 1;
		}

		return max;
	}

	private static final Scanner scanner = new Scanner( System.in );

	public static void main( String[] args ) throws IOException
	{
		int[][] arr = new int[6][6];

		for ( int i = 0; i < 6; i++ )
		{
			String[] arrRowItems = scanner.nextLine().split( " " );
			scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

			for ( int j = 0; j < 6; j++ )
			{
				int arrItem = Integer.parseInt( arrRowItems[j] );
				arr[i][j] = arrItem;
			}
		}

		int result = hourglassSum( arr );

		System.out.println( result );
		scanner.close();
	}
}
