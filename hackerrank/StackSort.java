package com.interview.hackerrank;

import java.util.Stack;

import com.interview.algorithms.InsertionSortDemo;

public class StackSort
{
	public static void main( String[] args )
	{
		Stack<Integer> stack = new Stack<Integer>();
		stack.push( 5 );
		stack.push( 1 );
		stack.push( 6 );
		stack.push( 4 );
		stack.push( 7 );
		stack.push( 3 );
		stack.push( 2 );

		Object[] arr = stack.toArray();
		int[] temp = new int[arr.length];
		for ( int i = 0; i < arr.length; i++ )
			temp[i] = ( int ) arr[i];

		InsertionSortDemo.insertionSort( temp );

	}
}
