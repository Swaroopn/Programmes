package com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroupingArray
{
	public static void main( String[] args ) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int inputs = Integer.parseInt( br.readLine() );
		for ( int i = 0; i < inputs; i++ )
		{
			String[] in = br.readLine().split( "\\s+" );
			int N = Integer.parseInt( in[0] );
			int groupSize = Integer.parseInt( in[1] );

			int[] arr = new int[N];
			String line = br.readLine();
			String[] strs = line.trim().split( "\\s+" );

			for ( int j = 0; j < strs.length; j++ )
				arr[j] = Integer.parseInt( strs[j] );

			groupArray( arr, groupSize );
		}

		br.close();
	}

	private static void groupArray( int[] arr, int size )
	{
		for ( int i = 0; i < arr.length; i += size )
		{
			int left = i;
			int right = Math.min( i + size - 1, arr.length - 1 );
			while ( left < right )
			{
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;
			}
		}

		StringBuilder sb = new StringBuilder();
		for ( int i = 0; i < arr.length; i++ )
			sb.append( arr[i] + " " );

		System.out.println( sb );
	}
}
