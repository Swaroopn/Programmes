package com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StockBuySell
{
	public static void main( String[] args ) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int inputs = Integer.parseInt( br.readLine() );
		for ( int i = 0; i < inputs; i++ )
		{
			int N = Integer.parseInt( br.readLine() );
			int[] arr = new int[N];

			String[] line = br.readLine().trim().split( "\\s+" );
			for ( int j = 0; j < line.length; j++ )
				arr[j] = Integer.parseInt( line[j] );

			stockBuySell( arr );
		}

		br.close();
	}

	private static void stockBuySell( int[] arr )
	{
		int min = arr[0];
		for ( int i = 1; i < arr.length; i++ )
		{
			if ( arr[i] < min )
				min = arr[i];
		}
	}
}
