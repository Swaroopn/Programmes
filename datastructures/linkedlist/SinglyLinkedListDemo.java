package com.datastructures.linkedlist;

public class SinglyLinkedListDemo
{
	public static void main( String[] args )
	{
		SinglyLinkedList list = new SinglyLinkedList();
		list.addToFront( 4 );
		list.addToFront( 3 );
		list.addToFront( 2 );
		list.addToFront( 1 );

		list.rearrange();

		list = new SinglyLinkedList();
		list.addToFront( 1 );
		list.addToFront( 0 );
		list.addToFront( 1 );
		list.addToFront( 1 );

		System.out.println( list.binaryToDecimal() );
	}
}
