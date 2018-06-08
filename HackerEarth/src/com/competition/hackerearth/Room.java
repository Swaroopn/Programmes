package com.competition.hackerearth;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Room
{
	public static void main( String[] args )
	{
		Scanner s = new Scanner( System.in );
		int input = -1;
		String str = "";
		do
		{
			Set<Character> set = new HashSet<>();

			str = s.nextLine();

			if ( Character.isDigit( str.charAt( 0 ) ) && str.charAt( 0 ) == '0' )
				break;

			List<Integer> rooms = new ArrayList<>();

			String st = s.nextLine();
			input = Integer.parseInt( st.trim() );

			if ( input == 0 )
				break;

			rooms.add( input );

			Boolean[] alpha = new Boolean[26];
			for ( int i = 0; i < alpha.length; i++ )
				alpha[i] = false;

			char[] ch = str.toCharArray();
			int count = 0;
			for ( Integer room : rooms )
			{
				for ( int i = 0; i < ch.length; i++ )
				{
					char c = ch[i];
					int roomNum = c - 'A';

					if ( count < room || alpha[roomNum] )
					{
						alpha[roomNum] = !alpha[roomNum];
						if ( alpha[roomNum] )
							count++;
						else
							count--;
					}
					else
						set.add( c );
				}
			}

			System.out.println( set.size() );
			input = -1;
		}
		while ( input != 0 || ( Integer.parseInt( str ) != 0 ) );

		s.close();
	}
}
