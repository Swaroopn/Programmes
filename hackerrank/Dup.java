package com.interview.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Dup
{

	public static void main( String[] args )
	{
		String[][] matrix =
		{
				{ "1", "a", "1", "2" },
				{ "2", "b", "e", "e" },
				{ "3", "c", "d", "f" } };

		findDuplicates( matrix );
	}

	static int findDuplicates( String[][] matrix )
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		int count = 0;

		for ( int row = 0; row < matrix.length; row++ )
		{
			for ( int col = 0; col < matrix[0].length; col++ )
			{
				String item = matrix[row][col];

				if ( map.get( item ) != null )
				{
					int value = map.get( item );
					map.put( item, value + 1 );
				}
				else
					map.put( item, 1 );

			}
		}
		for ( String key : map.keySet() )
		{
			int value = map.get( key );
			if ( value > 1 )
				count++;
		}
		System.out.println( count );
		return count;
	}

}
