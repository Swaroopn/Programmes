package com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class LeaderInArray
{
	public static void main( String[] args ) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int inputs = Integer.parseInt( br.readLine() );
		for ( int i = 0; i < inputs; i++ )
		{
			int N = Integer.parseInt( br.readLine() );
			int[] arr = new int[N];
			String line = br.readLine();
			String[] strs = line.trim().split( "\\s+" );

			// array elements input 
			for ( int j = 0; j < strs.length; j++ )
				arr[j] = Integer.parseInt( strs[j] );

			findLeaders( arr );
		}
	}

	private static void findLeaders( int[] arr )
	{
		List<Integer> leaders = new ArrayList<>();
		int N = arr.length;
		int currMax = arr[N - 1];
		leaders.add( currMax );

		for ( int i = N - 1; i >= 0; i-- )
		{
			if ( arr[i] > currMax )
			{
				leaders.add( arr[i] );
				currMax = arr[i];
			}
		}

		for ( int i = leaders.size() - 1; i >= 0; i-- )
		{
			System.out.print( leaders.get( i ) + " " );
		}
		System.out.println();
	}

}
