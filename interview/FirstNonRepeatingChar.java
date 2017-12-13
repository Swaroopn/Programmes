package interview;

import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeatingChar
{
	private static final int ALPHA = 26;

	public static void main( String[] args )
	{
		String word = "fffirstNonRepeatedirst";
		System.out.println( getFirstNonRepeated( word ) );
	}

	private static char getFirstNonRepeated( String word )
	{
		char LOWER_CASE = 'a';
		char UPPER_CASE = 'Z';

		int temp = LOWER_CASE;
		boolean[] repeated = new boolean[ALPHA * 2];
		List<Character> unique = new ArrayList<>();

		for ( int i = 0; i < word.length(); i++ )
		{
			char ch = word.charAt( i );
			if ( Character.isUpperCase( ch ) )
				temp = UPPER_CASE + 26;
			else
				temp = LOWER_CASE;

			if ( repeated[Math.abs( ( int ) ch - temp )] )
			{
				unique.remove( ( Character ) ch );
			}
			else
			{
				repeated[Math.abs( ( int ) ch - temp )] = true;
				unique.add( ch );
			}
		}

		return unique.size() > 0 ? unique.get( 0 ) : ' ';
	}
}
