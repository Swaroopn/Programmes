package com.datastructures.arrays;

public class MinInRotatedSortedArray
{
	public static void main( String[] args )
	{
		int[] arr =
		{ 4, 1, 2, 3 };
		findMin( arr, 0, arr.length - 1 );
	}

	private static int findMin( int[] arr, int low, int high )
	{
		int mid = low + ( high - low ) / 2;
		if ( mid < high && arr[mid + 1] < arr[mid] )
			return arr[mid + 1];

		if ( mid > low && arr[mid] < arr[mid - 1] )
			return arr[mid];

		if ( arr[high] > arr[mid] )
			return findMin( arr, low, mid - 1 );
		else
			return findMin( arr, mid + 1, high );
	}
}
