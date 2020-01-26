package com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZigZag
{
	public static void main( String[] args ) throws IOException
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

			zigzag( arr );
			for ( int k = 0; k < arr.length; k++ )
				System.out.print( arr[k] + " " );

			System.out.println();
		}

		br.close();
	}

	private static void zigzag( int[] arr )
	{
		int n = arr.length;
		boolean flag = false;

		for ( int i = 0; i < n - 1; i++ )
		{
			if ( !flag )
			{
				if ( arr[i] > arr[i + 1] )
					swap( arr, i, i + 1 );
			}
			else
			{
				if ( arr[i] < arr[i + 1] )
					swap( arr, i, i + 1 );
			}

			flag = !flag;
		}
	}

	private static void swap( int[] arr, int i, int j )
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
