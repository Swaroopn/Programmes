package com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FrequentWord
{
	public static void main( String[] args ) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int inputs = Integer.parseInt( br.readLine() );
		for ( int i = 0; i < inputs; i++ )
		{
			br.readLine();
			String input = br.readLine();
			findFrequentWord( input );
		}

		br.close();
	}

	private static void findFrequentWord( String input )
	{
		String[] in = input.split( "[\\s]+" );
		Map<String, Integer> map = new LinkedHashMap<>();
		String freqWord = null;
		int count = 0;
		List<String> list = new ArrayList<>();
		for ( String str : in )
		{
			int temp = 1;
			if ( map.containsKey( str ) )
			{
				temp = map.get( str ) + 1;
			}

			map.put( str, temp );
			if ( temp > count )
			{
				count = temp;
				freqWord = str;
			}
			else if ( temp == count )
			{
				if ( !list.contains( str ) )
				{
					list.add( str );
					freqWord = str;
				}
			}
		}

		System.out.println( freqWord );
	}

}
