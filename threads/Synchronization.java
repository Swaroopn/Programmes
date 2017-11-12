package com.interview.threads;

class Display
{

	public void wish( String name )
	{
		for ( int i = 0; i < 10; i++ )
			System.out.println( name );
	}

}

class MyThread extends Thread
{
	Display d = null;
	String name = null;

	public MyThread( Display d, String name )
	{
		this.d = d;
		this.name = name;
	}

	@Override
	public void run()
	{
		d.wish( this.name );
	}
}

public class Synchronization
{

	public static void main( String[] args )
	{
		Display d = new Display();

		MyThread t1 = new MyThread( d, "Dhoni" );
		MyThread t2 = new MyThread( d, "Yuvi" );

		t1.start();
		t2.start();
	}

}
