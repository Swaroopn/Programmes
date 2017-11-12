package com.interview.threads;

public class Dummy extends Thread
{
	@Override
	public void run()
	{
		Thread.yield();
		System.out.println( Thread.currentThread().getName() );
	}

	public static void main( String[] args )
	{
		System.out.println( Thread.currentThread().getName() );
		Dummy d = new Dummy();
		d.start();
	}
}
