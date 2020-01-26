package com.datastructures.arrays;

public class RotationCountInSortedArray
{
	public static void main( String[] args )
	{
		int[] arr =
		{ 15, 18, 2, 3, 6, 12 };
		System.out.println( findCount( arr ) );
		System.out.println( findCountBinarySearch( arr, 0, arr.length - 1 ) );
	}

	private static int findCount( int[] arr )
	{
		int k = 0;
		int i = 0;
		for ( ; i < arr.length - 1; i++ )
		{
			if ( arr[i] > arr[i + 1] )
			{
				k = i;
			}
		}

		return k == 0 ? 0 : k + 1;
	}

	private static int findCountBinarySearch( int[] arr, int low, int high )
	{
		if ( low == high )
			return low;

		int mid = low + ( high - low ) / 2;

		if ( mid < high && arr[mid + 1] < arr[mid] )
			return mid + 1;
		if ( mid > low && arr[mid] < arr[mid - 1] )
			return mid;

		if ( arr[high] > arr[mid] )
			return findCountBinarySearch( arr, low, mid - 1 );
		
		return findCountBinarySearch( arr, mid + 1, high );
	}
}
