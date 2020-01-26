package com.datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class MaxSubArray
{
	public static void main( String[] args )
	{
		int[] arr = new int[]
		{ 1, 2, 3, 3, 4, 5, 2, 1 };
		findMaxSum( arr );
	}

	private static void findMaxSum( int[] arr )
	{
		int maxSum = 0;
		for ( int i = 0; i < arr.length - 1; i++ )
		{
			Set<Integer> unique = new HashSet<>();
			int temp = 0;
			for ( int j = i; j < arr.length; j++ )
			{
				if ( unique.add( arr[j] ) )
				{
					temp += arr[j];
				}
				else
					break;
			}

			if ( temp > maxSum )
				maxSum = temp;
		}

		System.out.println( maxSum );
	}

}
