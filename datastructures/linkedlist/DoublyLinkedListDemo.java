package com.datastructures.linkedlist;

public class DoublyLinkedListDemo
{
	public static void main( String[] args )
	{
		DoublyLinkedList list = new DoublyLinkedList();
		list.addToFront( 3 );
		list.addToRear( 4 );
		list.addToFront( 2 );
		list.addToFront( 1 );
		list.addToRear( 5 );

		list.printList();
		list.findGivenSumPair( 8 );
		list.findGivenSumPair( 7 );
		list.rotate( 4 );
	}
}
