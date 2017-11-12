package com.interview.hackerrank;

import java.util.HashSet;
import java.util.Set;

public class Permutation
{
	public static void main( String[] args )
	{
		System.out.println( permutationFinder( "abc" ) );
	}

	private static Set<String> permutationFinder( String str )
	{
		Set<String> perm = new HashSet<String>();

		if ( str == null )
			return null;

		if ( str.length() == 0 )
		{
			perm.add( "" );
			return perm;
		}

		char init = str.charAt( 0 );
		String rem = str.substring( 1 );
		Set<String> words = permutationFinder( rem );
		for ( String word : words )
		{
			for ( int i = 0; i <= word.length(); i++ )
			{
				perm.add( charInsert( word, init, i ) );
			}
		}

		return perm;
	}

	public static String charInsert( String str, char c, int j )
	{
		String begin = str.substring( 0, j );
		String end = str.substring( j );
		return begin + c + end;
	}

}
