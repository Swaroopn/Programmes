package com.interview.hackerrank;

import java.util.Arrays;

public class EvenOddSort
{

	public static void main( String[] args )
	{
		int[] arr =
		{ 0, 1, 2, 3, 4, 5, 6, 7 };

		sortEventOdd( arr );
	}

	private static void sortEventOdd( int[] arr )
	{
		int evenArr[] = new int[arr.length];
		int j = 0;

		for ( int i = 0; i < arr.length; i = i + 2 )
			evenArr[j++] = arr[i];

		Arrays.sort( evenArr, 0, j );

		int temp = arr.length - 2;

		if ( arr.length % 2 == 0 )
			temp = arr.length - 1;

		for ( int i = temp; i > 0; i = i - 2 )
			evenArr[j++] = arr[i];

		for ( int i = 0; i < evenArr.length; i++ )
			System.out.print( evenArr[i] + " " );
	}

}
