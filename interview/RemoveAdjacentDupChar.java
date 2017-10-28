package interview;

public class RemoveAdjacentDupChar
{
	public static void main( String[] args )
	{
		String word = "abccbazzd";
		System.out.println( removeAdjDupCharacter( word ) );
	}

	private static String removeAdjDupCharacter( String src )
	{
		int i = 0;
		while ( i < src.length() )
		{
			int j = i;
			while ( j < src.length() - 1 && src.charAt( i ) == src.charAt( j + 1 ) )
			{
				j++;
			}
			if ( j > i )
			{
				src = src.substring( 0, i ) + src.substring( j + 1, src.length() );
				i--;
			}
			else
			{
				i++;
			}

			/* re-initialize i to the starting index of the string */
			if ( i < 0 )
				i = 0;
		}

		if ( i < 1 )
		{
			return "-1";
		}
		else
		{
			return src;
		}
	}

}
