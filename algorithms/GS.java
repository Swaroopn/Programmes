package com.interview.algorithms;

public class GS
{

	public GS()
	{
		// TODO Auto-generated constructor stub
	}

	public static void main( String[] args )
	{
		String abc = "aaabb", output = "";
		int count = 1;
		char temp = abc.charAt( 0 );

		for ( int i = 1; i < abc.length(); i++ )
		{
			char ch = abc.charAt( i );
			if ( temp == ch )
				count++;
			else
			{
				output += Character.toString( temp ) + count;
				temp = ch;
				count = 1;
			}

		}
		output += Character.toString( temp ) + count;

		System.out.println( output );
	}

}
