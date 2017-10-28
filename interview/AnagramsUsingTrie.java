package interview;

import java.util.HashMap;
import java.util.Map;

class TrieNodeAnagram
{
	char c;
	Map<Character, TrieNodeAnagram> children = new HashMap<>();
	boolean isLeaf;
	int count;

	public TrieNodeAnagram()
	{
	}

	public TrieNodeAnagram( char c )
	{
		this.c = c;
		this.count = 0;
	}
}

class TrieAnagram
{
	private TrieNodeAnagram root;

	public TrieAnagram()
	{
		this.root = new TrieNodeAnagram();
	}

	public void insert( String word )
	{
		Map<Character, TrieNodeAnagram> children = this.root.children;

		for ( int i = 0; i < word.length(); i++ )
		{
			TrieNodeAnagram t;
			char currentChar = word.charAt( i );
			if ( children.containsKey( currentChar ) )
				t = children.get( currentChar );
			else
			{
				t = new TrieNodeAnagram( currentChar );
				children.put( currentChar, t );
			}

			children = t.children;

			if ( i == word.length() - 1 )
			{
				t.isLeaf = true;
				t.count++;
			}
		}
	}

	public boolean searchForAnagram( String word )
	{
		TrieNodeAnagram t = searchNode( word );
		if ( t != null && t.isLeaf && t.count > 1 )
			return true;
		else
			return false;
	}

	private TrieNodeAnagram searchNode( String word )
	{
		Map<Character, TrieNodeAnagram> children = this.root.children;
		TrieNodeAnagram t = null;
		for ( int i = 0; i < word.length(); i++ )
		{
			char currentChar = word.charAt( i );
			if ( children.containsKey( currentChar ) )
			{
				t = children.get( currentChar );
				children = t.children;
			}
			else
				return null;
		}

		return t;
	}

	public boolean containsPrefix( String word )
	{
		if ( searchNode( word ) == null )
			return false;

		return true;
	}
}

public class AnagramsUsingTrie
{
	public static void main( String[] args )
	{
		String[] words =
		{ "cat", "act", "tac", "aws", "cool", "dog", "god" };

		printAnagrams( words );
	}

	public static void printAnagrams( String[] words )
	{
		buildTrie( words );
	}

	private static void buildTrie( String[] words )
	{
		TrieAnagram trie = new TrieAnagram();

		for ( int i = 0; i < words.length; i++ )
		{
			String sortedWord = StringHelper.getSortedString( words[i] );
			trie.insert( sortedWord );
		}

		for ( int i = 0; i < words.length; i++ )
		{
			String sortedWord = StringHelper.getSortedString( words[i] );
			if ( trie.searchForAnagram( sortedWord ) )
				System.out.println( words[i] );

		}
	}

}
