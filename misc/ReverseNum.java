package com.interview;

import java.util.Scanner;

public class ReverseNum
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int count = Integer.parseInt( sc.nextLine() );
		while ( count-- > 0 )
		{
			long num = Long.parseLong( sc.nextLine() );
			reverse( num );
		}

		sc.close();
	}

	private static void reverse( long num )
	{
		long rem = 0;
		String str = "";

		while ( num > 0 )
		{
			rem = num % 10;
			num = num / 10;

			str += rem;
		}

		System.out.println( Long.valueOf( str ) );
	}
}
