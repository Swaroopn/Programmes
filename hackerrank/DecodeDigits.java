package com.interview.hackerrank;

import java.util.HashSet;
import java.util.Set;

public class DecodeDigits
{
	public static void main( String[] args )
	{
		String str = "2626";
		Object[] ob = decode( str );
		for ( int i = 0; i < ob.length; i++ )
			System.out.print( ob[i] );
	}

	public static Object[] decode( String digits )
	{
		Set<Character> set = new HashSet<Character>();
		char[] alpha = new char[]
		{ ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for ( int i = 0; i < digits.length(); i++ )
			set.add( alpha[Character.getNumericValue( digits.charAt( i ) )] );

		for ( int i = 0; i < digits.length() - 1; i++ )
		{
			int j = Character.getNumericValue( digits.charAt( i ) );
			int k = Character.getNumericValue( digits.charAt( i + 1 ) );
			int temp = Integer.parseInt( j + "" + k );

			if ( temp < alpha.length )
				set.add( alpha[temp] );
		}
		return set.toArray();
	}
}
