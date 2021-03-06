package algorithm;

public class SelectionSortDemo
{
	public static void main( String[] args )
	{
		int arr[] =
		{ 5, 3, 7, 10, 2, 1, 6, 9 };
		selectionSort( arr );
		for ( int i = 0; i < arr.length; i++ )
			System.out.print( arr[i] + " " );
	}

	private static void selectionSort( int[] arr )
	{
		for ( int i = 0; i < arr.length - 1; i++ )
		{
			int min = i;
			for ( int j = i + 1; j < arr.length; j++ )
			{
				if ( arr[j] < arr[min] )
					min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
