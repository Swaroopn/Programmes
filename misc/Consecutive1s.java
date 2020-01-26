package com.interview;

import java.math.BigInteger;
import java.util.Scanner;

public class Consecutive1s
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int input = Integer.parseInt( sc.nextLine() );
		for ( int i = 0; i < input; i++ )
		{
			int n = Integer.parseInt( sc.nextLine() );
			System.out.println( printCombinations( n ) );
		}

		sc.close();
	}

	private static long printCombinations( int n )
	{
		long[] a = new long[n];
		long[] b = new long[n];
		a[0] = b[0] = 1;
		for ( int i = 1; i < n; i++ )
		{
			a[i] = a[i - 1] + b[i - 1];
			b[i] = a[i - 1];
		}

		BigInteger one = new BigInteger( String.valueOf( a[n - 1] ) );
		BigInteger two = new BigInteger( String.valueOf( b[n - 1] ) );
		two = one.add( two );
		return ( one.add( two ).mod( new BigInteger( "1000000007" ) ) ).longValue();
	}
}
