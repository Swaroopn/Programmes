package interview;

import java.util.HashSet;
import java.util.Set;

public class Permutation
{
	public static void main( String[] ars )
	{
		String str = "abcd";
		Set<String> out = generatePerm( str );
		System.out.println( out );
	}

	public static Set<String> generatePerm( String input )
	{
		Set<String> set = new HashSet<String>();

		if ( input == "" )
			return set;

		Character a = input.charAt( 0 );

		if ( input.length() > 1 )
		{
			System.out.println( "Generating perm for: " + input.substring( 1 ) );
			Set<String> permSet = generatePerm( input.substring( 1 ) );

			for ( String x : permSet )
			{
				for ( int i = 0; i <= x.length(); i++ )
				{
					set.add( x.substring( 0, i ) + a + x.substring( i ) );
				}
			}
		}
		else
		{
			set.add( a + "" );
		}
		
		System.out.println( "Total Perms: " + set.size() );
		return set;
	}
}
