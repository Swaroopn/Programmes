package datastructures;

import java.util.LinkedList;

public class ProducerConsumer
{
	private LinkedList<Integer> list;
	private int capacity;

	public ProducerConsumer( int capacity )
	{
		this.list = new LinkedList<Integer>();
		this.capacity = capacity;
	}

	public void produce() throws InterruptedException
	{
		int value = 0;
		while ( true )
		{
			synchronized (this)
			{
				while ( this.list.size() == this.capacity )
					wait();

				System.out.println( "Produced Value:" + ++value );
				this.list.add( value );
				notify();
				Thread.sleep( 1000 );
			}
		}
	}

	public void consume() throws InterruptedException
	{
		while ( true )
		{
			synchronized (this)
			{
				while ( this.list.size() == 0 )
					wait();

				int value = this.list.removeFirst(); //this.list.remove() is also same
				System.out.println( "Consumed Value:" + value );
				notify();
				Thread.sleep( 1000 );
			}
		}
	}

	public static void main( String[] args )
	{
		ProducerConsumer p = new ProducerConsumer( 5 );
		new Thread( () -> {
			try
			{
				p.produce();
			}
			catch ( InterruptedException e )
			{
				e.printStackTrace();
			}
		} ).start();

		new Thread( () -> {
			try
			{
				p.consume();
			}
			catch ( InterruptedException e )
			{
				e.printStackTrace();
			}
		} ).start();
	}
}
