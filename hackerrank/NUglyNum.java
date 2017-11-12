package com.interview.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class NUglyNum
{
	public static void main( String[] args )
	{
		findNthUgly( 15 );
	}

	private static void findNthUgly( int count )
	{
		int start = 4;
		List<Integer> list = new ArrayList<Integer>();
		list.add( 1 );
		list.add( 2 );
		list.add( 3 );
		while ( list.size() != count )
		{
			if ( ( start % 2 == 0 ) || ( start % 3 == 0 ) || ( start % 5 == 0 ) )
			{
				list.add( start );
			}
			start++;
		}

		System.out.println( list.get( list.size() - 1 ) );
	}
}
