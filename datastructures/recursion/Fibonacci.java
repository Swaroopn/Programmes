package com.datastructures.recursion;

public class Fibonacci
{
	public static void main( String[] args )
	{
		int N = 6;
		System.out.println( fibonacci( N ) );
		int sum = fibonacciTail( N, 0, 1 );
		System.out.println( sum );
	}

	private static int fibonacci( int n )
	{
		if ( n == 0 )
			return 0;
		if ( n == 1 )
			return 1;
		return fibonacci( n - 1 ) + fibonacci( n - 2 );
	}

	private static int fibonacciTail( int n, int a, int b )
	{
		if ( n == 0 )
			return a;
		if ( n == 1 )
			return b;
		return fibonacciTail( n - 1, b, a + b );
	}

}
