package interview;

import java.util.Arrays;

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
			for ( int j = i + 1; j < args.length; j++ )
			{
				if ( isAnagram( args[i], args[j] ) )
					System.out.println( args[i] + "->" + args[j] );
			}
		}
	}

	private static boolean isAnagram( String str1, String str2 )
	{
		char[] c = str1.toCharArray();
		Arrays.sort( c );
		char[] c1 = str2.toCharArray();
		Arrays.sort( c1 );

		if ( Arrays.equals( c, c1 ) )
			return true;
		return false;
	}

}
