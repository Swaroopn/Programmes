package com.interview;

import java.util.Stack;

public class BalancedParentheses
{
	public static void main( String[] args )
	{
		String expr = "{([])}";
		System.out.println( isBalanced( expr ) );
	}

	private static boolean isBalanced( String expr )
	{
		char symbol;
		Stack<Character> stack = new Stack<>();
		
		for ( int i = 0; i < expr.length(); i++ )
		{
			symbol = expr.charAt( i );
			if ( Character.isLetter( symbol ) )
			{
				continue;
			}
			else if ( ( symbol == '(' ) || ( symbol == '[' ) || ( symbol == '{' ) )
			{
				stack.push( symbol );
			}
			else
			{
				char popped = stack.pop();
				if ( ( symbol == ')' && popped != '(' ) || ( symbol == ']' && popped != '[' ) || ( symbol == '}' && popped != '{' ) )
					return false;
			}
		}

		if ( !stack.isEmpty() )
			return false;

		return true;
	}
}
