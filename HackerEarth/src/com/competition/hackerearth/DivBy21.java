package com.competition.hackerearth;

import java.util.Scanner;

public class DivBy21
{
	public static void main( String[] args )
	{
		boolean found = false;
		Scanner s = new Scanner( System.in );
		String input = s.nextLine();
		Integer[] arr = new Integer[Integer.parseInt( input )];
		for ( int i = 0; i < arr.length; i++ )
		{
			arr[i] = s.nextInt();
		}

		for ( int i = 0; i < arr.length; i++ )
		{
			char[] ch = arr[i].toString().toCharArray();
			char prev = ch[0];
			char next = ' ';
			for ( int c = 1; c < ch.length; c++ )
			{
				next = ch[c];
				if ( prev == '2' && next == '1' )
				{
					found = true;
					break;
				}
				else
				{
					found = false;
					prev = next;
				}
			}
			if ( arr[i] % 21 == 0 || found )
				System.out.println( "The streak is broken!" );
			else
				System.out.println( "The streak lives still in our heart!" );
		}

		s.close();
	}
}
