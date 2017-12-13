package interview;

public class CountWords
{
	public static void main( String[] args )
	{
		String sentence = "This  is\n a     long sentence";
		System.out.println( getTotalWords( sentence ) );
	}

	private static int getTotalWords( String sentence )
	{
		boolean state = Boolean.FALSE;
		int words = 0;

		for ( int i = 0; i < sentence.length(); i++ )
		{
			char c = sentence.charAt( i );
			if ( c == ' ' || c == '\n' || c == '\t' )
				state = Boolean.FALSE;
			else if ( state == Boolean.FALSE )
			{
				state = Boolean.TRUE;
				++words;
			}
		}

		return words;
	}
}
