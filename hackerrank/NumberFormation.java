package com.interview.hackerrank;

public class NumberFormation
{
	public static void main( String[] args )
	{
		String num = "1234";
		int count = 0;
		for ( int i = 1; i <= num.length(); i++ )
			count += getCombination( num.length(), i );

		System.out.println( "Total possible combinations: " + count );
		findCombination( 0, num );
	}

	private static void findCombination( int start, String inputstring )
	{
		for ( int i = start; i < inputstring.length(); ++i )
		{}
	}

	private static int getCombination( int length, int i )
	{
		int n = factorial( length );
		int r = factorial( i );
		int nr = factorial( length - i );

		return n / ( nr * r );
	}

	private static int factorial( int num )
	{
		int fact = 1;
		for ( int i = num; i > 1; i-- )
			fact *= i;

		return fact;
	}

}
