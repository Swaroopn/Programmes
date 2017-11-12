package com.interview.hackerrank;

import java.util.Scanner;

public class DateTime
{
	static String timeConversion(String s) {
        String[] dateTime = s.split(":");
        int hour = Integer.parseInt(dateTime[0]);
        String minute = dateTime[1];
        String sec = dateTime[2];
        sec = sec.substring( 0, 2 );
        if (hour == 12)
            hour = 0;
		else if ( hour < 12 )
			hour = hour + 12;

        String temp = hour+"";
        if (hour == 0)
            temp = "0"+temp;
		return temp + ":" + dateTime[1] + ":" + sec;

	}

	public static void main( String[] args )
	{
		Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
