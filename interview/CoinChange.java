package interview;

import java.util.Arrays;

public class CoinChange
{
	public static void main( String[] args )
	{
		int[] arr =
		{ 1, 4, 2, 59 };
		int count = 60;
		System.out.println( countWays( arr, count ) );
	}

	private static long countWays( int[] arr, int count )
	{
		int len = arr.length;
		long[] table = new long[count + 1];
		Arrays.fill( table, 0 );

		table[0] = 1;

		for ( int i = 0; i < len; i++ )
		{
			for ( int j = arr[i]; j <= count; j++ )
			{
				table[j] += table[j - arr[i]];
			}
		}

		return table[count];
	}
}
