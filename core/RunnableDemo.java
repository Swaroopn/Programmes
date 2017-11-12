package com.interview.core;

public class RunnableDemo implements Runnable
{

	@Override
	public void run()
	{
		System.out.println( "I'm Runninnnnnnn....." );
	}

	public static void main( String[] args )
	{
		Thread t = new Thread( new RunnableDemo() );
		t.start();
		System.out.println( Thread.currentThread().getName() );
	}
}
