package interview;

public class CustomParseInt
{

	public static void main( String[] args )
	{
		int value = convertStringToInt( "123" );
		System.out.println( value );
	}

	private static int convertStringToInt( String str )
	{
		int sum = 0;
		int len = str.length() - 1;

		for ( int i = 0; i < str.length(); i++ )
		{
			Character ch = str.charAt( i );
			sum += ( ( ch - '0' ) * Math.pow( 10, len ) );
			--len;
		}

		return sum;
	}

}
