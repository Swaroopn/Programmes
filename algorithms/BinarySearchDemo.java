package algorithm;

public class BinarySearchDemo
{
	private final int SIZE = 10;
	private int intArray[] = new int[SIZE];

	public BinarySearchDemo( int[] arr )
	{
		this.intArray = arr;
	}

	private void search( int item, int low, int high )
	{
		int mid;

		while ( low <= high )
		{
			mid = low + ( high - low ) / 2;
			if ( item == this.intArray[mid] )
			{
				System.out.println( "Item Found" );
				return;
			}
			else if ( item < this.intArray[mid] )
				high = mid - 1;
			else
				low = mid + 1;
		}
		
		System.out.println( "Item not found" );
	}

	private void recursiveSearch( int item, int low, int high )
	{
		if ( high < low )
		{
			System.out.println( "Item Not found!!!" );
			return;
		}
		int mid = low + ( high - low ) / 2;
		if ( this.intArray[mid] > item )
			recursiveSearch( item, low, mid - 1 );
		else if ( this.intArray[mid] < item )
			recursiveSearch( item, mid + 1, high );
		else
		{
			System.out.println( "Item found" );
			return;
		}

	}

	public static void main( String[] args )
	{
		int intArray[] = new int[]
		{ 1, 3, 5, 12, 34, 56, 59, 68, 77, 83, 91, 100 };
		BinarySearchDemo bsd = new BinarySearchDemo( intArray );
		bsd.search( 50, 0, intArray.length - 1 );
		bsd.recursiveSearch( 1, 0, intArray.length - 1 );
	}

}
