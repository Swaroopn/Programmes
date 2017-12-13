package interview;

public class Anagrams2
{

	public static void main( String[] args )
	{
		args = new String[]
		{ "swaroop", "pooraws", "swar", "abc", "cab" };
		Anagrams( args );
	}

	private static void Anagrams( String[] args )
	{
		for ( int i = 0; i < args.length - 1; i++ )
		{
			String firstSorted = StringHelper.getSortedString( args[i] );
			for ( int j = i + 1; j < args.length; j++ )
			{
				if ( firstSorted.equals( StringHelper.getSortedString( args[j] ) ) )
					System.out.println( args[i] + "->" + args[j] );
			}
		}
	}

}
