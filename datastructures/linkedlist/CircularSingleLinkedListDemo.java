package com.datastructures.linkedlist;

public class CircularSingleLinkedListDemo
{
	public static void main( String[] args )
	{
		CircularSingleLinkedList list = new CircularSingleLinkedList();
		list.addToLast( 5 );
		list.addToLast( 4 );
		list.addToLast( 3 );
		list.addToLast( 2 );
		list.addToLast( 1 );

		list.printList();
	}
}
