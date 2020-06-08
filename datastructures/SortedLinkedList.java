package datastructures;

import datastructures.LinkedListDemo.Node;

public class SortedLinkedList
{
	public static void main( String[] args )
	{
		LinkedListDemo first = new LinkedListDemo();
		first.linkLast( 10 );
		first.linkLast( 20 );
		first.linkLast( 30 );

		LinkedListDemo second = new LinkedListDemo();
		second.linkLast( 40 );
		second.linkLast( 50 );
		second.linkLast( 60 );

		LinkedListDemo list = sort( first, second );
		list.display();
	}

	private static LinkedListDemo sort( LinkedListDemo list1, LinkedListDemo list2 )
	{
		if ( list1 == null )
			return list2;

		if ( list2 == null )
			return list1;

		Node cur = list1.first;
		while ( cur.next != null )
			cur = cur.next;

		cur.next = list2.first;

		return list1;
	}
}
