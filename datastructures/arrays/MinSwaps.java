package com.datastructures.arrays;

public class MinSwaps
{

	public static void main( String[] args )
	{
		int[] arr =
		{ 5, 3, 4, 1, 2 };
		System.out.println( findMinSwaps( arr ) );
	}

	private static int findMinSwaps( int[] arr )
	{
		int swapSum = 0;

		for ( int i = 0; i < arr.length - 1; i++ )
		{
			int currectPos = i + 1;
			while ( arr[i] != currectPos )
			{
				int swapKey = arr[i] - 1;

				int temp = arr[i];
				arr[i] = arr[swapKey];
				arr[swapKey] = temp;

				swapSum++;
			}
		}

		return swapSum;
	}

}
