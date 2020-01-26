package com.interview;

import java.util.Scanner;

public class Sort012
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int N = Integer.parseInt( sc.nextLine() );
		while ( N-- > 0 )
		{
			sc.nextLine();
			String input = sc.nextLine();
			sort( input );
		}
		sc.close();
	}

	private static void sort( String input )
	{
		int zeros = 0;
		int ones = 0;
		int twos = 0;
		String[] arr = input.split( "[\\s]+" );
		for ( String str : arr )
		{
			if ( str.equals( "0" ) )
				zeros++;
			else if ( str.equals( "1" ) )
				ones++;
			else if ( str.equals( "2" ) )
				twos++;
		}

		for ( int i = 0; i < zeros; i++ )
			System.out.print( "0 " );
		for ( int i = 0; i < ones; i++ )
			System.out.print( "1 " );
		for ( int i = 0; i < twos; i++ )
			System.out.print( "2 " );
	}
}
