package com.interview.core;

class ThreadB extends Thread
{
	public int total = 0;

	public void run()
	{
		synchronized (this)
		{
			
			for ( int i = 0; i < 1000000; i++ )
				total += i;
			this.notify();
		}
	}
}

public class WaitNotify
{
	public static void main( String[] args ) throws InterruptedException
	{
		ThreadB t = new ThreadB();
		t.start();
		synchronized (t)
		{
			t.wait();
		}
		System.out.println( t.total );
	}
}
