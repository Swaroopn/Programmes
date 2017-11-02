package interview;

public class LexicograhicallyMinString
{
	public static void main( String[] args )
	{
		String str = "GEEKSFORGEEKAS";
		System.out.println( getLexicographicalMinStr( str ) );
		str = "GFG";
		System.out.println( getLexicographicalMinStr( str ) );
	}

	public static String getLexicographicalMinStr( String str )
	{
		char[] chArray = str.toCharArray();
		int min = 0;
		for ( int i = 1; i < chArray.length; i++ )
		{
			if ( chArray[i] < chArray[min] )
				min = i;
		}

		return str.substring( min, str.length() ) + str.substring( 0, min );
	}
}
