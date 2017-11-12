package com.interview.datastructures;

import java.util.HashMap;
import java.util.Map;

public class CollDemo
{
	public CollDemo()
	{

	}

	public static void main( String[] args )
	{
		int[] arr = new int[10];
		System.out.println( arr.length );
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put( 1, "One" );
		map.put( 2, "Two" );

		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put( 3, "Three" );
		map2.put( 2, "Dup Two" );
map2.hashCode();
		System.out.println( map2.toString() );
	}
}
