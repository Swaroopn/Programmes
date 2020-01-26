package com.interview;

import java.util.Scanner;

public class DuplicateChar
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int N = Integer.parseInt( sc.nextLine() );
		while ( N-- > 0 )
		{
			String str = sc.nextLine();
			removeDuplicate( str );
		}

		sc.close();
	}

	private static void removeDuplicate( String str )
	{
		String temp = "";
		for ( int i = 0; i < str.length(); i++ )
		{
			char ch = str.charAt( i );
			if ( temp.indexOf( ch ) == -1 )
				temp += ch;
		}

		System.out.println( temp );
	}

}
