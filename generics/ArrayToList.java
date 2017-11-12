package com.interview.generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList
{
	public static void main( String[] args )
	{
		List< ? extends Object> i = ArrayToList.toList( 1, 2, 3, 4, 5, "string" );
		for ( Object item : i )
			System.out.println( item );
	}

	public static <T> List<T> toList( T... arr )
	{
		List<T> temp = new ArrayList<T>( arr.length );

		for ( T obj : arr )
		{
			temp.add( obj );
		}
		return temp;
	}
}
