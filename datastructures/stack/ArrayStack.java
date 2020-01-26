package com.datastructures.stack;

import java.util.EmptyStackException;

public class ArrayStack
{
	private int[] stack;
	private int top; // points to next available position
	private static int DEFAULT_STACK_SIZE = 10;

	public ArrayStack()
	{
		this( DEFAULT_STACK_SIZE );
	}

	public ArrayStack( int capacity )
	{
		this.stack = new int[capacity];
	}

	public boolean isFull()
	{
		return top == stack.length;
	}

	public boolean isEmpty()
	{
		return top == 0;
	}

	public void push( int data )
	{
		if ( isFull() )
		{
			System.out.println( "Stack Overflow!!!" );
			return;
		}

		stack[top++] = data;
	}

	public int pop()
	{
		if ( isEmpty() )
			throw new EmptyStackException();

		return stack[--top];
	}

	public int peek()
	{
		if ( isEmpty() )
			throw new EmptyStackException();

		return stack[top - 1];
	}

	public void printStack()
	{
		for ( int i = top - 1; i >= 0; i-- )
			System.out.println( stack[i] );
	}
}
