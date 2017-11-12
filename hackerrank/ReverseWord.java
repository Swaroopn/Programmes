package com.interview.hackerrank;

public class ReverseWord
{
	public static void main( String[] args )
	{
		String str = "i.like.this.program.much";

		Reverse( str );
	}

	public static void Reverse( String str )
	{
		String[] splitStr = str.split( "\\." );
		for ( int i = splitStr.length - 1; i >= 0; i-- )
		{
			System.out.print( splitStr[i] );
			if ( i != 0 )
				System.out.print( "." );
		}
	}
}
