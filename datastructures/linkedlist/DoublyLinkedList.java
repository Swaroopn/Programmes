package com.datastructures.linkedlist;

class DoubleNode
{
	int data;
	DoubleNode next;
	DoubleNode prev;

	public DoubleNode( int data )
	{
		this.data = data;
	}
}

public class DoublyLinkedList
{
	DoubleNode head, tail;

	private boolean isEmpty()
	{
		return ( head == null && tail == null );
	}

	public void addToFront( int item )
	{
		DoubleNode node = new DoubleNode( item );

		if ( isEmpty() )
			tail = node;
		else
		{
			head.prev = node;
			node.next = head;
		}

		head = node;
	}

	public void addToRear( int item )
	{
		DoubleNode node = new DoubleNode( item );

		if ( isEmpty() )
			head = node;
		else
		{
			node.prev = tail;
			tail.next = node;
		}

		tail = node;
	}

	public void printList()
	{
		DoubleNode temp = head;
		System.out.println( "=======================" );
		while ( temp != null )
		{
			System.out.println( temp.data );
			temp = temp.next;
		}
		System.out.println( "=======================" );
	}

	/**
	 * list should be sorted
	 */
	public void findGivenSumPair( int count )
	{
		boolean foundPair = false;
		DoubleNode first = head;
		DoubleNode last = tail;

		while ( first != null && last != null && first != last && last.next != first )
		{
			int sum = first.data + last.data;
			if ( sum == count )
			{
				System.out.println( first.data + " + " + last.data + " = " + count );
				first = first.next;
				last = last.prev;
				foundPair = true;
			}
			else if ( sum < count )
				first = first.next;
			else
				last = last.prev;
		}

		if ( !foundPair )
			System.out.println( "No Pari found!!!" );
	}

	public void rotate( int count )
	{
		DoubleNode first = head;
		DoubleNode last = tail;
		while ( count > 0 )
		{
			last.next = first;
			first.prev = last;

			first.next.prev = null;
			head = first.next;
			first.next = null;

			last = first;
			first = head;

			count--;
		}

		System.out.println( "================" );
		DoubleNode temp = head;
		System.out.print( "HEAD <-> " );
		do
		{
			System.out.print( temp.data + " <-> " );
			temp = temp.next;
		}
		while ( temp != null );
		System.out.println( "NULL" );
		System.out.println( "================" );
	}
}
