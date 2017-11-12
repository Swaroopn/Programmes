package com.interview.algorithms;

public class ComparableDemo implements Comparable<Integer>
{

	@Override
	public int compareTo( Integer o )
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main( String[] args )
	{
		ComparableDemo cmp = new ComparableDemo();
		Integer i1 = 10;
		Integer i2 = 20;
		i1.compareTo( i2 );
	}

}
