package com.datastructures.stack;

import java.util.Stack;

public class ReverseWords
{
	public static void main( String[] args )
	{
		String word = "Hello World";
		System.out.println( reverseWord( word ) );
	}

	private static String reverseWord( String word )
	{
		String revWord = "";
		Stack<Character> stack = new Stack<>();
		for ( int i = 0; i < word.length(); i++ )
		{
			char c = word.charAt( i );
			if ( c != ' ' )
				stack.push( c );
			else
			{
				while ( !stack.isEmpty() )
					revWord += stack.pop();
				revWord += " ";
			}
		}

		while ( !stack.isEmpty() )
			revWord += stack.pop();

		return revWord;
	}
}
