package com.algorithm.sorting;

/**
 * <a href="C:\Users\swnagendra\Videos\PDF\Sorting Algorithms\Selection Sort.png">Selection Sort</a>
 */

@SuppressWarnings(
{ "rawtypes", "unchecked" } )
public class SelectionSort
{
	public static void main( String[] args )
	{
		Integer[] arr = new Integer[]
		{ 0, 2, 1, 2, 0 };

		selectionSort( arr );

		for ( int i = 0; i < arr.length; i++ )
			System.out.print( arr[i] + " " );
	}

	private static void selectionSort( Comparable[] arr )
	{
		int N = arr.length;
		int min = -1;
		for ( int i = 0; i < N - 1; i++ )
		{
			min = i;

			for ( int j = i + 1; j < N; j++ )
			{
				if ( arr[j].compareTo( arr[min] ) < 0 )
					min = j;
			}

			swap( arr, i, min );
		}
	}

	private static void swap( Comparable[] arr, int i, int j )
	{
		Comparable temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
