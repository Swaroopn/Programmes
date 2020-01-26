package com.interview;

import java.util.Scanner;

public class Clock
{
	static String timeConversion( String s )
	{
		String[] dateTime = s.split( ":" );
		int hour = Integer.parseInt( dateTime[0] );
		String minute = dateTime[1];
		String sec = dateTime[2].substring( 0, 2 );

		if ( dateTime[2].contains( "PM" ) )
		{
			hour = hour + 12;
			if ( hour == 24 )
				hour = 12;
		}
		else if ( hour == 12 )
			hour = 0;

		String temp = hour + "";
		if ( hour < 12 )
			temp = "0" + temp;
		return temp + ":" + minute + ":" + sec;

	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner( System.in );
		String s = in.next();
		String result = timeConversion( s );
		System.out.println( result );
	}
}
