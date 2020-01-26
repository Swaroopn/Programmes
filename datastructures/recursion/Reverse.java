package com.datastructures.recursion;

public class Reverse
{

	public static void main( String[] args )
	{
		int[] arr =
		{ 1, 2, 3, 4, 5, 6 };
		printReverse( arr, arr.length - 1 );
	}

	private static void printReverse( int[] arr, int N )
	{
		if ( N == -1 )
			return;

		System.out.println( arr[N] );
		printReverse( arr, N - 1 );
	}

}
