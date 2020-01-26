package com.interview;

import java.util.Scanner;
import java.util.Stack;

public class PalindromicArray
{
	public static void main( String[] args )
	{
		Scanner scan = new Scanner( System.in );
		int input = Integer.parseInt( scan.nextLine() );
		for ( int i = 0; i < input; i++ )
		{
			String pattern = scan.nextLine();
			patternToNumSequence( pattern );
		}
		scan.close();
	}

	private static void patternToNumSequence( String pattern )
	{
		String seq = "";
		Stack<Integer> stack = new Stack<>();

		for ( int i = 0; i <= pattern.length(); i++ )
		{
			stack.push( i + 1 );

			if ( i == pattern.length() || pattern.charAt( i ) == 'I' )
			{
				while ( !stack.isEmpty() )
				{
					seq += String.valueOf( stack.pop() );
				}
			}
		}

		System.out.println( seq );
	}

}
