package com.interview.threads;

public class DeadLock
{
	public static void main( String[] args )
	{
		new Thread( new Runnable()
		{

			@Override
			public void run()
			{
				synchronized (String.class)
				{
					System.out.println( "T1 acquired String.class" );
					synchronized (Object.class)
					{
						System.out.println( "T1 acquired Object.class" );
					}
				}
			}

		} ).start();

		new Thread( new Runnable()
		{

			@Override
			public void run()
			{
				synchronized (Object.class)
				{
					System.out.println( "T2 acquired Object.class" );
					synchronized (String.class)
					{
						System.out.println( "T1 acquired String.class" );
					}
				}
			}

		} ).start();
	}
}
