package interview;

import java.util.HashMap;
import java.util.Map;

public class ArrayDegreeReturnSubArray
{

	public static void main( String[] args )
	{
		int[] arr =
		{ 1, 2, 2, 3, 4 };

		System.out.println( getSmallestSubArrLen( arr ) );
	}

	private static int getSmallestSubArrLen( int[] arr )
	{
		int max = 0;
		Map<Integer, Integer> mapCount = new HashMap<>();
		Map<Integer, Integer> startIndex = new HashMap<>();
		Map<Integer, Integer> endIndex = new HashMap<>();

		for ( int i = 0; i < arr.length; i++ )
		{
			int value = arr[i];
			if ( mapCount.get( value ) != null )
			{
				mapCount.put( value, mapCount.get( value ) + 1 );
			}
			else
			{
				startIndex.put( value, i );
				mapCount.put( value, 1 );
			}

			endIndex.put( value, i );

			max = Integer.max( mapCount.get( value ), max );
		}

		int result = arr.length;
		for ( Integer item : mapCount.keySet() )
		{
			if ( mapCount.get( item ) == max )
			{
				int len = endIndex.get( item ) - startIndex.get( item ) + 1;
				result = Integer.min( result, len );
			}
		}

		return result;
	}

}
