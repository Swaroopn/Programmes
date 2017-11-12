package com.interview.hackerrank;

public class ConsecutiveSum
{
	public static void main( String[] args )
	{
		findConsecutive( 1000 );
	}

	public static void findConsecutive( long N )
	{
		// Note that we don't ever have to sum
		// numbers > ceil(N/2)
		long start = 1, end = ( N + 1 ) / 2;

		// Repeat the loop from bottom to half
		while ( start < end )
		{
			// Check if there exist any sequence
			// from bottom to half which adds up to N
			long sum = 0;
			for ( long i = start; i <= end; i++ )
			{
				sum = sum + i;

				// If sum = N, this means consecutive
				// sequence exists
				if ( sum == N )
				{
					// found consecutive numbers! print them
					for ( long j = start; j <= i; j++ )
						System.out.print( j + " " );

					System.out.println();
					break;
				}

				// if sum increases N then it can not exist
				// in the consecutive sequence starting from
				// bottom
				if ( sum > N )
					break;
			}
			sum = 0;
			start++;
		}
	}
}
