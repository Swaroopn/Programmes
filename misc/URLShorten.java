package com.interview;

import java.util.Scanner;

public class URLShorten
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int count = sc.nextInt();
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		while ( count-- > 0 )
		{
			long input = sc.nextLong();
			String result = "";
			int base = 62;
			long div;
			int rem = 0;

			while ( input >= base )
			{
				div = ( input / base );
				rem = ( int ) ( input % base );

				result = str.charAt( rem ) + result;
				input = div;
			}

			result = str.charAt( ( int ) input ) + result;
			long output = 0;
			for ( int i = 0; i < result.length(); i++ )
			{
				output = output * base + str.indexOf( result.charAt( i ) );
			}

			System.out.println( result );
			System.out.println( output );
		}

		sc.close();
	}
}
