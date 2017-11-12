package com.interview.datastructures;

public class DeadLock2 extends Thread
{

	public static void main( String[] args )
	{
		try
		{
			Thread.currentThread().join();
		}
		catch ( InterruptedException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
