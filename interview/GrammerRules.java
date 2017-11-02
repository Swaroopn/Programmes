package interview;

public class GrammerRules
{

	public static void main( String[] args )
	{
		String sentence = "My name is KgI.";
		if ( isValid( sentence ) )
			System.out.println( "Valid String" );
		else
			System.out.println( "Invalid String" );
	}

	private static boolean isValid( String sentence )
	{
		final String SEPARATOR = " ";
		String[] words = sentence.split( SEPARATOR );

		// check if first char of sentence is Capital
		String firstWord = words[0];
		if ( !Character.isUpperCase( firstWord.charAt( 0 ) ) )
			return false;

		// check if last char of sentence is '.'
		String lastWord = words[words.length - 1];
		if ( lastWord.charAt( lastWord.length() - 1 ) != '.' )
			return false;

		for ( int i = 0; i < words.length; i++ )
		{
			String word = words[i];
			int len = word.length();

			if ( len > 0 )
			{
				// handler for last word
				if ( i == words.length - 1 )
				{
					for ( int j = 1; j < word.length() - 1; j++ )
						if ( Character.isUpperCase( word.charAt( j ) ) )
						{
							if ( j >= 0 && Character.isUpperCase( word.charAt( j - 1 ) ) )
							{
								return false;
							}
						}
				}

				else
				{
					for ( int start = 1; start < len; start++ )
					{
						char ch = word.charAt( start );
						// check if character after first character in a word is capital except for last word
						if ( Character.isUpperCase( ch ) )
						{
							return false;
						}
					}
				}
			}
			else
				return false;
		}

		return true;
	}

}
