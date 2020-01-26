package com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PythagoreanTriplet
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

			int totalStudents = Integer.parseInt( br.readLine() );
			findPythagoreanTriplet( arr, totalStudents );
		}

		br.close();
	}

	private static void findPythagoreanTriplet( int[] arr, int k )
	{
		int min = Integer.MAX_VALUE;

		Arrays.sort( arr );
		if ( k == arr.length )
		{
			System.out.println( arr[arr.length - 1] - arr[0] );
			return;
		}
		
		for ( int i = 0; i <= arr.length - k; i++ )
		{
			int diff = arr[k + i - 1] - arr[i];
			if ( diff < min )
				min = diff;
		}

		System.out.println( min );
	}
}
