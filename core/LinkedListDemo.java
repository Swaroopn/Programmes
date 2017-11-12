package com.interview.core;

import java.util.LinkedList;

public class LinkedListDemo
{
	Node head;

	LinkedListDemo()
	{
		this.head = null;
	}

	class Node
	{
		int data;
		Node next;

		Node( int data )
		{
			this.data = data;
			this.next = null;
		}
	}

	public void push( int newData )
	{
		Node newNode = new Node( newData );
		newNode.next = head;
		head = newNode;
	}

	public void display()
	{
		Node temp = head;
		while ( temp != null )
		{
			System.out.println( temp.data );
			temp = temp.next;
		}
	}

	public static void main( String[] args )
	{
		LinkedListDemo list = new LinkedListDemo();
		list.push( 10 );
		list.push( 20 );

		list.display();
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add( 10 );
		l.push( 20 );;
	}
}
