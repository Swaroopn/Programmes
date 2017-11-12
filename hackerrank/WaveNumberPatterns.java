package com.interview.hackerrank;

import java.util.Arrays;

public class WaveNumberPatterns
{
	public static void main( String[] args )
	{
		int[] arr =
		{ 10, 5, 6, 3, 2, 20, 100, 80 };
		waveForm( arr );
	}

	private static void waveForm( int[] arr )
	{
		Arrays.sort( arr );
		for ( int i = 0; i < arr.length; i = i + 2 )
		{
			swap( arr, i, i + 1 );
		}

		for ( int i = 0; i < arr.length; i++ )
			System.out.print( arr[i] + " " );
	}

	public static void swap( int[] arr, int a, int b )
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
