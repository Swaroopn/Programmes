package com.interview;

public class ATOI
{
	public static void main( String[] args )
	{
		String str = "-12345";
		System.out.println( atoi( str ) );
	}

	private static int atoi( String str )
	{
		int result = 0;
		int flag = 1;
		for ( int i = 0; i < str.length(); i++ )
		{
			char ch = str.charAt( i );
			if ( ch == '-' )
				flag = -1;
			else if ( Character.isDigit( ch ) )
				result = result * 10 + ch - '0';
			else
				return -1;
		}

		return result * flag;
	}

}
