package com.subex.rocps.bcrmanagement.bcrdelta;

import java.util.LinkedHashSet;
import java.util.Set;

public class Isomorphic
{
	public static void main( String[] args )
	{
		String str1 = "ABCDEF";
		String str2 = "ZQXYMP";

		if ( isIsoMorphic( str1, str2 ) )
			System.out.println( "IsoMorphic" );
		else
			System.out.println( "Not IsoMorphic" );
	}

	private static boolean isIsoMorphic( String str1, String str2 )
	{
		if ( str1.length() == str2.length() )
		{
			char[] s1 = str1.toCharArray();
			char[] s2 = str2.toCharArray();

			Set<Character> set1 = new LinkedHashSet<Character>();
			Set<Character> set2 = new LinkedHashSet<Character>();

			for ( char c : s1 )
				set1.add( c );

			for ( char c : s2 )
				set2.add( c );

			if ( set1.size() != set2.size() )
				return false;

			Object[] o1 = set1.toArray();
			Object[] o2 = set2.toArray();

			for ( int i = 0; i < o1.length; i++ )
				str2 = str2.replace( ( char ) o2[i], ( char ) o1[i] );

			if ( !str1.equals( str2 ) )
				return false;
			return true;
		}
		else
			return false;
	}
}
