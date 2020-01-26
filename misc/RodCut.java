package com.interview;

public class RodCut
{
	public static void main( String[] args )
	{
		int[] arr = new int[]
		{ 1, 5, 8, 9, 10, 17, 17, 20 };
		int max = cutRod( arr, arr.length );
		System.out.println( max );
	}

	private static int cutRod( int[] priceArr, int n )
	{
		if ( n <= 0 )
			return 0;

		int max = Integer.MIN_VALUE;
		for ( int i = 0; i < n; i++ )
			max = Math.max( max, priceArr[i] + cutRod( priceArr, n - i - 1 ) );

		return max;
	}
}
