package com.interview.datastructures;

class MyThread3 extends Thread
{
	public static Thread mainThread;

	@Override
	public void run()
	{
		try
		{
			mainThread.join();
		}
		catch ( InterruptedException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println( "Child Thread Completed" );
	}

}

public class ChildThreadSleep
{
	public static void main( String[] args )
	{
		System.out.println( "Main executing..." );
		MyThread3.mainThread = Thread.currentThread();
		MyThread3 t = new MyThread3();
		t.start();
		try
		{
			Thread.sleep( 3000 );
		}
		catch ( InterruptedException e )
		{
			e.printStackTrace();
		}
		System.out.println( "Main Thread Completed" );

	}
}
