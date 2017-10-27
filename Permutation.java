package com.subex.rocps.web.app;

import java.util.HashSet;
import java.util.Set;

public class Permutation
{
	public static void main( String[] ars )
	{
		String str = "abc";
		Set<String> out = generatePerm( str );
		System.out.println( out );

	}

	public static Set<String> generatePerm( String input )
	{
		Set<String> set = new HashSet<String>();
		
		if ( input == "" )
			return set;

		Character a = input.charAt( 0 );

		if ( input.length() > 1 )
		{
			input = input.substring( 1 );

			System.out.println( input );
			Set<String> permSet = generatePerm( input );

			for ( String x : permSet )
			{
				for ( int i = 0; i <= x.length(); i++ )
				{
					set.add( x.substring( 0, i ) + a + x.substring( i ) );
				}
			}
		}
		else
		{
			set.add( a + "" );
		}
		return set;
	}
}
