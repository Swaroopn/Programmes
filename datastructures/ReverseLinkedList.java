package datastructures;

public class ReverseLinkedList
{

	public static void main( String[] args )
	{
		LinkedListDemo ll = new LinkedListDemo();
		ll.linkLast( 10 );
		ll.linkLast( 20 );
		ll.linkLast( 30 );
		ll.linkLast( 40 );
		ll.linkLast( 50 );

		ll.display();
		//ll.Reverse();
		//ll.display();

		ll.SwapNodes( ll.getNode( 20 ), ll.getNode( 40 ) );
		ll.display();
	}

}
