package interview;

import java.util.Arrays;

public class StringHelper
{
	public static String getSortedString( String word )
	{
		char[] charArray = word.toCharArray();
		Arrays.sort( charArray );
		return new String( charArray );
	}
}
