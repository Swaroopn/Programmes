package interview;

public class OddEvenSeparate
{

	public static void main( String[] args )
	{
		int arr[] =
		{ 12, 34, 45, 9, 8, 90, 3 };
		separateOddEven( arr );
		for ( int i = 0; i < arr.length; i++ )
			System.out.print( arr[i] + " " );
	}

	private static void separateOddEven( int[] arr )
	{
		int left = 0;
		int right = arr.length - 1;

		while ( left < right )
		{
			while ( arr[left] % 2 == 0 )
				left++;

			while ( arr[right] % 2 == 1 )
				right--;

			if ( left < right )
			{
				swap( arr, left, right );
				right++;
				left--;
			}
		}
	}

	private static void swap( int[] arr, int left, int right )
	{
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}

}
