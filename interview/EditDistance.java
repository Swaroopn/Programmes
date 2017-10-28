package interview;

import java.util.Arrays;

public class EditDistance
{
	public static void main( String[] args )
	{
		int[] alpha = new int[26];
		Arrays.fill( alpha, 0 );

		String str1 = "sunday";
		String str2 = "saturday";

		for ( int i = 0; i < str1.length(); i++ )
		{
			int ascii = str1.charAt( i ) - 97;
			alpha[ascii]++;
		}

		for ( int i = 0; i < str2.length(); i++ )
		{
			int ascii = str2.charAt( i ) - 97;
			alpha[ascii]--;
		}

		int count = 0;
		for ( int i = 0; i < alpha.length; i++ )
			if ( alpha[i] < 0 )
				count += alpha[i];

		System.out.println( "str1 differs from str2 by " + count + " characters" );
	}
}
