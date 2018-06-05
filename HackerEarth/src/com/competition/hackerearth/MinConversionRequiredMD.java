package com.competition.hackerearth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinConversionRequiredMD
{
	public static void main( String[] args )
	{
		Scanner s = new Scanner( System.in );
		int input = Integer.parseInt( s.nextLine() );

		List<String> arr = new ArrayList<>();
		for ( int i = 0; i < input; i++ )
		{
			arr.add( s.nextLine() );
		}

		for ( String string : arr )
		{
			String[] splitString = string.split( " " );
			String one = splitString[0];
			String two = splitString[1];
			int third = Integer.parseInt( splitString[2] );

			if ( one.length() == two.length() )
			{
				char[] ch1 = one.toCharArray();
				char[] ch2 = two.toCharArray();

				int count = 0;

				for ( int j = 0; j < one.length(); j++ )
				{
					if ( ch1[j] == 'M' )
					{
						ch1[j] = 'D';
					}
					else if ( ch1[j] == 'D' )
					{
						ch1[j] = 'M';
					}

					count++;
					if ( count == third )
						break;
				}

				if ( Arrays.toString( ch1 ).equals( Arrays.toString( ch2 ) ) )
					System.out.println( "YES" );
				else
					System.out.println( "NO" );
			}
			else
				System.out.println( "NO" );
		}
		
		s.close();
	}
}
