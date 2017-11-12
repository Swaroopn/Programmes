package com.interview.hackerrank;

public class Reverse
{

	public static void main( String[] args )
	{
		int[] arr =
		{ 5, 4, 3, 2, 1,6 };
		rev( arr );

	}

	public static void rev( int[] arr )
	{
		int n = arr.length;
		for ( int i = 0; i < n/2; i++ )
		{
			int temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}

		for ( int i = 0; i < n; i++ )
		{
			System.out.println( arr[i] );
		}
	}

}
