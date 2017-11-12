package com.interview.algorithms;

public class MergeSort
{
	public static void main( String[] args )
	{
		char[] arr =
		{ 'M', 'E', 'R', 'G', 'E', 'S', 'O', 'R', 'T' };
		sort( arr, 0, arr.length - 1 );
		display( arr );
	}

	private static void sort( char[] arr, int low, int high )
	{
		if ( low < high )
		{
			int mid = ( low + high ) / 2;
			sort( arr, low, mid );
			sort( arr, mid + 1, high );
			merge( arr, low, mid, high );
		}
	}

	private static void display( char[] arr )
	{
		for ( char c : arr )
		{
			System.out.print( c + " " );
		}
	}

	private static void merge( char[] arr, int low, int mid, int high )
	{
		int n1 = mid - low + 1;
		int n2 = high - mid;

		char[] left = new char[n1];
		char[] right = new char[n2];

		for ( int i = 0; i < n1; i++ )
			left[i] = arr[low + i];
		for ( int j = 0; j < n2; j++ )
			right[j] = arr[mid + 1 + j];

		int i = 0;
		int j = 0;
		int k = low;
		while ( i < n1 && j < n2 )
		{
			if ( left[i] <= right[j] )
				arr[k++] = left[i++];
			else
				arr[k++] = right[j++];
		}

		while ( i < n1 )
		{
			arr[k++] = left[i++];
		}

		while ( j < n2 )
		{
			arr[k++] = right[j++];
		}
	}

}
