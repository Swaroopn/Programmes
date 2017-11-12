package com.interview.algorithms;

public class InsertionSortRS
{
	public static void main( String[] args )
	{
		int arr[] =
		{ 5, 3, 7, 10, 2, 1, 6, 9 };
		insertionSortRS( arr );
		for ( int i = 0; i < arr.length; i++ )
			System.out.print( arr[i] + " " );
	}

	private static void insertionSortRS( int[] arr )
	{
		for ( int i = 1; i < arr.length; i++ )
		{
			for ( int j = i; j > 0 && less( arr, j, j - 1 ); j-- )
			{
				swap( arr, j, j - 1 );
			}
		}
	}

	private static void swap( int[] arr, int j, int i )
	{
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	private static boolean less( int[] arr, int j, int i )
	{
		if ( arr[j] < arr[i] )
			return true;
		return false;
	}
}
