package com.interview.datastructures;

import java.util.concurrent.Semaphore;

class Shared
{
	static int count = 0;
}

public class MyThread extends Thread
{
	Semaphore sem;
	String threadName;

	public MyThread( Semaphore sem, String threadName )
	{
		super( threadName );
		this.sem = sem;
		this.threadName = threadName;
	}

	@Override
	public void run()
	{
		System.out.println( "Starting " + this.threadName );
		System.out.println( this.threadName + " is waiting for a Permit" );

		try
		{
			sem.acquire();
			System.out.println( this.threadName + " gets a permit" );
			for ( int i = 0; i < 5; i++ )
			{
				Shared.count++;
				System.out.println( this.threadName + " : " + Shared.count );

				Thread.sleep( 1000 );
			}
		}
		catch ( InterruptedException e )
		{
			e.printStackTrace();
		}

		System.out.println( this.threadName + " releases permit" );
		sem.release();
	}
}
