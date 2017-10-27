package com.subex.rocps.web.app;

public class DuplicateLinkedList
{
	Node first;
	Node last;
	int size;

	public void add( int item )
	{
		Node l = last;
		Node temp = new Node( item, null );
		last = temp;
		if ( l == null )
			first = temp;
		else
			l.next = temp;

		size++;

	}

	public void display()
	{
		Node temp = first;
		while ( temp != null )
		{
			System.out.print( temp.item + " " );
			temp = temp.next;
		}
		
		System.out.println();
	}

	public void removeDup()
	{
		Node cur = first;
		Node next = null;

		while ( cur.next != null )
		{
			if ( cur.item == cur.next.item )
			{
				next = cur.next.next;
				cur.next = null;
				cur.next = next;
			}
			else
				cur = cur.next;
		}
	}

	public static class Node
	{
		int item;
		Node next;

		public Node( int item, Node next )
		{
			this.item = item;
			this.next = next;
		}
	}

	public static void main( String[] args )
	{
		DuplicateLinkedList list = new DuplicateLinkedList();
		list.add( 10 );
		list.add( 10 );
		list.add( 20 );
		list.add( 30 );
		list.add( 30 );
		list.add( 30 );
		list.add( 40 );
		list.add( 50 );

		list.display();
		list.removeDup();
		list.display();
	}

}
