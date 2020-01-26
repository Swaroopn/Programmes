package com.interview;

public class PermutationOfBInA
{
	public static void main( String[] args )
	{
		String a = "encyclopdia";
		String b = "dep";

		findPerm( a, b );
	}

	private static void findPerm( String a, String b )
	{
		boolean[] subStr = new boolean[26];
		for ( int i = 0; i < b.length(); i++ )
		{
			char ch = b.charAt( i );
			subStr[ch - 'a'] = true;
		}

		int count = 0;
		for ( int i = 0; i < a.length(); i++ )
		{
			boolean flag = true;
			for ( int j = i; j < i + b.length(); j++ )
			{
				char ch = a.charAt( j );
				if ( !subStr[ch - 'a'] )
				{
					flag = false;
					break;
				}
			}

			if ( flag )
				count++;
		}

		if ( count > 0 )
			System.out.println( "Success: " + count );

	}
}
