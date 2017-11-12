package com.interview.hackerrank;

public class NonRepeatingChar
{

	public static void main( String[] args )
	{
		String str = "abcdabced";
		findFirstNonRepeating( str );
	}

	private static void findFirstNonRepeating( String str )
	{
		int[][] multi = new int[str.length()][2];
		for ( int i = 0; i < multi.length; i++ )
		{
			multi[i][1] = 1;
		}
		for ( int i = 0; i < str.length() - 1; i++ )
		{
			boolean isPresent = false;

			char ch = str.charAt( i );
			
			for ( int k = 0; k < str.length(); k++ )
			{
				if ( multi[k][0] == ch )
				{
					isPresent = true;
					break;
				}
			}
			
			if ( isPresent )
				continue;
			else
				multi[i][0] = ch;

			for ( int j = i + 1; j < str.length(); j++ )
			{
				char temp = str.charAt( j );

				if ( ch == temp )
				{
					multi[i][1] = multi[i][1] + 1;
				}
			}
		}

		int min = 0;
		for ( int i = 1; i < multi.length; i++ )
		{
			if ( multi[i][0] > 0 && multi[i][1] < multi[min][1] )
				min = i;
		}

		System.out.println( "First Non-Repeating character: " + ( char ) multi[min][0] );
	}

}
