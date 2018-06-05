package com.competition.hackerearth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PassTheBall
{
	private static final String SPACE = " ";
	static int prevPlayer = -1;
	static int nextPlayer = -1;

	public static void main( String[] args )
	{
		List<String> allTC = new ArrayList<>();

		Scanner s = new Scanner( System.in );
		String input = s.nextLine();

		String[] in = input.split( SPACE );
		int totalTC = Integer.parseInt( in[0] );
		nextPlayer = Integer.parseInt( in[1] );

		for ( int i = 0; i < totalTC; i++ )
		{
			allTC.add( s.nextLine() );
		}

		findSol( allTC );
		s.close();
	}

	private static void findSol( List<String> allTC )
	{
		String[] input = new String[]
		{};

		for ( String str : allTC )
		{
			input = str.split( SPACE );
			if ( input[0].trim().equalsIgnoreCase( "P" ) )
			{
				prevPlayer = nextPlayer;
				nextPlayer = Integer.parseInt( input[1].trim() );
				System.out.println( "Prev: " + prevPlayer + "::" + "Next: " + nextPlayer );
			}
			else if ( input[0].trim().equalsIgnoreCase( "B" ) )
			{
				swapPlayers();
			}
		}

		System.out.println( "Player " + nextPlayer );
	}

	private static void swapPlayers()
	{
		int temp = prevPlayer;
		prevPlayer = nextPlayer;
		nextPlayer = temp;
	}
}
