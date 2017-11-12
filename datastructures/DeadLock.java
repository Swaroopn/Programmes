package com.interview.datastructures;

public class DeadLock extends Thread
{
	private static Thread mainThread;

	public static void main( String[] args )
	{
		DeadLock.mainThread = Thread.currentThread();

		DeadLock t1 = new DeadLock();
		t1.start();
		try
		{
			t1.join();
		}
		catch ( InterruptedException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run()
	{
		try
		{
			this.mainThread.join();
		}
		catch ( InterruptedException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
