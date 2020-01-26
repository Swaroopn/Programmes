package com.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class LargestNumber
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int N = Integer.parseInt( sc.nextLine() );
		while ( N-- > 0 )
		{
			sc.nextLine();
			String input = sc.nextLine();
			printLargestNum( Arrays.asList( input.split( "[\\s]+" ) ) );
		}
		sc.close();
	}

	private static void printLargestNum( List<String> list )
	{
		Collections.sort( list, new Comparator<String>()
		{

			@Override
			public int compare( String x, String y )
			{
				String xy = x + y;
				String yx = y + x;

				return xy.compareTo( yx ) > 0 ? -1 : 1;
			}
		} );

		for ( String str : list )
			System.out.print( str + "" );

		System.out.println();
	}
}
