package com.datastructures.recursion;

public class Largest
{
	public static void main( String[] args )
	{
		int[] arr =
		{ 1, 2, 3, 5, 4 };
		System.out.println( findLargest( arr, arr.length ) );
	}

	private static int findLargest( int[] arr, int N )
	{
		int big;

		if ( N == 0 )
			return arr[N];

		big = findLargest( arr, N - 1 );
		if ( arr[N] > big )
			return arr[N];

		return big;
	}
}
