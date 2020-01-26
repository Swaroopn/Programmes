package com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallerGreater
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

			System.out.println( findElement( arr ) );
		}

		br.close();
	}

	private static int findElement( int[] A )
	{
		int n = A.length;

		for ( int i = 0; i < n; i++ )
		{

			// If we found that such number 
			int flag = 0;

			// check All the elements on  
			// its left are smaller 
			for ( int j = 0; j < i; j++ )
				if ( A[j] >= A[i] )
				{
					flag = 1;
					break;
				}

			// check All the elements on  
			// its right are Greater 
			for ( int j = i + 1; j < n; j++ )
				if ( A[j] <= A[i] )
				{
					flag = 1;
					break;
				}

			// If flag == 0 indicates we 
			// found that number 
			if ( flag == 0 )
				return A[i];
		}
		return -1;
	}
}
