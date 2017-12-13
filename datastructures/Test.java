package datastructures;

import java.util.HashMap;

class TrieNode
{
	private char value;
	private HashMap<Character, TrieNode> children;
	private boolean bIsEnd;

	public TrieNode( char ch )
	{
		this.value = ch;
		this.children = new HashMap<Character, TrieNode>();
		this.bIsEnd = false;
	}

	public char getValue()
	{
		return value;
	}

	public boolean isbIsEnd()
	{
		return bIsEnd;
	}

	public void setbIsEnd( boolean bIsEnd )
	{
		this.bIsEnd = bIsEnd;
	}

	public HashMap<Character, TrieNode> getChildren()
	{
		return children;
	}
}

class Trie
{
	private TrieNode root;

	public Trie()
	{
		this.root = new TrieNode( ( char ) 0 );
	}

	public void insertWord( String word )
	{
		int length = word.length();
		TrieNode crawl = root;

		for ( int level = 0; level < length; level++ )
		{
			HashMap<Character, TrieNode> child = crawl.getChildren();
			char ch = word.charAt( level );
			if ( child.get( ch ) == null )
			{
				TrieNode temp = new TrieNode( ch );
				child.put( ch, temp );
			}
			crawl = child.get( ch );
		}
		crawl.setbIsEnd( true );
	}

	public String getMatchingPrefix( String input )
	{
		String result = ""; // Initialize resultant string
		int length = input.length(); // Find length of the input string       

		// Initialize reference to traverse through Trie
		TrieNode crawl = root;

		// Iterate through all characters of input string 'str' and traverse
		// down the Trie
		int level, prevMatch = 0;
		for ( level = 0; level < length; level++ )
		{
			// Find current character of str
			char ch = input.charAt( level );

			// HashMap of current Trie node to traverse down
			HashMap<Character, TrieNode> child = crawl.getChildren();

			// See if there is a Trie edge for the current character
			if ( child.containsKey( ch ) )
			{
				result += ch; //Update result
				crawl = child.get( ch ); //Update crawl to move down in Trie

				// If this is end of a word, then update prevMatch
				if ( crawl.isbIsEnd() )
					prevMatch = level + 1;
			}
			else
				break;
		}

		// If the last processed character did not match end of a word,
		// return the previously matching prefix
		if ( !crawl.isbIsEnd() )
			return result.substring( 0, prevMatch );

		else
			return result;
	}
}

public class Test
{
	public static void main( String[] args )
	{
		Trie dict = new Trie();
		dict.insertWord( "abba" );
		dict.insertWord( "abs" );
		dict.insertWord( "cat" );
		dict.insertWord( "catch" );
		dict.insertWord( "abba" );

		String input = "abba";
		System.out.print( input + ":   " );
		System.out.println( dict.getMatchingPrefix( input ) );

		input = "absa";
		System.out.print( input + ":   " );
		System.out.println( dict.getMatchingPrefix( input ) );

		input = "cats";
		System.out.print( input + ":   " );
		System.out.println( dict.getMatchingPrefix( input ) );

		input = "xyz";
		System.out.print( input + ":   " );
		System.out.println( dict.getMatchingPrefix( input ) );
	}
}