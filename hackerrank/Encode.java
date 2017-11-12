package com.interview.hackerrank;

public class Encode
{
	public static void main( String[] args )
	{
		secureChannel( 2, "oppeeennnn", "12345" );
	}

	static String secureChannel( int operation, String message, String key )
	{
		String output = "";
		int i = 0;

		if ( message.length() < 1 && key.length() < 1 )
		{
			return "-1";
		}
		if ( operation == 1 )
		{
			// Encode
			for ( ; i < message.length() && i < key.length(); i++ )
			{
				char ch = message.charAt( i );
				int time = Character.getNumericValue( key.charAt( i ) );

				for ( int j = 0; j < time; j++ )
					output += ch;

			}
			for ( ; i < message.length(); i++ )
				output += message.charAt( i );

		}
		else if ( operation == 2 )
		{
			int j = 0;
			// Decode
			for ( ; i < message.length() && j < key.length(); )
			{
				int incr = Character.getNumericValue( key.charAt( j++ ) );
				
				output += message.charAt( i );
				i = i + incr;
			}
			for ( ; i < message.length(); i++ )
				output += message.charAt( i );

		}
		else
		{
			return "-1";
		}

		System.out.println( output );
		return null;
	}
}
