package com.datastructures.stack;

import java.util.LinkedList;

public class BalancedBrackets
{
	static int count = 0;

	public static void main( String[] args )
	{
		String s = "()())";
		if ( isBalanced( s ) )
			System.out.println( "YES" );
		else
			System.out.println( "NO" );

		System.out.println( "Longest valid substring: " + count * 2 );
	}

	private static boolean isBalanced( String s )
	{
		LinkedList<Character> stack = new LinkedList<>();

		for ( int i = 0; i < s.length(); i++ )
		{
			char c = s.charAt( i );

			if ( c == '(' || c == '{' || c == '[' )
				stack.push( c );
			else
			{
				if ( stack.isEmpty() )
					return false;

				char poppedChar = stack.pop();
				if ( ( poppedChar == '(' && c != ')' ) || ( poppedChar == '[' && c != ']' ) || ( poppedChar == '{' && c != '}' ) )
					return false;
				else
					count++;
			}
		}

		return stack.isEmpty();
	}

}
