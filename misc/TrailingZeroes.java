package com.interview;

public class TrailingZeroes
{
	public static void main( String[] args )
	{
		int n = 100;
		int count = findTrailingZeroes( n );
		System.out.println( count );
	}

	private static int findTrailingZeroes( int num )
	{
		int count = 0;

		for ( int i = 5; num / i >= 1; i *= 5 )
		{
			count += num / i;
		}

		return count;
	}

}
