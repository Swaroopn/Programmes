package interview;

/**
 * 
 * O(n<sup>2</sup>)
 *
 */

public class LongestPalindromeN2
{
	public static void main( String[] args )
	{
		String word = "banana";
		System.out.println( "Longest Palindrome is: " + lps( word ) );
	}

	private static String lps( String word )
	{
		int len = word.length();
		int palindromeBeginsAt = 0;
		int maxLen = 1; // length of longest palindrome
		boolean palindrome[][] = new boolean[len][len];

		// For single letter palindrome
		for ( int i = 0; i < len; i++ )
			palindrome[i][i] = true;

		// For 2 letter palindrome
		for ( int i = 0; i < len - 1; i++ )
		{
			if ( word.charAt( i ) == word.charAt( i + 1 ) )
			{
				palindrome[i][i + 1] = true;
				palindromeBeginsAt = i;
				maxLen = 2;
			}
		}

		// Finding Palindrome for string length > 3 to n
		for ( int curLen = 3; curLen <= len; curLen++ )
		{
			for ( int i = 0; i < len - curLen + 1; i++ )
			{
				int j = i + curLen - 1;
				if ( word.charAt( i ) == word.charAt( j ) && palindrome[i + 1][j - 1] )
				{
					palindrome[i][j] = true;
					palindromeBeginsAt = i;
					maxLen = curLen;
				}
			}
		}

		return word.substring( palindromeBeginsAt, palindromeBeginsAt + maxLen );
	}
}
