package com.interview.threads;

import java.util.concurrent.Semaphore;

public class ThreadEvenOdd implements Runnable
{
	private int count;
	private boolean isEven;
	static Semaphore s = new Semaphore( 1 );
	static Semaphore t = new Semaphore( 0 );

	ThreadEvenOdd( boolean flag, int c )
	{
		isEven = flag;
		count = c;
	}

	@Override
	public void run()
	{
		if ( isEven )
		{
			try
			{
				printEven( count );
			}
			catch ( InterruptedException e )
			{
				e.printStackTrace();
			}
		}
		else
		{
			try
			{
				printOdd( count );
			}
			catch ( InterruptedException e )
			{
				e.printStackTrace();
			}
		}
	}

	private void printOdd( int count ) throws InterruptedException
	{
		int c = 1;
		for ( int i = 0; i < count / 2; i++ )
		{

			s.acquire( 1 );
			System.out.println( c );
			Thread.sleep( 400 );
			c = c + 2;
			t.release( 1 );

		}

	}

	private void printEven( int count ) throws InterruptedException
	{
		int c = 2;
		for ( int i = 0; i < count / 2; i++ )
		{

			t.acquire( 1 );
			System.out.println( c );
			Thread.sleep( 400 );
			c = c + 2;
			s.release( 1 );
		}

	}

	public static void main( String[] args )
	{
		Thread a = new Thread( new ThreadEvenOdd( true, 10 ) );
		Thread b = new Thread( new ThreadEvenOdd( false, 10 ) );
		
		a.start();
		b.start();
	}

}
