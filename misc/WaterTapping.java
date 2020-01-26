package com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaterTapping
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

			findTotalUnits( arr );
		}

		br.close();
	}

	public static void findTotalUnits( int[] arr )
	{
		int sum = 0;

		int[] arr1 = new int[arr.length];
		int[] arr2 = new int[arr.length];

		int max = 0;
		for ( int i = 0; i < arr.length; i++ )
		{
			if ( arr[i] > max )
			{
				max = arr[i];
			}
			arr1[i] = max;
		}

		max = 0;
		for ( int i = arr1.length - 1; i >= 0; i-- )
		{
			if ( arr[i] > max )
			{
				max = arr[i];
			}
			arr2[i] = max;
		}

		for ( int i = 0; i < arr.length; i++ )
		{
			sum += Math.min( arr1[i], arr2[i] ) - arr[i];
		}

		System.out.println( sum );
	}
}
