package datastructures;

public class ThreadLocalDemo
{

	public static void main( String[] args )
	{

		ThreadLocal tl = new ThreadLocal()
		{
			@Override
			protected Object initialValue()
			{
				return "NULl";
			}
		};
		System.out.println( tl.get() );
		tl.set( "swaroop" );
		System.out.println( tl.get() );
		tl.remove();
		System.out.println( tl.get() );
		
	}

}
