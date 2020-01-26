package com.interview;

public class CoinChange
{
	public static void main( String[] args )
	{
		int[] arr =
		{ 2, 5, 3, 6 };
		int n = 10;
		System.out.println( findPossibilities( arr, arr.length, n ) );
	}

	private static int findPossibilities( int[] arr, int size, int N )
	{
		if ( N == 0 )
			return 1;

		if ( N < 0 || size <= 0 )
			return 0;

		return findPossibilities( arr, size - 1, N ) + findPossibilities( arr, size, N - arr[size - 1] );
	}

}
