package com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class MinStack
{
	public static void main( String[] args ) throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int inputs = Integer.parseInt( br.readLine() );
		for ( int i = 0; i < inputs; i++ )
		{
			br.readLine();
			String input = br.readLine();

			findMinEle( input.split( "[\\s]+" ) );
		}

		br.close();
	}

	private static void findMinEle( String[] input )
	{
		int min = Integer.MAX_VALUE;
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> minStack = new Stack<>();

		for ( int i = 0; i < input.length; )
		{
			int op = Integer.parseInt( input[i] );
			if ( 1 == op )
			{
				int item = Integer.parseInt( input[i + 1] );

				stack.push( item );
				if ( item <= min )
				{
					min = item;
					minStack.push( min );
				}
				i = i + 2;
			}
			else if ( 2 == op )
			{
				if ( stack.isEmpty() )
					System.out.print( "-1 " );
				else
				{
					int poppedItem = stack.pop();
					System.out.print( poppedItem + " " );
					if ( minStack.peek() == poppedItem )
						minStack.pop();
				}
				i++;
			}
			else if ( 3 == op )
			{
				if ( stack.isEmpty() )
					System.out.print( "-1 " );
				else
					System.out.print( minStack.peek() + " " );
				i++;
			}
		}
	}

}
