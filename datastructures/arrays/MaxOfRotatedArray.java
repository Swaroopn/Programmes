package com.datastructures.arrays;

public class MaxOfRotatedArray
{
	public static void main( String[] args )
	{
		int[] arr =
		{ 4, 1, 2, 3 };
		findMaxSum( arr );
	}

	private static void findMaxSum( int[] arr )
	{
		int N = arr.length;
		int i = 0;
		for ( ; i < N - 1; i++ )
			if ( arr[i] > arr[i + 1] )
				break;

		int start = i;
		if ( i == 0 )
			start = N - 1;

		int sum = 0;
		for ( int count = 0; count < N; count++ )
		{
			sum += ( start * arr[start] );
			start = ( start + 1 ) % N;
		}

		System.out.println( sum );
	}
}
