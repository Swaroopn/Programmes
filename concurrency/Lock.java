package concurrency;

public class Lock
{
	private boolean isLocked = false;
	private Thread lockedBy = null;
	private int count = 0;

	public synchronized void lock()
	{
		try
		{
			while ( isLocked && lockedBy != Thread.currentThread() )
				wait();
		}
		catch ( InterruptedException e )
		{
			e.printStackTrace();
		}

		isLocked = true;
		lockedBy = Thread.currentThread();
		count++;
	}

	public synchronized void unlock()
	{
		if ( Thread.currentThread() == lockedBy )
		{
			count--;

			if ( count == 0 )
			{
				isLocked = false;
				notify();
			}
		}
	}
}
