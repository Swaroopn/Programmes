package com.interview;

import java.util.Arrays;

public class Test
{
	static int count1 = 0;
	static int count2 = 0;

	public static void main( String[] args )
	{
		int[] arr =
		{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		rotateLeft( Arrays.copyOf( arr, arr.length ), 2 );

		reverseRotateLeft( Arrays.copyOf( arr, arr.length ), 2 );
	}

	private static void rotateLeft( int[] arr, int d )
	{
		int N = arr.length;
		int gcd = findGCD( arr.length, d );
		for ( int i = 0; i < gcd; i++ )
		{
			int temp = arr[i];
			int j = i;
			int stopIndex;

			while ( true )
			{
				count1++;
				stopIndex = j + d;

				if ( stopIndex >= N )
					stopIndex -= N;

				if ( stopIndex == i )
					break;

				arr[j] = arr[stopIndex];
				j = stopIndex;
			}

			arr[j] = temp;
		}

		for ( int i = 0; i < arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println( "Total iteration: " + count1 );
	}

	private static int findGCD( int a, int b )
	{
		if ( b == 0 )
			return a;
		return findGCD( b, a % b );
	}

	private static void reverseRotateLeft( int[] arr, int d )
	{
		if ( d == 0 )
			return;

		rotateArray( arr, 0, d - 1 );
		rotateArray( arr, d, arr.length - 1 );
		reverse( arr );

		System.out.println( "Total iteration: " + count2 );
	}

	private static void rotateArray( int[] arr, int start, int end )
	{
		while ( start < end )
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
			count2++;
		}
	}

	private static void reverse( int[] arr )
	{
		for ( int i = arr.length - 1; i >= 0; i-- )
		{
			System.out.print( arr[i] + " " );
			count2++;
		}
	}

}
