package interview;

public class RemoveBandAC
{
	private static final int ONE = 1;
	private static final int TWO = 2;

	public static void main( String[] args )
	{
		String word = "bacabaca";
		System.out.println( removeBandAC( word ) );
	}

	private static String removeBandAC( String word )
	{
		int state = ONE;
		String temp = "";

		for ( int i = 0; i < word.length(); i++ )
		{
			char ch = word.charAt( i );
			if ( state == ONE && ch != 'a' && ch != 'b' )
			{
				temp += ch;
			}
			if ( state == TWO && ch != 'c' )
			{
				temp += 'a';
			}

			state = ( ch == 'a' ? TWO : ONE );
		}

		if ( state == TWO )
			temp += 'a';

		return temp;
	}
}
