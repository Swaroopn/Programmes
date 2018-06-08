package com.competition.hackerearth;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Permutation
{
	static int CountPS( char str[] )
	{
		int n = str.length;
		int dp[][] = new int[n][n];
		boolean P[][] = new boolean[n][n];

		// palindrome of single lenght
		for ( int i = 0; i < n; i++ )
			P[i][i] = true;

		// palindrome of length 2
		for ( int i = 0; i < n - 1; i++ )
		{
			if ( str[i] == str[i + 1] )
			{
				P[i][i + 1] = true;
				dp[i][i + 1] = 1;
			}
		}

		// Palindromes of length more then 2. This loop is similar
		// to Matrix Chain Multiplication. We start with a gap of
		// length 2 and fill DP table in a way that gap between
		// starting and ending indexes increases one by one by
		// outer loop.
		for ( int gap = 2; gap < n; gap++ )
		{
			// Pick starting point for current gap
			for ( int i = 0; i < n - gap; i++ )
			{
				// Set ending point
				int j = gap + i;

				// If current string is palindrome
				if ( str[i] == str[j] && P[i + 1][j - 1] )
					P[i][j] = true;

				// Add current palindrome substring ( + 1)
				// and rest palinrome substring (dp[i][j-1] + dp[i+1][j])
				// remove common palinrome substrings (- dp[i+1][j-1])
				if ( P[i][j] == true )
					dp[i][j] = dp[i][j - 1] + dp[i + 1][j] + 1 - dp[i + 1][j - 1];
				else
					dp[i][j] = dp[i][j - 1] + dp[i + 1][j] - dp[i + 1][j - 1];
			}
		}

		// return total palindromic substrings
		return dp[0][n - 1];
	}

	// Driver Method
	public static void main( String[] args )
	{
		Scanner s = new Scanner( System.in );
		String str = s.nextLine();
		s.close();
		int count = 0;
		Set<Character> set = new HashSet<>();
		for ( char c : str.toCharArray() )
			set.add( c );
		count += set.size();
		count += CountPS( str.toCharArray() );

		System.out.println( count );
	}
}
