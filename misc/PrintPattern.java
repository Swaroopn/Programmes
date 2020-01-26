package com.interview;

import java.util.Scanner;

public class PrintPattern
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int count = Integer.parseInt( sc.nextLine() );
		while ( count-- > 0 )
		{
			int num = Integer.parseInt( sc.nextLine().trim() );
			printPattern( num );
		}

		sc.close();
	}

	private static void printPattern( int num )
	{
		if ( num > 0 )
		{
			System.out.print( num + " " );
			printPattern( num - 5 );
			System.out.print( num + " " );
		}
		else
		{
			System.out.print( num + " " );
		}
	}
}
