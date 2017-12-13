package concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class BCRPlanReaderThread implements Callable<Boolean>
{
	private String threadName;

	public BCRPlanReaderThread( String name )
	{
		this.threadName = name;
	}

	@Override
	public Boolean call() throws Exception
	{
		System.out.println( this.threadName + " completed execution" );
		return true;
	}

}

public class ExecutorServiceDemo
{
	public static void main( String[] args ) throws InterruptedException
	{
		int readerThreads = 3;

		ExecutorService readerService = Executors.newFixedThreadPool( readerThreads );
		CompletionService<Boolean> readerCompletionService = new ExecutorCompletionService<>( readerService );

		for ( int i = 0; i < readerThreads; i++ )
		{
			BCRPlanReaderThread thread = new BCRPlanReaderThread( "thread" + i );
			readerCompletionService.submit( thread );
			Thread.sleep( 1000 );
		}

		for ( int i = 0; i < readerThreads; i++ )
		{
			try
			{
				Future<Boolean> future = readerCompletionService.take();
				future.get();

			}
			catch ( InterruptedException e )
			{
				e.printStackTrace();
			}
			catch ( ExecutionException e )
			{
				e.printStackTrace();
			}
		}

		readerService.shutdown();

	}

}
