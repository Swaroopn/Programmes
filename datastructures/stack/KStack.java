package com.datastructures.stack;

public class KStack
{
	private int stack[];
	private int top[];
	private int next[];

	private int n, k, free;

	public KStack( int k, int N )
	{
		this.n = N;
		this.k = k;

		this.stack = new int[N];
		this.top = new int[k];
		this.next = new int[N];

		for ( int i = 0; i < k; i++ )
			top[i] = -1;

		for ( int i = 0; i < n - 1; i++ )
			next[i] = i + 1;
		next[n - 1] = -1;
	}

	public boolean isFull()
	{
		return free == -1;
	}

	public boolean isEmpty( int k )
	{
		return top[k] == -1;
	}

	public void push( int item, int k )
	{
		if ( isFull() )
		{
			System.out.println( "Stack Overflow!!!" );
			return;
		}

		int i = free;
		free = next[i];
		next[i] = top[k];
		top[k] = i;

		stack[i] = item;
	}

	public int pop( int k )
	{
		if ( isEmpty( k ) )
		{
			System.out.println( "Stack Underflow!!!" );
			return -1;
		}

		int i = top[k];
		top[k] = next[i];
		next[i] = free;
		free = i;
		return stack[i];
	}

	public static void main( String[] args )
	{
		KStack stack = new KStack( 3, 10 );
		stack.push( 1, 0 );
		stack.push( 2, 1 );
		stack.push( 3, 2 );

		stack.pop( 0 );
		stack.push( 31, 2 );
	}
}
