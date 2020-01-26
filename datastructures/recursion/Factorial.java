package com.datastructures.recursion;

public class Factorial
{
	public static void main( String[] args )
	{
		int N = 6;
		System.out.println( factorial( N ) );
		int sum = factorialTail( N, 1 );
		System.out.println( sum );
	}

	public static int factorial( int n )
	{
		if ( n == 1 )
			return 1;
		else
			return n * factorial( n - 1 );
	}

	public static int factorialTail( int n, int sum )
	{
		if ( n == 1 )
			return sum;
		else
			return factorialTail( n - 1, sum * n );
	}
}
