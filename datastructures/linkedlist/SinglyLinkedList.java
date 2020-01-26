package com.datastructures.linkedlist;

class Node
{
	int data;
	Node next;

	public Node( int data )
	{
		this.data = data;
	}
}

public class SinglyLinkedList
{
	Node head;

	public void addToFront( int item )
	{
		Node node = new Node( item );
		node.next = head;
		head = node;
	}

	private Node reverse( Node startNode )
	{
		Node curr = null;
		Node temp;
		Node first = startNode;
		while ( first != null )
		{
			temp = first;
			first = first.next;
			temp.next = curr;
			curr = temp;
		}

		return curr;
	}

	public void rearrange()
	{
		Node slow = head;
		Node fast = head;

		while ( fast != null && fast.next != null )
		{
			slow = slow.next;
			fast = fast.next.next;
		}

		Node firstHalf = head; // 1,2,3
		Node secondHalf = reverse( slow.next ); // 5,4

		while ( firstHalf != slow.next || secondHalf != null )
		{
			if ( firstHalf != null )
			{
				System.out.println( firstHalf.data );
				firstHalf = firstHalf.next;
			}

			if ( secondHalf != null )
			{
				System.out.println( secondHalf.data );
				secondHalf = secondHalf.next;
			}
		}
	}

	public int binaryToDecimal()
	{
		int decimal = 0;
		Node temp = head;
		while ( temp != null )
		{
			decimal = ( decimal << 1 ) + temp.data;
			temp = temp.next;
		}

		return decimal;
	}

}
