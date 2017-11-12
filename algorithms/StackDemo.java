package com.interview.algorithms;

import java.util.Stack;

public class StackDemo
{
	public static void main( String[] args )
	{
		Stack<Integer> si = new Stack<Integer>();
		System.out.println( si.add( 10 ) );
		 si.add( 20 ); 
		 si.add( 30 ); 
		 si.add( 40 ); 
		 si.add( 50 ); 
		System.out.println( si.search( 40 ) );
	}
}
