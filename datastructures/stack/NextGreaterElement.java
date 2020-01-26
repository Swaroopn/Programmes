package com.datastructures.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class NextGreaterElement
{
	public static void main( String[] args ) throws IOException
	{
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int inputs = Integer.parseInt( br.readLine() );
		for ( int i = 0; i < inputs; i++ )
		{
			br.readLine();
			String[] input = br.readLine().split( "[\\s]+" );
			int[] arr = new int[input.length];
			for ( int j = 0; j < input.length; j++ )
				arr[j] = Integer.parseInt( input[j] );
			printNGE( arr );
		}

		br.close();
	}

	private static void printNGE( int[] input )
	{
		Stack<Integer> stack = new Stack<>();
		String str = "";
		for ( int i = input.length - 1; i >= 0; i-- )
		{
			int cur = input[i];
			while ( !stack.isEmpty() && cur >= stack.peek() )
				stack.pop();

			str = ( stack.isEmpty() ? "-1" : stack.peek() ) + " " + str;
			stack.push( cur );
		}

		System.out.println( str );
	}

}
