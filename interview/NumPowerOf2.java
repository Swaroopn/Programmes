package interview;

public class NumPowerOf2
{
	public static void main( String[] args )
	{
		int num = 16;

		if ( isPowerOf2( num ) )
			System.out.println( "Yes" );
		else
			System.out.println( "No" );
	}

	private static boolean isPowerOf2( int num )
	{
		return ( num > 0 ) && ( ( num & ( num - 1 ) ) == 0 );
	}
}
