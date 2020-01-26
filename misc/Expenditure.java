package com.interview;

import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Expenditure
{
	public static void main( String[] args ) throws IOException
	{
		Scanner sc = new Scanner( System.in );

		String[] input = sc.nextLine().split( "[\\s]+" );
		int size = Integer.parseInt( input[0] );
		int k = Integer.parseInt( input[1] );

		String[] expenditure = sc.nextLine().split( "[\\s]+" );
		int[] arr = new int[size];
		SortedMap<Integer, Integer> map = new TreeMap<>();
		int count = 0;
		for ( int i = 0; i < expenditure.length; i++ )
		{
			arr[i] = Integer.parseInt( expenditure[i] );
			if ( map.containsKey( arr[i] ) )
				map.put( arr[i], map.get( arr[i] ) + 1 );
			else
				map.put( arr[i], 1 );
		}

		for ( int i = k; i < size; i++ )
		{
			int sum = 0;
			int median = 0;
			boolean flag = false;

			for ( Map.Entry<Integer, Integer> entry : map.entrySet() )
			{
				sum += entry.getValue();
				if ( sum >= k / 2 + 1 && k % 2 == 0 )
				{
					if ( flag )
						median += entry.getKey();
					else
						median = 2 * entry.getKey();

					break;
				}

				if ( sum > k / 2 )
				{
					median = 2 * entry.getKey();
					break;
				}
				else if ( sum == k / 2 && k % 2 == 0 )
				{
					median += entry.getKey();
					flag = true;
				}
			}

			if ( arr[i] >= median )
				count++;
			if ( map.get( arr[i - k] ) == 1 )
				map.remove( arr[i - k] );
			else
				map.put( arr[i - k], map.get( arr[i - k] ) - 1 );

			if ( map.containsKey( arr[i] ) )
				map.put( arr[i], map.get( arr[i] + 1 ) );
			else
				map.put( arr[i], 1 );
		}

		System.out.println( count );
		sc.close();

	}
}
