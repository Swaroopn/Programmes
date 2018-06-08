package com.competition.hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Browser
{
	private String COM = ".com";
	private List<Character> vowels = Arrays.asList( 'a', 'e', 'i', 'o', 'u' );

	public static void main( String[] args )
	{
		List<String> addressList = new ArrayList<>();

		Scanner s = new Scanner( System.in );
		int totalTestCases = Integer.parseInt( s.nextLine() );

		for ( int i = 0; i < totalTestCases; i++ )
		{
			addressList.add( s.nextLine() );
		}

		Browser b = new Browser();
		b.findMinimumCharsToBeTyped( addressList );

		s.close();
	}

	private void findMinimumCharsToBeTyped( List<String> addressList )
	{
		List<String> output = new ArrayList<>();

		for ( String address : addressList )
		{
			int count = 0;

			String[] split = address.split( "\\." );
			char[] ch = split[1].toCharArray();

			for ( int i = 0; i < ch.length; i++ )
			{
				if ( !vowels.contains( ch[i] ) )
					count++;
			}
			count += COM.length();
			output.add( count + "/" + address.length() );
		}

		for ( String str : output )
			System.out.println( str );
	}
}
