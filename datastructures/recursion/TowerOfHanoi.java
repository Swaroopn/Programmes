package com.datastructures.recursion;

public class TowerOfHanoi
{
	public static void main( String[] args )
	{
		int N = 3;
		moveDiscs( N, "A", "B", "C" );
	}

	private static void moveDiscs( int n, String src, String temp, String dest )
	{
		if ( n == 1 )
		{
			System.out.println( String.format( "move disk %d from %s to %s", n, src, dest ) );
			return;
		}

		moveDiscs( n - 1, src, dest, temp );
		System.out.println( String.format( "move disk %d from %s to %s", n, src, dest ) );
		moveDiscs( n - 1, temp, src, dest );
	}
}
