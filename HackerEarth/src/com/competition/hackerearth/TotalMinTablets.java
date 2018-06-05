package com.competition.hackerearth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TotalMinTablets
{
	public static void main( String[] args )
	{
		Scanner s = new Scanner( System.in );
		int patientsCount = Integer.parseInt( s.nextLine() );

		int[] healthScores = new int[patientsCount];

		for ( int i = 0; i < patientsCount; i++ )
		{
			healthScores[i] = Integer.parseInt( s.nextLine() );
		}

		Arrays.sort( healthScores );

		findTotalTablets( healthScores );
		s.close();
	}

	private static void findTotalTablets( int[] arr )
	{
		int minTablet = 1;
		int prev = arr[0];

		Map<Integer, Integer> map = new HashMap<>();
		map.put( prev, minTablet );

		int count = 1;
		for ( int i = 1; i < arr.length; i++ )
		{
			int next = arr[i];

			if ( prev < next )
			{
				int tobe = map.get( prev ) + 1;
				count += tobe;
				map.put( next, tobe );
			}
			else
			{
				count += minTablet;
				map.put( next, minTablet );
			}

			prev = next;
		}

		System.out.println( count );
	}
}
