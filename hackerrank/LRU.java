package com.interview.hackerrank;

public class LRU
{
	public static int count = 0;
	public static int[][] multi = new int[5][2];

	public static void main( String[] args )
	{
		set( 1 );
		set( 2 );
		set( 5 );
		set( 7 );
		set( 3 );
		set( 2 );
		set( 2 );
		set( 3 );
		set( 4 );
		set( 5 );
		set( 7 );
		set( 1 );
	}

	public static int get( int item )
	{
		for ( int i = 0; i < multi.length; i++ )
			if ( multi[i][0] == item )
				return multi[1][0];
		
		return -1;
	}

	public static void set( int item )
	{
		int i = checkIfExists( item );
		if ( i != -1 )
		{
			int incr = multi[i][1];
			multi[i][1] = incr + 1;
		}
		else
		{
			if ( count == multi.length )
			{
				int index = getNotUsedItemIndex();
				if ( index != -1 )
				{
					multi[index][0] = item;
					multi[index][1] = 0;
				}
			}
			else
			{

				multi[count][0] = item;
				multi[count][1] = 0;
				count++;
			}
		}

	}

	public static int getNotUsedItemIndex()
	{
		int temp = 0;
		for ( int i = 1; i < multi.length; i++ )
		{
			if ( multi[i][1] < multi[temp][1] )
				temp = multi[i][0];
		}

		return temp;
	}

	public static int checkIfExists( int item )
	{
		for ( int i = 0; i < multi.length; i++ )
			if ( multi[i][0] == item )
				return i;

		return -1;
	}

}
