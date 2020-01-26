package com.interview;

public class Star
{
	public static void main( String[] args )
	{
		printStar( 4 );
	}

	private static void printStar( int n )
	{
		int temp = n;
		int k = 0;
		while ( temp > 0 )
		{
			k = n - temp + 1;
			for ( int i = 0; i < n - k; i++ )
				System.out.print( " " );

			for ( int i = 0; i < k; i++ )
				System.out.print( "#" );

			System.out.println();
			temp--;
		}
	}
}
