package interview;

public class WildCardMatching
{
	public static void main( String[] args )
	{
		String pattern = "x?y*z";
		String str = "xaylmz";

		if ( isMatch( pattern, str ) )
			System.out.println( "Matching" );
		else
			System.out.println( "Not Matching" );
	}

	private static boolean isMatch( String ptr, String word )
	{
		char[] pattern = ptr.toCharArray();
		char[] str = word.toCharArray();

		/* Assuming pattern will not contain multiple '*' */
		boolean[][] T = new boolean[str.length + 1][pattern.length + 1];

		/* T[0][0] will be always true */
		T[0][0] = true;

		/* if first char in pattern is '*' */
		if ( pattern[0] == '*' )
			T[0][1] = true;

		for ( int row = 1; row < T.length; row++ )
		{
			for ( int col = 1; col < T[0].length; col++ )
			{
				if ( str[row - 1] == pattern[col - 1] || pattern[col - 1] == '?' )
					T[row][col] = T[row - 1][col - 1];
				else if ( pattern[col - 1] == '*' )
					T[row][col] = T[row - 1][col] || T[row][col - 1];
			}
		}

		return T[str.length][pattern.length];
	}
}
