package com.interview.core;

class MyThreadDaemon extends Thread
{
	@Override
	public void run()
	{
		for ( int i = 0; i < 5; i++ )
		{
			System.out.println( i );
			try
			{
				Thread.sleep( 1000 );
			}
			catch ( InterruptedException e )
			{
				e.printStackTrace();
			}
		}
	}
}

public class DaemonThread
{
	public static void main( String[] args )
	{
		MyThreadDaemon t = new MyThreadDaemon();
		//t.setDaemon( true );
		t.start();
		t.stop();
		t.destroy();
		System.out.println( "Thread exiting..." );
	}
}
