package interview;

public class LinkedListPalindrome
{
	Node first;
	int size;

	public void add( int item )
	{
		final Node f = first;
		final Node newNode = new Node( item, null, f );
		first = newNode;

		if ( f != null )
			f.prev = newNode;
		size++;
	}

	public boolean isPalindrome()
	{
		if ( first != null )
		{
			Node temp = first;
			Node f = first;

			while ( temp.next != null )
			{
				temp = temp.next;
			}

			for ( int i = 0; i < size / 2; i++ )
			{
				if ( f.item == temp.item )
				{
					f = f.next;
					temp = temp.prev;
				}
				else
					return false;
			}
		}

		return true;
	}

	public static class Node
	{
		int item;
		Node next;
		Node prev;

		public Node( int item, Node prev, Node next )
		{
			this.item = item;
			this.prev = prev;
			this.next = next;
		}
	}

	public static void main( String[] args )
	{
		LinkedListPalindrome list = new LinkedListPalindrome();
		list.add( 10 );
		list.add( 20 );
		list.add( 30 );
		list.add( 40 );
		list.add( 50 );
		list.add( 30 );
		list.add( 20 );
		list.add( 10 );

		System.out.println( list.isPalindrome() );
	}

}
