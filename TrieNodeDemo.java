package com.subex.rocps.web.app;

import java.util.HashMap;
import java.util.Map;

class TrieNode
{
	char c;
	Map<Character, TrieNode> children = new HashMap<>();
	boolean isLeaf;

	public TrieNode()
	{
	}

	public TrieNode( char c )
	{
		this.c = c;
	}
}

class Trie
{
	private TrieNode root;

	public Trie()
	{
		this.root = new TrieNode();
	}

	public void insert( String word )
	{
		Map<Character, TrieNode> children = this.root.children;

		for ( int i = 0; i < word.length(); i++ )
		{
			TrieNode t;
			char currentChar = word.charAt( i );
			if ( children.containsKey( currentChar ) )
				t = children.get( currentChar );
			else
			{
				t = new TrieNode( currentChar );
				children.put( currentChar, t );
			}

			children = t.children;

			if ( i == word.length() - 1 )
				t.isLeaf = true;
		}
	}

	public boolean search( String word )
	{
		TrieNode t = searchNode( word );
		if ( t != null && t.isLeaf )
			return true;
		else
			return false;
	}

	private TrieNode searchNode( String word )
	{
		Map<Character, TrieNode> children = this.root.children;
		TrieNode t = null;
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

public class TrieNodeDemo
{
	public static void main( String[] args )
	{
		Trie t = new Trie();
		t.insert( "abc" );
		t.insert( "abcd" );
		t.insert( "abd" );
		t.insert( "ab" );
		t.insert( "def" );

		if ( t.search( "abd" ) )
			System.out.println( "abd is present in Trie" );
		else
			System.out.println( "abd is not present in Trie" );

		if ( t.search( "abe" ) )
			System.out.println( "ab is present in Trie" );
		else
			System.out.println( "abe is not present in Trie" );

		if ( t.containsPrefix( "a" ) )
			System.out.println( "prefix 'a' is present in Trie" );
		else
			System.out.println( "prefix 'a' is not present in Trie" );

		if ( t.containsPrefix( "z" ) )
			System.out.println( "prefix 'z' is present in Trie" );
		else
			System.out.println( "prefix 'z' is not present in Trie" );
	}
}
