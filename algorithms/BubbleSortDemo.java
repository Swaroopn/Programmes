package com.interview.algorithms;

public class BubbleSortDemo
{
	public static void main( String[] args )
	{
		int[] arr =
		{ 2, 1, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println( "Before Sorting:" );
		for ( int i = 0; i < arr.length; i++ )
			System.out.print( arr[i] );
		System.out.println();
		bubbleSort( arr );
		System.out.println( "After Sorting:" );
		for ( int i = 0; i < arr.length; i++ )
			System.out.print( arr[i] );
	}

	public static void bubbleSort( int[] arr )
	{
		for ( int i = 0; i < arr.length - 1; i++ )
		{
			for ( int j = 0; j < arr.length - i - 1; j++ )
			{
				if ( arr[j] > arr[j + 1] )
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

			for ( int ii = 0; ii < arr.length; ii++ )
				System.out.println( arr[ii] );
		}

	}
}
