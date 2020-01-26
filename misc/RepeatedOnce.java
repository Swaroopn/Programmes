package com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RepeatedOnce
{
	public static void main( String[] args ) throws IOException
	{
		Long l = 480853462742423l;
		System.out.println( l.intValue() );
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int inputs = Integer.parseInt( br.readLine() );
		for ( int i = 0; i < inputs; i++ )
		{
			int N = Integer.parseInt( br.readLine() );
			int[] arr = new int[N];

			String[] line = br.readLine().trim().split( "\\s+" );
			for ( int j = 0; j < line.length; j++ )
				arr[j] = Integer.parseInt( line[j] );

			findNonRepeatedItem( arr );
		}

		br.close();
	}

	private static void findNonRepeatedItem( int[] arr )
	{
		int res = arr[0];
		for ( int i = 1; i < arr.length; i++ )
		{
			res = res ^ arr[i];
		}

		System.out.println( res );
	}
}
