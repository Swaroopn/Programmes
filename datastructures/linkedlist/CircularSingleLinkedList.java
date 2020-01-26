package com.datastructures.linkedlist;

public class CircularSingleLinkedList
{
	private Node head, tail;

	public void addToLast( int data )
	{
		Node node = new Node( data );
		if ( head == null )
			head = node;
		else
			tail.next = node;

		tail = node;
		tail.next = head;
	}

	public void printList()
	{
		Node temp = head;
		do
		{
			System.out.print( temp.data + " " );
			temp = temp.next;
		}
		while ( temp != head );

		System.out.println();
	}

}
