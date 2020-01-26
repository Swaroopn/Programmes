package com.interview;

import java.util.Scanner;

public class UniqueItem
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int tc = Integer.parseInt( sc.nextLine() );
		for ( int i = 0; i < tc; i++ )
		{
			sc.nextLine();
			String[] input = sc.nextLine().split( " " );
			int[] arr = new int[input.length];
			for ( int j = 0; j < input.length; j++ )
				arr[j] = Integer.parseInt( input[j] );

			System.out.println( findUnique( arr ) );
		}

		sc.close();
	}

	private static int findUnique( int[] arr )
	{
		int duplicateSum = arr[0];
		for ( int i = 1; i < arr.length; i++ )
			duplicateSum ^= arr[i];

		return duplicateSum;
	}

}
