package interview;

public class PalindromeRotationString
{

	public static void main( String[] args )
	{
		String[] strs =
		{ "aab", "aaaad", "abcd" };
		checkIfRotatedStrIsPalin( strs );
	}

	private static void checkIfRotatedStrIsPalin( String[] strs )
	{
		for ( int i = 0; i < strs.length; i++ )
		{
			if ( isPalindrome( strs[i] ) )
				System.out.println( strs[i] + " is a Palindrome" );
			else
			{
				int len = strs[i].length();
				for ( int j = 0; j < len - 1; j++ )
				{
					String str1 = strs[i].substring( j + 1 );
					String str2 = strs[i].substring( 0, j + 1 );

					if ( isPalindrome( str1 + str2 ) )
					{
						System.out.println( strs[i] + " is a Palindrome" );
						break;
					}
				}
			}

		}
	}

	private static boolean isPalindrome( String str )
	{
		for ( int i = 0; i < str.length() / 2; i++ )
		{
			if ( str.charAt( i ) != str.charAt( str.length() - 1 - i ) )
				return false;
		}

		return true;
	}

}
