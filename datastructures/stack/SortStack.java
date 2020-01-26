package com.datastructures.stack;

import java.util.Stack;

public class SortStack
{
	public static void main( String[] args )
	{
		Stack<Integer> stack = new Stack<>();
		stack.push( 34 );
		stack.push( 3 );
		stack.push( 31 );
		stack.push( 98 );
		stack.push( 92 );
		stack.push( 23 );

		Stack<Integer> sortedStack = sort( stack );
		while ( !sortedStack.isEmpty() )
			System.out.println( sortedStack.pop() );
	}

	private static Stack<Integer> sort( Stack<Integer> inputStack )
	{
		Stack<Integer> temp = new Stack<>();
		while ( !inputStack.isEmpty() )
		{
			int item = inputStack.pop();
			while ( !temp.isEmpty() && temp.peek() > item )
				inputStack.push( temp.pop() );

			temp.push( item );
		}

		return temp;
	}
}
