package datastructures;

public class DuplicateItemLinkedList
{
	public static void main( String[] args )
	{
		LinkedListDemo list = new LinkedListDemo();
		list.linkLast( 10 );
		list.linkLast( 20 );
		list.linkLast( 30 );
		list.linkLast( 10 );
		list.linkLast( 10 );
		list.linkLast( 50 );

		list.display();
		list.removeDuplicate();
		list.display();
	}

}
