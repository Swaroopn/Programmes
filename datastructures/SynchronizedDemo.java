package datastructures;

class Display
{
	public synchronized void display( String name )
	{
		for ( int i = 0; i < 5; i++ )
		{
			System.out.println( name );
			try
			{
				Thread.sleep( 500 );
			}
			catch ( InterruptedException e )
			{
				e.printStackTrace();
			}
		}
	}
}

class MyThreadS extends Thread
{
	private Display d;
	private String name;

	public MyThreadS( Display d, String name )
	{
		this.d = d;
		this.name = name;
	}

	@Override
	public void run()
	{
		d.display( name );
	}

}

public class SynchronizedDemo
{
	public static void main( String[] args )
	{
		Display d = new Display();
		MyThreadS dhoni = new MyThreadS( d, "Dhoni" );
		MyThreadS yuvraj = new MyThreadS( d, "Yuvraj" );

		dhoni.start();
		yuvraj.start();
	}

}
