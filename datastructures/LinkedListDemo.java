package com.interview.datastructures;

import java.util.LinkedList;

public class LinkedListDemo extends LinkedList<LinkedListDemo>
{
	private static final long serialVersionUID = 1L;

	int size = 0;
	Node first;
	Node last;

	public void linkFirst( int item )
	{
		Node f = first;
		Node temp = new Node( item, null, f );
		first = temp;
		if ( f == null )
			last = temp;
		else
			f.prev = temp;

		size++;
	}

	public void linkLast( int item )
	{
		Node l = last;
		Node temp = new Node( item, l, null );
		last = temp;
		if ( l == null )
			first = temp;
		else
			l.next = temp;

		size++;
	}

	public int getSize()
	{
		return size;
	}

	public void display()
	{
		if ( first != null )
		{
			Node temp = first;
			while ( temp != null )
			{
				System.out.print( temp.item + " " );
				temp = temp.next;
			}
			System.out.println();
		}
	}

	public void linkBefore( int item, Node node )
	{
		if ( node != null )
		{
			Node prev = node.prev;
			Node newNode = new Node( item, prev, node );
			node.prev = newNode;
			if ( prev == null )
				first = newNode;
			else
				prev.next = newNode;

			size++;
		}
	}

	public Node getNode( int item )
	{
		if ( first != null )
		{
			Node temp = first;
			while ( temp != null )
			{
				if ( temp.item == item )
					return temp;
				temp = temp.next;
			}
		}

		return null;
	}

	public int unlinkFirst()
	{
		if ( first != null )
		{
			Node temp = first;
			first = first.next;
			temp.next = null;
			temp.prev = null;

			if ( first == null )
				last = null;
			else
				first.prev = null;

			size--;
			return temp.item;
		}
		return -1;
	}

	public int unlinkLast()
	{
		if ( last != null )
		{
			Node temp = last;
			last = last.prev;
			temp.next = null;
			temp.prev = null;

			if ( last == null )
				first = null;
			else
				last.next = null;

			size--;
			return temp.item;
		}
		return -1;
	}

	public void unlink( Node temp )
	{
		Node prev = temp.prev;
		Node next = temp.next;
		temp.next = null;
		if ( prev == null )
			first = next;
		else
		{
			prev.next = next;
			temp.prev = null;
		}

		if ( next == null )
			last = prev;
		else
		{
			next.prev = prev;
			temp.next = null;
		}

		size--;
	}

	public void printFirst()
	{
		if ( first != null )
		{
			System.out.println( "First Node: " + first.item );
		}
		else
			System.out.println( "LinkedList is Empty!!!" );
	}

	public void Reverse()
	{
		if ( first != null )
		{
			Node temp, cur = null;
			while ( first != null )
			{
				temp = first;
				first = first.next;
				temp.next = cur;
				cur = temp;
			}
			first = cur;
		}
	}

	public void SwapNodes( Node x, Node y )
	{
		if ( x == y )
			return;
		Node prev = null, post = null;
		Node cur = first;
		while ( cur != null && cur.item != x.item )
		{
			prev = cur;
			cur = cur.next;
			post = cur.next;
		}

		Node prevY = null, postY = null;
		Node curY = first;

		while ( curY != null && curY.item != y.item )
		{
			prevY = curY;
			curY = curY.next;
			postY = curY.next;
		}

		if ( cur == null || curY == null )
			return;

		if ( prev != null )
		{
			prev.next = curY;
			curY.prev = cur;
			curY.next = post;
			post.prev = curY;
		}

		if ( prevY != null )
		{
			prevY.next = cur;
			cur.prev = prevY;
			cur.next = postY;
			postY.prev = cur;
		}
	}

	public void removeDuplicate()
	{
		if ( first != null )
		{
			Node temp = first;
			Node prev = temp;
			while ( temp != null && temp.next != null )
			{
				prev = temp.next;
				while ( prev != null )
				{
					if ( temp.item == prev.item )
					{
						Node cur = prev.prev;
						Node succ = prev.next;

						if ( cur != null )
							cur.next = succ;

						if ( succ != null )
							succ.prev = cur;

						prev.prev = null;
						prev.next = null;

						prev = cur;
					}
					prev = prev.next;
				}
				temp = temp.next;
			}
		}
	}

	public void pairwiseSwap()
	{
		if ( first != null )
		{
			Node prev = first;
			while ( prev != null && prev.next != null )
			{
				Node cur = prev.next;

				swap( prev, cur );
				prev = cur.next;
			}
		}
	}

	public void swap( Node prev, Node cur )
	{
		int temp = prev.item;
		prev.item = cur.item;
		cur.item = temp;
	}

	public static class Node
	{
		int item;
		Node prev;
		Node next;

		public Node( int item, Node prev, Node next )
		{
			this.item = item;
			this.prev = prev;
			this.next = next;
		}
	}

	public static void main( String[] args )
	{
		LinkedListDemo ll = new LinkedListDemo();
		ll.linkFirst( 10 );
		ll.linkFirst( 20 );
		ll.linkLast( 30 );
		ll.linkBefore( 15, ll.getNode( 20 ) );
		ll.linkBefore( 25, ll.getNode( 10 ) );

		ll.display();

		ll.unlinkFirst();

		ll.display();
		ll.unlinkLast();
		ll.display();

		ll.unlink( ll.getNode( 25 ) );
		ll.display();
		ll.printFirst();

		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add( 10 );
		l.add( 20 );
		l.push( 30 );
	}

	public void makesLastAsFirst()
	{
		if ( first != null )
		{
			Node temp = first;
			while ( temp.next != null )
			{
				temp = temp.next;
			}
			last = temp.prev;
			last.next = null;

			temp.next = first;
			first = temp;
		}

	}

	public void split()
	{
		Node slowPtr = first;
		Node fastPtr = first;

		if ( first == null )
			return;

		while ( fastPtr.next != null && fastPtr.next.next != null )
		{
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
		}

		if ( fastPtr.next.next == null )
			fastPtr = fastPtr.next;

		Node head1 = first;
		Node head2 = slowPtr.next;

		fastPtr.next = head2;
		slowPtr.next = head1;
		Node temp = head1;

		do
		{
			System.out.print( temp.item + " " );
			temp = temp.next;
		}
		while ( temp != head1 );
		System.out.println();
		temp = head2;
		do
		{
			System.out.print( temp.item + " " );
			temp = temp.next;
		}
		while ( temp != head2 );

	}

}
