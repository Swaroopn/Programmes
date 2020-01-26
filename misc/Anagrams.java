package com.interview;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int N = Integer.parseInt( sc.nextLine() );
		while ( N-- > 0 )
		{
			String[] input = sc.nextLine().split( "[\\s]+" );
			if ( printAnagrams( input[0], input[1] ) )
				System.out.println( "YES" );
			else
				System.out.println( "NO" );
		}
		sc.close();
	}

	private static boolean printAnagrams( String s1, String s2 )
	{
		if ( s1.length() == s2.length() )
		{
			char[] s1AsChar = s1.toCharArray();
			char[] s2AsChar = s2.toCharArray();
			Arrays.sort( s1AsChar );
			Arrays.sort( s2AsChar );
			return Arrays.equals( s1AsChar, s2AsChar );
		}

		return false;
	}
}
