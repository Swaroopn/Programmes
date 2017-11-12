package com.interview.core;

public class ThreadDemo extends Thread
{
	public void run()
	{
		for ( int i = 0; i < 10; i++ )
			System.out.println( i );
	}

	public static void main( String[] args )
	{
		ThreadDemo t = new ThreadDemo();
		t.start();
		
		for ( int i = 10; i < 20; i++ )
			System.out.println( i );
	}
}
