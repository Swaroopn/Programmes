package com.interview;

import java.util.Scanner;

public class RotateString
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int test = Integer.parseInt( sc.nextLine() );
		while ( test-- > 0 )
		{
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();

			rotate( str1, str2 );
		}
		sc.close();
	}

	private static void rotate( String str1, String str2 )
	{
		String temp1 = str1.substring( 2, str1.length() ) + str1.substring( 0, 2 );
		String temp2 = str1.substring( str1.length() - 2, str1.length() ) + str1.substring( 0, str1.length() - 2 );

		if ( temp1.equals( str2 ) || temp2.equals( str2 ) )
			System.out.println( "1" );
		else
			System.out.println( "0" );
	}

}
