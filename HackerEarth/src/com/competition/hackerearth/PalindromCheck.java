package com.competition.hackerearth;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PalindromCheck
{
	private static Set<String> palinList = new HashSet<>();

	public static void main( String[] args )
	{
		Scanner s = new Scanner( System.in );
		String str = s.nextLine();
		int n = str.length();
		PalindromCheck permutation = new PalindromCheck();
		permutation.permute( str, 0, n - 1 );

		Iterator<String> pal = palinList.iterator();
		String finalStr = pal.hasNext() ? pal.next() : "-1";
		while ( pal.hasNext() )
		{
			String temp = pal.next();
			if ( temp.compareTo( finalStr ) < 0 )
				finalStr = temp;
		}

		System.out.println( finalStr );
		s.close();
	}

	private void permute( String str, int l, int r )
	{
		if ( l == r )
			checkIfPalindromd( str );
		else
		{
			for ( int i = l; i <= r; i++ )
			{
				str = swap( str, l, i );
				try
				{
					permute( str, l + 1, r );
				}
				catch ( Exception e )
				{
					e.printStackTrace();
				}
				str = swap( str, l, i );
			}
		}
	}

	private void checkIfPalindromd( String str )
	{
		char[] ch = str.toCharArray();

		int i = 0;
		int j = str.length() - 1;
		while ( i < j )
		{
			if ( ch[i] == ch[j] )
			{
				i++;
				j--;
			}
			else
			{
				return;
			}
		}

		palinList.add( str );
	}

	public String swap( String a, int i, int j )
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf( charArray );
	}
}
