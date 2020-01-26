package com.algorithm.sorting;

/**
 * <a href="C:\Users\swnagendra\Videos\PDF\Sorting Algorithms\Insertion Sort.png">Insertion Sort</a>
 */

@SuppressWarnings(
{ "rawtypes", "unchecked" } )
public class InsertionSort
{
	public static void main( String[] args )
	{
		String[] str = new String[]
		{ "s", "w", "a", "r", "o", "o", "p" };

		insertionSort( str );

		for ( int i = 0; i < str.length; i++ )
			System.out.print( str[i] + " " );
	}

	private static void insertionSort( Comparable[] str )
	{
		int N = str.length;
		for ( int i = 1; i < N; i++ )
		{
			Comparable aux = str[i];
			int j;
			for ( j = i; j > 0 && less( aux, str[j - 1] ); j-- )
			{
				str[j] = str[j - 1];
			}

			str[j] = aux;
		}
	}

	private static boolean less( Comparable first, Comparable second )
	{
		return first.compareTo( second ) < 0 ? true : false;
	}

}
