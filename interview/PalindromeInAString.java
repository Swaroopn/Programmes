package interview;

import java.util.HashSet;
import java.util.Set;

public class PalindromeInAString
{

	public static void main( String[] args )
	{
		String str = "abbaalla";
		printAllPalindrome( str );
	}

	private static void printAllPalindrome( String str )
	{
		Set<String> palindromeSet = new HashSet<>();

		for ( int i = 0; i < str.length(); i++ )
		{
			for ( int j = i; j < str.length(); j++ )
			{
				System.out.println( "comparing: " + str.substring( i, j + 1 ) );
				String subStr = str.substring( i, j + 1 );
				if ( isPalindrome( subStr ) )
					palindromeSet.add( subStr );
			}
		}

		for ( String palin : palindromeSet )
			System.out.println( palin );
	}

	private static boolean isPalindrome( String subStr )
	{
		for ( int i = 0; i < subStr.length() / 2; i++ )
		{
			if ( subStr.charAt( i ) == subStr.charAt( subStr.length() - 1 - i ) )
				continue;
			else
				return false;
		}

		return true;
	}

}
