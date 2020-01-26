package com.datastructures.stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class AuxiliaryStack
{
	Stack<Integer> mainStack = new Stack<>();
	Stack<Integer> auxStack = new Stack<>();

	public void push( int data )
	{
		if ( mainStack.isEmpty() )
		{
			mainStack.push( data );
			auxStack.push( data );
		}
		else
		{
			mainStack.push( data );
			int tempTop = auxStack.peek();
			if ( data < tempTop )
				auxStack.push( data );
			else
				auxStack.push( tempTop );
		}
	}

	public int pop()
	{
		if ( mainStack.isEmpty() )
			throw new EmptyStackException();

		int item = mainStack.pop();
		auxStack.pop();

		return item;
	}

	public int getMin()
	{
		return auxStack.peek();
	}

	public static void main( String[] args )
	{
		AuxiliaryStack mainStack = new AuxiliaryStack();
		mainStack.push( 10 );
		mainStack.push( 20 );
		mainStack.push( 5 );
		mainStack.push( 12 );
		mainStack.push( 29 );
		mainStack.push( 3 );
		mainStack.push( 55 );

		System.out.println( mainStack.getMin() );
		System.out.println( mainStack.pop() );
		System.out.println( mainStack.getMin() );
		System.out.println( mainStack.pop() );
		System.out.println( mainStack.getMin() );
		System.out.println( mainStack.pop() );
		System.out.println( mainStack.getMin() );
		System.out.println( mainStack.pop() );
		System.out.println( mainStack.getMin() );
		System.out.println( mainStack.pop() );
		System.out.println( mainStack.getMin() );
		System.out.println( mainStack.pop() );
		System.out.println( mainStack.getMin() );
		System.out.println( mainStack.pop() );
	}

}
