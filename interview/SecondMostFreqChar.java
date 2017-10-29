package interview;

public class SecondMostFreqChar
{
	private static final int BASE = 26;

	public static void main( String[] args )
	{
		String str = "geeksforgeeks";
		System.out.println( getSecondMostFrequentChar( str ) );
	}

	private static char getSecondMostFrequentChar( String str )
	{
		int[] arr = new int[BASE];
		for ( int i = 0; i < str.length(); i++ )
			arr[str.charAt( i ) - 'a']++;

		int first = 0, second = 0;
		for ( int i = 0; i < arr.length; i++ )
		{
			if ( arr[i] > arr[first] )
			{
				second = first;
				first = i;
			}
			else if ( arr[i] > arr[second] )
				second = i;
		}

		return ( char ) ( second + 'a' );
	}

}
