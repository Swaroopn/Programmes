package interview;

public class SubsequenceOfString
{

	public static void main( String[] args )
	{
		String seq = "agpy";
		String word = "abcdefghijklmnopqrstuvwxyz";

		if ( isSubSequence( seq, word ) )
			System.out.println( "Yes" );
		else
			System.out.println( "No" );
	}

	private static boolean isSubSequence( String seq, String word )
	{
		boolean isPresent = false;
		int pos = -1;

		for ( int i = 0; i < seq.length(); i++ )
		{
			isPresent = false;
			char ch1 = seq.charAt( i );
			for ( int j = pos + 1; j < word.length(); j++ )
			{
				char ch2 = word.charAt( j );
				if ( ch1 == ch2 )
				{
					pos = j;
					isPresent = true;
					break;
				}
			}
			if ( !isPresent )
				return false;
		}

		return true;
	}

}
