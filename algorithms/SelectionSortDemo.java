package com.interview.algorithms;

/*
 * Swaroop Nagendra 
 * Analysis = n(n-1)/2 ~ n^2
 */

class SelectionSort
{
	private String[] items;

	SelectionSort( String[] items )
	{
		this.items = items;
	}

	public void sort()
	{
		int count = this.items.length;
		for ( int i = 0; i < count; i++ )
		{
			int min = i;
			for ( int j = i + 1; j < count; j++ )
			{
				if ( this.items[j].compareTo( this.items[min] ) < 0 )
					swap( this.items, min, j );
			}
		}
	}

	public void swap( String[] name, int i, int j )
	{
		String temp = name[i];
		name[i] = name[j];
		name[j] = temp;
	}

	public void display()
	{
		for ( int i = 0; i < this.items.length; i++ )
			System.out.println( this.items[i] );
	}

}

public class SelectionSortDemo
{
	public static void main( String[] args )
	{
		String[] name = new String[]
		{ "x", "a", "d", "b", "e", "c", "z" };
		SelectionSort obj = new SelectionSort( name );
		obj.sort();
		obj.display();
	}
}
