package com.interview.datastructures;

public class Sample extends Thread
{
	private static Thread mt;

	public static void main( String[] args ) throws InterruptedException
	{
		Sample.mt = Thread.currentThread();
		Sample t = new Sample();
		t.start();
		t.join();
		Thread.sleep( 2000 );
		System.out.println( "Main Thread" );
	}

	@Override
	public void run()
	{
		try
		{
			this.mt.join();
			System.out.println( "Child Thread" );
		}
		catch ( InterruptedException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
