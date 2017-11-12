package com.interview.threads;

class MyThread22 extends Thread
{
	@Override
	public void run()
	{
		for ( int i = 0; i < 5; i++ )
		{
			System.out.println( "hi" );
			try
			{
				Thread.sleep( 1000 );
			}
			catch ( InterruptedException e )
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class CATech
{

	public static void main( String[] args )
	{
		MyThread22 t = new MyThread22();
		t.start();
		for ( int i = 0; i < 5; i++ )
			System.out.println( "Done" );
	}

}
