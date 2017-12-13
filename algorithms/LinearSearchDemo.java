package algorithm;

public class LinearSearchDemo
{
	private final int SIZE = 10;
	private int intArray[] = new int[SIZE];
	
	public LinearSearchDemo( int[] intArray )
	{
		this.intArray = intArray;
	}
	
	public void search( int item )
	{
		for ( int i = 0; i < SIZE; i++ )
		{
			if ( this.intArray[i] == item )
			{
				System.out.println( "Item Found" );
				return;
			}
		}
		System.out.println( "Item Not Found!!!" );
	}

	public static void main( String[] args )
	{
		int intArray[] = new int[]
		{ 11, 46, 78, 94, 23, 60, 22, 92, 25, 61 };
		LinearSearchDemo lsd = new LinearSearchDemo( intArray );
		lsd.search( 92 );

	}

}
