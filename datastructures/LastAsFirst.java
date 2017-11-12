package com.interview.datastructures;

public class LastAsFirst
{

	public static void main( String[] args )
	{
		LinkedListDemo list = new LinkedListDemo();
		list.linkLast( 10 );
		list.linkLast( 20 );
		list.linkLast( 30 );
		list.linkLast( 40 );
		list.linkLast( 50 );
		list.linkLast( 60 );
		
		list.display();
		list.makesLastAsFirst();
		list.display();
	}

}
