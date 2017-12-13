package datastructures;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo
{
	public static void main( String[] args ) throws InterruptedException
	{
		CountDownLatch latch = new CountDownLatch( 4 );
		WorkerThread first = new WorkerThread( "A", latch, 1000 );
		WorkerThread second = new WorkerThread( "B", latch, 2000 );
		WorkerThread third = new WorkerThread( "C", latch, 3000 );
		WorkerThread fourth = new WorkerThread( "D", latch, 4000 );

		first.start();
		second.start();
		third.start();
		fourth.start();

		latch.await();

		System.out.println( Thread.currentThread().getName() + " finished execution" );
	}
}

class WorkerThread extends Thread
{
	private CountDownLatch latch;
	private int delay;

	public WorkerThread( String threadName, CountDownLatch latch, int delay )
	{
		super( threadName );
		this.delay = delay;
		this.latch = latch;
	}

	@Override
	public void run()
	{
		try
		{
			Thread.sleep( this.delay );
			this.latch.countDown();
			System.out.println( "Thread " + Thread.currentThread().getName() + " finished execution" );
		}
		catch ( InterruptedException e )
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
