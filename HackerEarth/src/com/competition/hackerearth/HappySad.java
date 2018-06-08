package com.competition.hackerearth;

import java.util.Scanner;

public class HappySad
{
	public static void main( String args[] ) throws Exception
	{
		Scanner s = new Scanner( System.in );
		int totalTC = Integer.parseInt( s.nextLine() );
		for ( int i = 0; i < totalTC; i++ )
		{
			String input = s.nextLine();
			String[] inputs = input.split( " " );
			int one = Integer.parseInt( inputs[0] );
			int two = Integer.parseInt( inputs[1] ) * 2;
			System.out.println( one * two );
		}
		
		s.close();
	}
}
