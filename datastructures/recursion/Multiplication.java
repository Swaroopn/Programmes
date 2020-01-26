package com.datastructures.recursion;

public class Multiplication
{

	public static void main( String[] args )
	{
		int a = 3, b = 10;
		System.out.println( multiply( a, b ) );
		System.out.println( multiplyTail( a, b, 0 ) );
	}

	private static int multiply( int m, int n )
	{
		if ( m == 0 || n == 0 )
			return 0;
		if ( n == 1 )
			return m;
		return multiply( m, n - 1 ) + m;
	}

	private static int multiplyTail( int m, int n, int result )
	{
		if ( m == 0 || n == 0 )
			return 0;
		if ( n == 1 )
			return result + m;
		return multiplyTail( m, n - 1, result + m );
	}
}
