package com.datastructures.stack;

public class StackDemo
{
	public static void main( String[] args )
	{
		ArrayStack stack = new ArrayStack();
		stack.push( 1 );
		stack.push( 2 );
		stack.push( 3 );
		stack.push( 4 );
		stack.printStack();
		System.out.println( stack.peek() );
		System.out.println( stack.pop() );
		System.out.println( stack.pop() );
		stack.printStack();
	}
}
