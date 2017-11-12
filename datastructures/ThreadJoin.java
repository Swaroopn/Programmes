package com.interview.datastructures;

class MyThread2 extends Thread
{

	@Override
	public void run()
	{
		try
		{
			System.out.println( Thread.currentThread().getName() + " executing" );
			Thread.sleep( 4000 );
		}
		catch ( InterruptedException e )
		{
			e.printStackTrace();
		}
	}

}

public class ThreadJoin
{
	public static void main( String[] args )
	{
		MyThread2 t = new MyThread2();
		t.start();
		try
		{
			t.join();
		}
		catch ( InterruptedException e )
		{
			e.printStackTrace();
		}

		System.out.println( "Main finished after child execution" );
	}
}
