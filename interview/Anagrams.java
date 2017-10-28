package interview;

import java.util.HashMap;
import java.util.Map;

public class Anagrams
{
	public static void main( String[] args )
	{
		String[] words =
		{ "act", "cat", "dog", "god", "swa" };
		printAnagrams( words );
	}

	private static void printAnagrams( String[] words )
	{
		Map<String, Integer> map = new HashMap<>();

		for ( int i = 0; i < words.length; i++ )
		{
			String sortedWord = StringHelper.getSortedString( words[i] );
			Integer count = map.get( sortedWord );
			if ( count == null )
				count = 0;
			map.put( sortedWord, ++count );
		}

		for ( String word : map.keySet() )
		{
			int count = map.get( word );
			if ( count > 1 )
				System.out.println( word );
		}
	}

}
