package com.interview;

import java.util.Scanner;

public class LastIndex
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int N = Integer.parseInt( sc.nextLine() );
		while ( N-- > 0 )
		{
			String input = sc.nextLine();
			findLastIndex( input );
		}
		sc.close();
	}

	private static void findLastIndex( String input )
	{
		int index = -1;
		for ( int i = input.length() - 1; i >= 0; i-- )
		{
			if ( input.charAt( i ) == '1' )
			{
				index = i;
				break;
			}
		}

		System.out.println( index );
	}

}
