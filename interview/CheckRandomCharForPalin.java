package interview;

public class CheckRandomCharForPalin
{

	public static void main( String[] args )
	{
		String str = "dammadsa";
		checkIfRandromIsPalindrome( str );
	}

	private static void checkIfRandromIsPalindrome( String str )
	{
		int[] alpha = new int[26];
		for ( int i = 0; i < str.length(); i++ )
		{
			char ch = str.charAt( i );
			alpha[Math.abs( ch - 'a' )]++;
		}
		int count = 0;
		for ( int i = 0; i < alpha.length; i++ )
		{
			if ( alpha[i] % 2 != 0 )
				count++;
		}
		if ( count > 1 )
			System.out.println( "not palindrome" );
		else
			System.out.println( "Palindrome" );
	}

}
