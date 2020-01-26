package com.interview;

public class CountKinRange
{
	public static void main( String[] args )
	{
		int range = 100;
		System.out.println( numberOfKsBetween0AndN( range, 2 ) );
	}

	private static int numberOfKsBetween0AndN( int n, int k )
	{
		long originalNumber = n;
		int power = 1;
		int i = 0;
		long rem = 0;
		int counter = 0;

		while ( n > 0 )
		{
			rem = n % 10;
			n /= 10;

			counter += rem * ( power * i ) / 10;

			if ( rem > k )
				counter += power;
			else if ( rem == k )
				counter += originalNumber % power + 1;

			power *= 10;
			i++;
		}

		return counter;
	}

}
