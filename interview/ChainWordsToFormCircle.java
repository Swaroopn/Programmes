package interview;

import java.util.ArrayList;
import java.util.List;

public class ChainWordsToFormCircle
{
	public static void main( String[] args )
	{
		String[] words =
		{ "swa", "kjl", "lmn", "nos" };

		List<String> result = checkIfChainingPossiblw( words );
		if ( result != null && result.size() > 0 )
		{
			for ( String r : result )
				System.out.println( r );
		}
		else
			System.out.println( "Chaining not possible" );
	}

	private static List<String> checkIfChainingPossiblw( String[] words )
	{
		List<String> result = new ArrayList<>();
		result.add( words[0] );
		boolean[] used = new boolean[words.length];

		if ( formCircle( words, result, used, words[0].charAt( 0 ) ) )
			return result;
		return null;
	}

	private static boolean formCircle( String[] input, List<String> result, boolean[] used, char firstChar )
	{
		if ( input.length == result.size() )
		{
			String str = result.get( result.size() - 1 );
			if ( firstChar == str.charAt( str.length() - 1 ) )
			{
				return true;
			}
			return false;
		}
		String str = result.get( result.size() - 1 );
		char lastChar = str.charAt( str.length() - 1 );
		for ( int i = 1; i < input.length; i++ )
		{
			if ( used[i] )
			{
				continue;

			}
			if ( lastChar == input[i].charAt( 0 ) )
			{
				used[i] = true;
				result.add( input[i] );
				boolean r = formCircle( input, result, used, firstChar );
				if ( r )
				{
					return true;
				}
				used[i] = false;
				result.remove( result.size() - 1 );
			}

		}
		return false;
	}
}
