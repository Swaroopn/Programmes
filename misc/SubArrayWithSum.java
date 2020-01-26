package com.interview;

import java.util.Scanner;

public class SubArrayWithSum
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int tc = Integer.parseInt( sc.nextLine() );
		for ( int i = 0; i < tc; i++ )
		{
			Integer output = Integer.parseInt( sc.nextLine().split( " " )[1] );
			String[] input = sc.nextLine().split( " " );
			int[] arr = new int[input.length];
			for ( int j = 0; j < input.length; j++ )
			{
				arr[j] = Integer.parseInt( input[j] );
			}
			findSubArray( arr, output );
		}

		sc.close();
	}

	private static void findSubArray( int[] arr, int output )
	{
		int N = arr.length;
		int sum = 0;
		int pos = 0;
		int i;
		for ( i = 0; i <= N; i++ )
		{
			while ( sum > output && pos <= i )
			{
				sum -= arr[pos];
				pos++;
			}

			if ( sum == output )
			{
				System.out.println( ( pos + 1 ) + " " + ( i ) );
				return;
			}

			if ( i < N )
			{
				sum += arr[i];
			}
		}

		System.out.println( "-1" );
	}
}
