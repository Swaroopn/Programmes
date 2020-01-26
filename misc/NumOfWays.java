package com.interview;

/**
 * 
 * find Number of ways 7 can be obtained by adding 1, 3 and 5
 */
public class NumOfWays
{
	public static void main( String[] args )
	{
		int N = 7;

		findWays( N );
		// findWaysEfficiently( N );
	}

	private static int findWays( int n )
	{
		if ( n < 0 )
			return 0;
		if ( n == 0 )
			return 1;

		return findWays( n - 1 ) + findWays( n - 3 ) + findWays( n - 5 );
	}

	/*
	 * Using Memoization to find efficiently
	 */
	
}
