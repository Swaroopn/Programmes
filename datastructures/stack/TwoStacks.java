package com.datastructures.stack;

public class TwoStacks
{
	private int[] stack;

	private int top1, top2;

	public TwoStacks( int capacity )
	{
		this.stack = new int[capacity];
		top1 = -1;
		top2 = stack.length;
	}

	public void pushFront( int data )
	{
		if ( top1 < top2 - 1 )
			stack[++top1] = data;
		else
			System.out.println( "Cannot insert from Front!!!" );
	}

	public int popFront()
	{
		if ( top1 < 0 )
		{
			System.out.println( "Front underflow!!!" );
			return -1;
		}

		return stack[top1--];
	}

	public void pushBack( int data )
	{
		if ( top2 > ( top1 + 1 ) )
			stack[--top2] = data;
		else
			System.out.println( "Cannot insert from Back!!!" );
	}

	public int popBack()
	{
		if ( top2 >= stack.length )
		{
			System.out.println( "Back underflow!!!" );
			return -1;
		}

		return stack[top2++];
	}

	public static void main( String[] args )
	{
		TwoStacks stack = new TwoStacks( 10 );
		stack.pushFront( 10 );
		stack.pushFront( 20 );
		stack.pushFront( 30 );

		stack.pushBack( -10 );
		stack.pushBack( -20 );
		stack.pushBack( -30 );
		stack.pushBack( -40 );
		stack.pushBack( -50 );
		stack.pushBack( -60 );
		stack.pushBack( -70 );

		stack.pushBack( -80 );
		stack.pushFront( 40 );

		stack.popFront();
		stack.popFront();
		stack.popFront();
		stack.popFront();

		stack.popBack();
		stack.popBack();
		stack.popBack();
		stack.popBack();
		stack.popBack();
		stack.popBack();
		stack.popBack();
		stack.popBack();
	}
}
