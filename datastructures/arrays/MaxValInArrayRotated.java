package com.datastructures.arrays;

public class MaxValInArrayRotated
{
	public static void main( String[] args )
	{
		int[] arr =
		{ 1, 2, 3, 4 };
		System.out.println( findMaxSum( arr ) );
	}

	private static int findMaxSum( int[] arr )
	{
		int sum = 0;
		int maxSum = 0;
		for ( int i = 0; i < arr.length; i++ )
		{
			sum += arr[i];
			maxSum += ( i * arr[i] );
		}

		int max = maxSum;
		for ( int j = 1; j < arr.length; j++ )
		{
			maxSum = maxSum + sum - arr.length * arr[arr.length - j];
			if ( maxSum > max )
				max = maxSum;
		}

		return max;
	}

}
