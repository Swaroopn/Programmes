package com.interview.hackerrank;

import java.util.Scanner;

public class Temp
{
	static String isSatisfiable( int c1, int c2, int h1, int h2 )
	{
		int min = getMin( h1, h2 );
		int max = getMax( c1, c2 );
		if ( min < max )
			return "NO";
		else
			return "YES";
	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		// Return "YES" if all four conditions can be satisfied, and "NO" otherwise
		int c1 = in.nextInt();
		int c2 = in.nextInt();
		int h1 = in.nextInt();
		int h2 = in.nextInt();
		String result = isSatisfiable( c1, c2, h1, h2 );
		System.out.println( result );
	}

	public static int getMin( int a, int b )
	{
		return a < b ? a : b;
	}

	public static int getMax( int a, int b )
	{
		return a > b ? a : b;
	}

}
