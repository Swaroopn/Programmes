package concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable
{
	protected BlockingQueue<String> queue = null;

	public Producer( BlockingQueue<String> queue )
	{
		this.queue = queue;
	}

	@Override
	public void run()
	{
		try
		{
			queue.put( "1" );
			Thread.sleep( 100 );
			queue.put( "2" );
			Thread.sleep( 100 );
			queue.put( "3" );
			Thread.sleep( 100 );
			queue.put( "POISON_PILL" );
		}
		catch ( InterruptedException e )
		{
			e.printStackTrace();
		}

	}

}

class Consumer implements Runnable
{
	protected BlockingQueue<String> queue = null;

	public Consumer( BlockingQueue<String> queue )
	{
		this.queue = queue;
	}

	@Override
	public void run()
	{
		try
		{
			while ( true )
			{
				String value = queue.take();
				if ( value.equals( "POISON_PILL" ) )
					return;
				else
					System.out.println( value );
			}
		}
		catch ( InterruptedException e )
		{
			e.printStackTrace();
		}
	}

}

public class BlockingQueueDemo
{
	public static void main( String[] args ) throws InterruptedException
	{
		BlockingQueue<String> queue = new ArrayBlockingQueue<>( 1024 );

		Producer producer = new Producer( queue );
		Consumer consumer = new Consumer( queue );

		new Thread( producer ).start();
		new Thread( consumer ).start();

		Thread.sleep( 4000 );
	}
}
