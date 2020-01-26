package com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringIngonrace
{
	public static void main( String[] args ) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int inputs = Integer.parseInt( br.readLine() );
		for ( int i = 0; i < inputs; i++ )
		{
			String str = br.readLine();
			pringString( str );
		}

		br.close();
	}

	private static void pringString( String input )
	{
		String str = input.toLowerCase();
		boolean[] arr = new boolean[100]; // +1 for space
		int position;
		for ( int i = 0; i < str.length(); i++ )
		{
			char ch = str.charAt( i );
			position = Math.abs( ch - 'a' + 1 );

			if ( !arr[position] )
			{
				System.out.print( input.charAt( i ) );
			}

			arr[position] = !arr[position];
		}
		
		System.out.println();
	}
}
