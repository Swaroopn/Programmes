package com.competition.hackerearth;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dummy
{
	public static void main( String[] args )
	{
		List<String> arr = new ArrayList<>();
		Scanner s = new Scanner( System.in );
		int input = Integer.parseInt( s.nextLine() );

		for ( int i = 0; i < input; i++ )
		{
			arr.add( s.nextLine() );
		}

		for ( String in : arr )
		{
			String[] o = in.split(" ");
		    if ( o[0].equals( o[1])){
		        System.out.println("YES");
		    }
		    else
		        System.out.println("NO");
		}

		s.close();
	}
}
