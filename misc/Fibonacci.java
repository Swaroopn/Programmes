package com.interview;

public class Fibonacci
{
	public static void main( String[] args )
	{
		int n = 9;
		System.out.println( findFibonacciNum( n ) );
		System.out.println( findFibonacci( n ) );
	}

	private static int findFibonacciNum( int n )
	{
		int[] f = new int[n + 2];
		f[0] = 0;
		f[1] = 1;

		for ( int i = 2; i <= n; i++ )
		{
			f[i] = f[i - 1] + f[i - 2];
		}

		return f[n];
	}

	private static int findFibonacci( int n )
	{
		int a = 0;
		int b = 1;

		if ( n == 0 )
			return a;

		int c = 0;

		for ( int i = 2; i <= n; i++ )
		{
			c = a + b;
			a = b;
			b = c;
		}

		return c;
	}
}
