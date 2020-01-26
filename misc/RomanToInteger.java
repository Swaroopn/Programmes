package com.interview;

import java.util.Scanner;

public class RomanToInteger
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int test = Integer.parseInt( sc.nextLine() );
		while ( test-- > 0 )
		{
			String roman = sc.nextLine();
			System.out.println( convertToRoman( roman ) );
		}
		sc.close();
	}

	private static int convertToRoman( String roman )
	{
		int x, y, res = 0;
		int N = roman.length();
		for ( int i = 0; i < N; i++ )
		{
			if ( i == N - 1 )
			{
				x = value( roman.charAt( i ) );
				res += x;
				break;
			}
			else
			{
				x = value( roman.charAt( i ) );
				y = value( roman.charAt( i + 1 ) );

				if ( x >= y )
					res += x;
				else
					res -= x;
			}
		}

		return res;
	}

	private static int value( char c )
	{
		if ( c == 'I' )
			return 1;
		else if ( c == 'V' )
			return 5;
		else if ( c == 'X' )
			return 10;
		else if ( c == 'L' )
			return 50;
		else if ( c == 'C' )
			return 100;
		else if ( c == 'D' )
			return 500;
		else if ( c == 'M' )
			return 1000;
		return -1;
	}
}
