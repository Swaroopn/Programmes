package interview;

public class StringRepresentBySubStr
{
	/** Not Implemented **/
	public static void main( String[] args )
	{
		String str = "ababaababaababa";
		System.out.println( isRepresentedBySubStr( str ) );
	}

	private static boolean isRepresentedBySubStr( String str )
	{
		int wordLen = getLenOfStr( str );
		if ( wordLen > 0 )
		{
			for ( int start = 0; start < ( str.length() / wordLen ) - 1; start++ )
			{
				String str1 = str.substring( start, start + wordLen );
				String str2 = str.substring( start + wordLen, start + ( wordLen * 2 ) );
				if ( str1.equals( str2 ) )
					continue;
				else
					return false;
			}

			return true;
		}
		return false;
	}

	private static int getLenOfStr( String str )
	{
		char ch = str.charAt( 0 );
		for ( int i = 1; i < str.length(); i++ )
		{
			if ( ch == str.charAt( i ) && ( str.length() % ( i + 1 ) ) == 0 )
			{
				return i + 1;
			}
		}

		return -1;
	}

}
