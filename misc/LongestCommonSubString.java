package com.interview;

import java.util.Scanner;

public class LongestCommonSubString
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int N = Integer.parseInt( sc.nextLine() );
		while ( N-- > 0 )
		{
			sc.nextLine();
			String word1 = sc.nextLine();
			String word2 = sc.nextLine();

			System.out.println( findLCS( word1, word2 ) );
		}
		sc.close();
	}

	private static int findLCS( String word1, String word2 )
	{
		char[] str1 = word1.toCharArray();
		char[] str2 = word2.toCharArray();

		int temp[][] = new int[str1.length + 1][str2.length + 1];
		int max = 0;

		for ( int i = 1; i < temp.length; i++ )
		{
			for ( int j = 1; j < temp[0].length; j++ )
			{
				if ( str1[i - 1] == str2[j - 1] )
				{
					temp[i][j] = temp[i - 1][j - 1] + 1;
				}
				else
				{
					temp[i][j] = Math.max( temp[i][j - 1], temp[i - 1][j] );
				}

				if ( temp[i][j] > max )
				{
					max = temp[i][j];
				}
			}
		}

		return max;
	}
}
