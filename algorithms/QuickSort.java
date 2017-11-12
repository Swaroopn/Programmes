package com.interview.algorithms;

public class QuickSort
{
	public static void main( String[] args )
	{
		char[] arr =
		{ 'S', 'W', 'A', 'R', 'O', 'O', 'P' };
		quickSort( arr, 0, arr.length - 1 );
		for ( char ch : arr )
			System.out.println( ch );
	}

	public static void quickSort( char[] arr, int low, int high )
	{
		if ( low >= high )
			return;
		
		int pivot = arr[( low + high ) / 2];
		int index = partition( arr, low, high, pivot );
		quickSort( arr, low, index - 1 );
		quickSort( arr, index, high );
	}

	private static int partition( char[] arr, int low, int high, int pivot )
	{
		while ( low <= high )
		{
			while ( arr[low] < pivot )
				low++;

			while ( arr[high] > pivot )
				high--;

			if ( low <= high )
			{
				swap( arr, low, high );
				low++;
				high--;
			}
		}
		return low;
	}

	private static void swap( char[] arr, int i, int j )
	{
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
