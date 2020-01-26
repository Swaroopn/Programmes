package com.datastructures.recursion;

public class SumOfAllElements
{

	public static void main( String[] args )
	{
		int[] arr =
		{ 1, 2, 3, 4, 5, 6 };
		System.out.println( findSum( arr, arr.length - 1 ) );
		System.out.println( findSumTail( arr, arr.length - 1, 0 ) );
	}

	public static int findSum( int[] arr, int N )
	{
		if ( N == 0 )
			return arr[N];
		return arr[N] + findSum( arr, N - 1 );
	}

	public static int findSumTail( int[] arr, int N, int sum )
	{
		if ( N == 0 )
			return sum + arr[N];
		return findSumTail( arr, N - 1, sum + arr[N] );
	}
}
