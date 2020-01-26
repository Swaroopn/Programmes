package com.datastructures.arrays;

public class ArrayManipulation
{

	public static void main( String[] args )
	{
		int[][] queries =
		{
				{ 1, 3, 100 },
				{ 4, 7, 200 },
				{ 8, 9, 300 } };
		System.out.println( manipulate( 10, queries ) );
	}

	private static long manipulate( int n, int[][] queries )
	{
		long max = Integer.MIN_VALUE;
		long[] arr = new long[n + 1];
		for ( int i = 0; i < queries.length; i++ )
		{
			int start = queries[i][0] - 1;
			int end = queries[i][1];
			int incr = queries[i][2];

			arr[start] += incr;
			arr[end] -= incr;
		}

		long sum = 0;
		for ( int i = 0; i < arr.length; i++ )
		{
			sum += arr[i];
			if ( sum > max )
				max = sum;
		}

		return max;
	}

}
