package com.competition.hackerearth;

import java.util.Scanner;

public class NthPermutation
{
	public static void main( String[] args )
	{
		Scanner s = new Scanner( System.in );
		int digit = Integer.parseInt( s.nextLine() );

		long[] num = new long[digit];
		for ( int i = 0; i < digit; i++ )
		{
			String n = s.nextLine();
			num[i] = Long.parseLong( n );
		}

		findPalindrome( num );
		s.close();
	}

	private static void findPalindrome( long[] num )
	{
		for ( int i = 0; i < num.length; i++ )
		{
			long palin = getPalindrome( num[i] );
			findGreatestNum( palin );
		}

	}

	private static void findGreatestNum( Long palin )
	{
		int maxRepeatNumber = 0;
		int[] numbers = new int[]
		{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int actualNum = -1;

		char[] ch = palin.toString().toCharArray();
		for ( int i = 0; i < ch.length; i++ )
		{
			actualNum = Integer.parseInt( ch[i] + "" );
			numbers[actualNum]++;
		}

		int maxRepeat = numbers[0];

		for ( int i = 1; i < numbers.length; i++ )
		{
			if ( numbers[i] > maxRepeat )
			{
				maxRepeat = numbers[i];
				maxRepeatNumber = i;
			}
		}
		System.out.println( maxRepeatNumber );
	}

	private static long getPalindrome( long requiredPalinCount )
	{
		int count = 0;
		Long startNum = 11l;

		if ( requiredPalinCount > 20000 )
		{
			count = 20000;
			startNum = ( long ) Math.pow( 10, 9 ) + ( long ) Math.pow( 9, 9 );
		}
		else if ( requiredPalinCount > 10000 )
		{
			count = 10000;
			startNum = ( long ) Math.pow( 10, 9 );
			//startNum = 1000000001l;
		}

		while ( true )
		{
			char[] ch = startNum.toString().toCharArray();
			int len = ch.length;
			if ( len % 2 == 0 )
			{
				long inverse = getInverse( startNum );
				if ( startNum == inverse )
				{
					//System.out.println( startNum );
					count++;
				}

				if ( count == requiredPalinCount )
				{
					return startNum;
				}
			}
			else
			{
				long last = ( long ) ( Math.pow( 10, len - 1 ) * 9 );
				//System.out.println( "Skipping from " + startNum + " -> " + last );
				startNum += last;
			}

			startNum++;
		}
	}

	private static long getInverse( Long startNum )
	{
		long inv = 0;

		while ( startNum > 0 )
		{
			inv = inv * 10 + startNum % 10;
			startNum /= 10;

		}

		return inv;
	}
}
