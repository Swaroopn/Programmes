package com.interview.hackerrank;

import java.util.Arrays;
import java.util.List;

public class SentenceQueries
{
	public static void main( String[] args )
	{
		String[] sentences = new String[]
		{ "jim mary tom", "jim likes", "jim likes tom" };
		String[] queries = new String[]
		{ "jim tom", "likes", "ff", "mary", "tom" };

		for ( int i = 0; i < queries.length; i++ )
		{
			String[] senSplit = queries[i].split( " " );
			List<String> temp = Arrays.asList( senSplit );
			boolean isPresent = false;
			for ( int j = 0; j < sentences.length; j++ )
			{

				String[] queSplit = sentences[j].split( " " );
				List<String> subL = Arrays.asList( queSplit );

				if ( subL.containsAll( temp ) )
				{
					isPresent = true;
					System.out.print( j + " " );
				}
			}
			if ( !isPresent )
				System.out.print( "-1 " );

			System.out.println();

			isPresent = false;
		}
	}
}
