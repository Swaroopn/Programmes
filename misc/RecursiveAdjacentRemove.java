package com.interview;

import java.util.Scanner;
import java.util.Stack;

public class RecursiveAdjacentRemove
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int test = Integer.parseInt( sc.nextLine() );
		while ( test-- > 0 )
		{
			String str = sc.nextLine();
			System.out.println( removeAdjacentDuplicate( str ) );
		}
		sc.close();
	}

	public static String removeAdjacentDuplicate( String str )
	{
		if ( str.isEmpty() )
			return "";

		int i;
		int n = str.length();

		Stack<Character> s = new Stack<>();
		for ( i = 0; i < n; i++ )
			s.push( str.charAt( i ) );

		str = "";
		boolean flag = false;
		char ch = s.pop();
		int key = 0; // to check if we need to check the answer again
		while ( !s.isEmpty() )
		{
			if ( s.peek() == ch )
			{
				flag = true;
				key = 1;
			}
			else
			{
				if ( !flag )
					str += ch;
				ch = s.peek();
				flag = false;
			}

			s.pop();
		}

		if ( !flag )
			str += ch;

		StringBuilder ss = new StringBuilder( str );
		ss = ss.reverse();
		str = ss.toString();

		if ( key == 1 )
			str = removeAdjacentDuplicate( str );

		return str;
	}

}
