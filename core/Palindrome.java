package com.interview.core;

public class Palindrome
{

	public static void main( String[] args )
	{
		String palin = "MADADAM";
		checkForPalindrome( palin );
	}

	private static void checkForPalindrome( String palin )
	{
		int count = 0;
		for ( int i = 0; i < palin.length() / 2; i++ )
		{
			count++;
			char ch1 = palin.charAt( i );
			char ch2 = palin.charAt( palin.length() - i - 1 );

			if ( ch1 != ch2 )
			{
				System.out.println( "Not Palindrome!!!" );
				return;
			}
		}

		System.out.println( "Palindrome" );
		System.out.println( "No of Iterations: " + count );
	}

}
