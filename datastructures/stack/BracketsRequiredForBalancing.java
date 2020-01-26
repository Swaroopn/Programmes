package com.datastructures.stack;

import java.util.Stack;

public class BracketsRequiredForBalancing
{
	public static void main( String[] args )
	{
		System.out.println( findNumOfBracketsRequired( "{{}}}{" ) );
	}

	private static int findNumOfBracketsRequired( String string )
	{
		Stack<Character> stack = new Stack<>();
		for ( int i = 0; i < string.length(); i++ )
		{
			char c = string.charAt( i );
			if ( c == '{' )
				stack.push( c );
			else if ( c == '}' )
			{
				if ( !stack.isEmpty() && stack.peek() == '{' )
					stack.pop();
				else
					stack.push( c );
			}
		}

		int open = 0;
		int totalLen = stack.size();
		while ( !stack.isEmpty() )
		{
			char c = stack.pop();
			if ( c == '{' )
				open++;
		}

		// return ceil(m/2) + ceil(n/2) which is 
		// actually equal to (m+n)/2 + n%2 when 
		// m+n is even
		return totalLen / 2 + open % 2;
	}
}
