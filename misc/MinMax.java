package com.interview;

import java.util.Scanner;

public class MinMax
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		String[] arr = sc.nextLine().split( "[\\s]+" );

		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		long sum = 0;

		for ( int i = 0; i < arr.length; i++ )
		{
			long item = Integer.parseInt( arr[i] );
			sum += item;

			if ( item < min )
				min = item;

			if ( item > max )
				max = item;

		}

		System.out.println( ( sum - max ) + " " + ( sum - min ) );

		sc.close();
	}
}
