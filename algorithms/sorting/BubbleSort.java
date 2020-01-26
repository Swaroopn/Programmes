package com.algorithm.sorting;

/**
 * <a href="C:\Users\swnagendra\Videos\PDF\Sorting Algorithms\Bubble Sort.png">Bubble Sort</a>
 */

@SuppressWarnings(
{ "rawtypes", "unchecked" } )
public class BubbleSort
{
	public static void main( String[] args )
	{
		/*String[] str = new String[]
		{ "s", "w", "a", "r", "o", "o", "p" };*/

		Integer[] str = new Integer[]
		{ 1, 2, 4, 5, 3 };
		
		bubbleSort( str );

		for ( int i = 0; i < str.length; i++ )
			System.out.print( str[i] + " " );
	}

	public static void bubbleSort( Comparable[] arr )
	{
		int N = arr.length;
		boolean swapped = true; // using best complexity of bubble sort technique [ O(n) ]

		for ( int i = 0; swapped && i < N - 1; i++ )
		{
			swapped = false;
			for ( int j = 0; j < N - i - 1; j++ )
			{
				if ( arr[j + 1].compareTo( arr[j] ) < 0 )
				{
					Comparable temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

					swapped = true;
				}
			}
		}
	}
}
