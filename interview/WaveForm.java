package interview;

public class WaveForm
{
	public static void main( String[] args )
	{
		int[] arr =
		{ 1, 2, 3, 4, 5, 6, 7 };

		waveForm( arr );
		for ( int i = 0; i < arr.length; i++ )
			System.out.print( arr[i] + " " );
	}

	private static void waveForm( int[] arr )
	{
		for ( int i = 0; i < arr.length; i = i + 2 )
		{
			if ( i > 0 && arr[i - 1] < arr[i] )
				swap( arr, i - 1, i );

			if ( i < arr.length - 1 && arr[i] > arr[i + 1] )
				swap( arr, i, i + 1 );
		}
	}

	private static void swap( int[] arr, int i, int j )
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
