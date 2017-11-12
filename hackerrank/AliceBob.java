package com.interview.hackerrank;

import java.util.Scanner;

public class AliceBob
{

	static int[] solve( int a0, int a1, int a2, int b0, int b1, int b2 )
	{
		int[] arr = new int[2];

		int aliceScore = 0;
		int bobScore = 0;
		if ( a0 > b0 )
			aliceScore += 1;
		else
			bobScore += 1;

		if ( a1 > b1 )
			aliceScore += 1;
		else
			bobScore += 1;

		if ( a2 > b2 )
			aliceScore += 1;
		else
			bobScore += 1;
		arr[0] = aliceScore;
		arr[1] = bobScore;
		return arr;
	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int[] result = solve( a0, a1, a2, b0, b1, b2 );
		for ( int i = 0; i < result.length; i++ )
		{
			System.out.print( result[i] + ( i != result.length - 1 ? " " : "" ) );
		}
		System.out.println( "" );

	}
}
