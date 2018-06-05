package com.competition.hackerearth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivideApple
{
	static List<String> list = new ArrayList<>();

	public static void main( String[] args )
	{
		boolean isFound = false;
		String out = "";

		Scanner s = new Scanner( System.in );
		String in = s.nextLine();
		String[] input = in.split( " " );
		
		for ( int i = 0; i < input.length; i++ )
			list.add( input[i].trim() );

		s.close();
		while ( true )
		{
			divide( 0, list.size() - 1 );

			for ( int i = 0; i < list.size() - 1; i++ )
			{
				divide( i, i + 1 );
			}

			out = list.get( 0 );
			for ( int i = 1; i < list.size(); i++ )
			{
				if ( !list.get( i ).equals( out ) )
				{
					isFound = false;
					break;
				}

				isFound = true;
			}

			if ( isFound )
			{
				for ( String str : list )
					System.out.print( str + " " );

				return;
			}
		}
	}

	private static void divide( int i, int j )
	{
		//System.out.println( i + ":" + j );
		int one = Integer.parseInt( list.get( i ) );
		int second = Integer.parseInt( list.get( j ) );

		if ( one == second )
			return;

		if ( one < second )
		{
			while ( one != second && ( one + 1 <= second - 1 ) )
			{
				one++;
				second--;

				list.set( i, one + "" );
				list.set( j, second + "" );
			}
		}
		else if ( one > second )
		{
			while ( one != second && ( one - 1 >= second + 1 ) )
			{
				one--;
				second++;

				list.set( i, one + "" );
				list.set( j, second + "" );
			}
		}

	}
}
