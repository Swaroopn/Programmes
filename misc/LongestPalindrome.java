package com.interview;

import java.util.Scanner;

public class LongestPalindrome
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int N = Integer.parseInt( sc.nextLine() );
		while ( N-- > 0 )
		{
			String input = sc.nextLine();
			System.out.println( lps( input ) );
		}

		sc.close();
	}

	private static String lps( String word )
	{
		int len = word.length();
		int palindromeBeginsAt = 0;
		int maxLen = 1; // length of longest palindrome
		boolean palindrome[][] = new boolean[len][len];

		// For single letter palindrome
		for ( int i = 0; i < len; i++ )
			palindrome[i][i] = true;

		String str = "";

		// For 2 letter palindrome
		for ( int i = 0; i < len - 1; i++ )
		{
			if ( word.charAt( i ) == word.charAt( i + 1 ) )
			{
				palindrome[i][i + 1] = true;
				palindromeBeginsAt = i;
				maxLen = 2;
				String temp = word.substring( palindromeBeginsAt, palindromeBeginsAt + maxLen );
				if ( temp.length() > str.length() )
					str = temp;
			}
		}

		// Finding Palindrome for string length > 3 to n
		for ( int curLen = 3; curLen <= len; curLen++ )
		{
			for ( int i = 0; i < len - curLen + 1; i++ )
			{
				int j = i + curLen - 1;
				if ( word.charAt( i ) == word.charAt( j ) && palindrome[i + 1][j - 1] )
				{
					palindrome[i][j] = true;
					palindromeBeginsAt = i;
					maxLen = curLen;
					String temp = word.substring( palindromeBeginsAt, palindromeBeginsAt + maxLen );
					if ( temp.length() > str.length() )
						str = temp;
				}
			}
		}

		if ( str.isEmpty() )
			return word.charAt( 0 ) + "";

		return str;
	}
}
