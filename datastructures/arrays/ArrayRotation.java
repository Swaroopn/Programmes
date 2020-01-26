package com.datastructures.arrays;

public class ArrayRotation
{
	public static void main( String[] args )
	{
		ArrayRotation obj = new ArrayRotation();
		int[] arr =
		{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		obj.rotateLeft( arr, 2 );
		obj.display( arr );

		int[] brr =
		{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// reverse Rotate
		obj.reverseRotateLeft( brr, 2 );
		obj.display( brr );

		int[] crr =
		{ 3, 4, 5, 6, 7, 8, 9, 10, 1, 2 };
		if ( obj.pairInSortedRotated( crr, 19 ) )
			System.out.println( "yes" );
	}

	/**
	 * Scenario - 1
	 * Time Complexity: O(n)
	 */
	private void rotateLeft( int[] arr, int d )
	{
		int temp, j, stopIndex;
		int n = arr.length;
		int gcd = findGcd( n, d );
		for ( int i = 0; i < gcd; i++ )
		{
			temp = arr[i];
			j = i;

			while ( true )
			{
				stopIndex = j + d;
				
				if ( stopIndex >= n )
					stopIndex = stopIndex - n;
				if ( stopIndex == i )
					break;

				arr[j] = arr[stopIndex];
				j = stopIndex;
			}

			arr[j] = temp;
		}
	}

	private int findGcd( int a, int b )
	{
		if ( b == 0 )
			return a;
		else
			return findGcd( b, a % b );
	}

	/**
	 * Scenario - 2
	 * Time Complexity: O(n/2) + n (reversing the array)
	 */
	private void reverseRotateLeft( int[] arr, int d )
	{
		if ( d == 0 )
			return;

		reverseArray( arr, 0, d - 1 );
		reverseArray( arr, d, arr.length - 1 );
		reverseArray( arr, 0, arr.length - 1 );
	}

	private void reverseArray( int[] arr, int start, int end )
	{
		int temp;
		while ( start < end )
		{
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}

	/**
	 * Scenario - 3
	 */
	private boolean pairInSortedRotated( int[] arr, int sum )
	{
		int n = arr.length;
		int i;
		for ( i = 0; i < n; i++ )
		{
			if ( arr[i] > arr[i + 1] )
				break;
		}

		int start = ( i + 1 ) % n;
		int end = i;

		while ( start != end )
		{
			if ( arr[start] + arr[end] == sum )
				return true;
			else if ( arr[start] + arr[end] < sum )
				start = ( start + 1 ) % n;
			else
				end = ( n + end - 1 ) % n;
		}

		return false;
	}

	private void display( int[] arr )
	{
		for ( int i = 0; i < arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
	
}
