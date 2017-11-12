package com.interview.hackerrank;

public class StrictlyIncreasingOrder
{
	public static void main( String[] args )
	{
		strictlyIncreasing( 0, "", 2 );
	}

	private static void strictlyIncreasing( int start, String prefix, int n )
	{
		if ( n == 0 )
		{
			System.out.print( prefix + " " );
			return;
		}

		for ( int i = start; i <= 9; i++ )
		{
			String str = prefix + i;
			strictlyIncreasing( i + 1, str, n - 1 );
		}
	}
}
