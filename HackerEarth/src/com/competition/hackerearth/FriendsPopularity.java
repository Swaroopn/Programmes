package com.competition.hackerearth;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FriendsPopularity
{
	public static void main( String[] args )
	{
		Scanner s = new Scanner( System.in );
		int totalTestCases = Integer.parseInt( s.nextLine() );

		Map<Integer, List<String>> map = new HashMap<>();
		String friendAndToBeDeleted = "";
		String friends = "";

		for ( int i = 0; i < totalTestCases; i++ )
		{
			friendAndToBeDeleted = s.nextLine();
			int count = Integer.parseInt( friendAndToBeDeleted.split( " " )[1].trim() );
			friends = s.nextLine();

			map.put( count, new ArrayList<>() );
			String[] fr = friends.split( " " );
			for ( String str : fr )
				map.get( count ).add( str );

		}

		for ( Integer key : map.keySet() )
		{
			int count = 0;
			boolean atleastOneDel = false;
			List<String> values = map.get( key );

			while ( count < key )
			{
				unFriend( values, atleastOneDel, count );
			}

			if ( !atleastOneDel )
			{
				values.set( values.size() - 1, "-1" );
			}
			atleastOneDel = false;
		}

		for ( Integer key : map.keySet() )
		{
			String output = "";
			for ( String str : map.get( key ) )
			{
				if ( !str.equalsIgnoreCase( "-1" ) )
					output += str + " ";
			}
			System.out.println( output );
		}
		s.close();
	}

	private static void unFriend( List<String> values, boolean atleastOneDel, int count )
	{
		for ( int i = 0; i < values.size() - 1; i++ )
		{
			Integer first = Integer.parseInt( values.get( i ) );
			Integer next = Integer.parseInt( values.get( i + 1 ) );

			if ( first == -1 || next == -1 )
				continue;

			if ( first < next )
			{
				count++;
				values.set( i, "-1" );
				atleastOneDel = true;
			}
		}
	}
}
