package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Permutation
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int count = Integer.parseInt( sc.nextLine() );
		while ( count-- > 0 )
		{
			String str = sc.nextLine();
			Set<String> out = permute( str );
			List<String> list = new ArrayList<>( out );
			Collections.sort( list );
			for ( String s : list )
				System.out.print( s + " " );
			System.out.println();
		}

		sc.close();
	}

	public static Set<String> permute( String input )
	{
		Set<String> set = new HashSet<String>();

		if ( input == "" )
			return set;

		Character a = input.charAt( 0 );

		if ( input.length() > 1 )
		{
			Set<String> permSet = permute( input.substring( 1 ) );

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
