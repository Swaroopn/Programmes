package com.interview.core;

public class PalinNum
{
	public static void main( String[] args )
	{
		System.out.println( "swaroop".replaceAll( "o", "" ) );
		if ( isPalin( 12321 ) )
			System.out.println( "True" );
		else
			System.out.println( "False" );

		if ( isPalin( "maadam" ) )
			System.out.println( "True" );
		else
			System.out.println( "False" );
	}

	private static boolean isPalin( String str )
	{
		int length = str.length();
		for ( int i = 0; i < length / 2; i++ )
		{
			if ( str.charAt( i ) != str.charAt( length - i - 1 ) )
				return false;
		}

		return true;
	}

	private static boolean isPalin( int i )
	{
		int temp = i;
		int rem = 0;
		int rev = 0;
		while ( temp > 0 )
		{
			rem = temp % 10;
			rev = ( rev * 10 ) + rem;
			temp /= 10;
		}

		if ( rev == i )
			return true;

		return false;
	}
}
