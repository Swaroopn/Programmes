package com.datastructures.linkedlist;

public class Main
{
	public static void main( String[] args )
	{
		Employee dylan = new Employee( 1, "M", "Dylan" );
		Employee lennon = new Employee( 2, "A", "Lennon" );
		Employee harrison = new Employee( 3, "D", "Harrison" );
		Employee eric = new Employee( 4, "A", "Clapton" );
		Employee starr = new Employee( 5, "M", "Starr" );

		SingleLinkedList list = new SingleLinkedList();

		/*list.addToFront( lennon );
		list.addToFront( dylan );
		list.addToRear( harrison );
		list.addToRear( eric );
		
		list.printList();
		
		list.removeFromFront();
		list.removeFromRear();
		
		list.printList();*/

		/*list.insertInOrder( starr );
		list.insertInOrder( lennon );
		list.insertInOrder( eric );
		list.insertInOrder( harrison );
		list.insertInOrder( dylan );
		list.printList();*/
		// list.reverse();

		// System.out.println( list.removeById( 4 ) );
		// list.printList();

		/*System.out.println( list.getMiddleNode() );
		System.out.println( "Is Cyclic: " + list.isCyclic() );
		System.out.println( "Is Palindrom: " + list.isPalindrome() );*/

		DoubleLinkedList dlist = new DoubleLinkedList();
		dlist.addToFront( lennon );
		dlist.addBefore( dylan, lennon );
		dlist.addToRear( harrison );
		dlist.addToRear( eric );
		dlist.addToRear( starr );
		dlist.printList();
		dlist.reverse();

		// dlist.printList();

	}
}