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

	private static LinkedListDemo sort( LinkedListDemo first, LinkedListDemo second )
	{
		if ( first == null )
			return second;

		if ( second == null )
			return first;

		Node cur = first.first;
		while ( cur.next != null )
			cur = cur.next;

		cur.next = second.first;

		return first;
	}
}
