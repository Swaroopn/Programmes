package com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CamelCase
{
	public static void main( String[] args ) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int inputs = Integer.parseInt( br.readLine() );
		for ( int i = 0; i < inputs; i++ )
		{
			br.readLine();

			String input = br.readLine();
			String match = br.readLine();

			findWord( input, match );
		}

		br.close();
	}

	private static void findWord( String input, String match )
	{
		boolean flag = false;
		String[] in = input.split( "[ \\s]+" );
		Map<String, List<String>> map = new HashMap<>();
		for ( String str : in )
		{
			String temp = "";
			String[] split = str.split( "(?<=[a-z])(?=[A-Z])|(?<=[A-Z])(?=[A-Z][a-z])" );
			for ( int i = 0; i < split.length; i++ )
			{
				temp += split[i].charAt( 0 );
			}

			if ( map.get( temp ) == null )
				map.put( temp, new ArrayList<>() );
			map.get( temp ).add( str );

			if ( temp.startsWith( match ) )
			{
				flag = true;
				System.out.print( str + " ");
			}
		}

		if ( !flag )
			System.out.println( "No match found" );

	}
}