package com.datastructures.recursion;

public class GCD
{
	public static void main( String[] args )
	{
		int a = 10, b = 6;
		System.out.println( gcd( a, b ) );
	}

	private static int gcd( int m, int n )
	{
		if ( n == 0 )
			return m;
		if ( m < n )
			return gcd( n, m );
		return gcd( n, m % n );
	}
}
