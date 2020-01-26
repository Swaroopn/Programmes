package com.datastructures.linkedlist;

public class DoubleLinkedList
{
	EmployeeDoubleNode head, tail;
	private int size;

	private boolean isEmpty()
	{
		return ( head == null && tail == null );
	}

	public void addToFront( Employee employee )
	{
		EmployeeDoubleNode node = new EmployeeDoubleNode( employee );

		if ( isEmpty() )
			tail = node;
		else
		{
			head.setPrev( node );
			node.setNext( head );
		}

		head = node;
		size++;
	}

	public void addToRear( Employee employee )
	{
		EmployeeDoubleNode node = new EmployeeDoubleNode( employee );

		if ( isEmpty() )
			head = node;
		else
		{
			node.setPrev( tail );
			tail.setNext( node );
		}

		tail = node;
		size++;
	}

	public void addBefore( Employee employee, Employee existingEmployee )
	{
		if ( isEmpty() )
		{
			System.out.println( "Employee not found: " + existingEmployee );
			return;
		}

		EmployeeDoubleNode current = head;
		while ( current != null && !current.getEmployee().getFirstName().equalsIgnoreCase( existingEmployee.getFirstName() ) )
		{
			current = current.getNext();
		}

		if ( current == null )
		{
			System.out.println( "Employee not found: " + existingEmployee );
			return;
		}

		EmployeeDoubleNode newNode = new EmployeeDoubleNode( employee );
		newNode.setPrev( current.getPrev() );
		newNode.setNext( current );
		current.setPrev( newNode );

		if ( head == current )
			head = newNode;
		else
			newNode.getPrev().setNext( newNode );

		size++;
	}

	public Employee removeFromFront()
	{
		if ( isEmpty() )
			return null;

		EmployeeDoubleNode removedNode = head;
		if ( head.getNext() == null )
		{
			tail = null;
		}
		else
		{
			head.getNext().setPrev( null );
		}

		head = head.getNext();
		size--;
		removedNode.setNext( null );
		return removedNode.getEmployee();
	}

	public Employee removeFromRear()
	{
		if ( isEmpty() )
			return null;

		EmployeeDoubleNode removedNode = tail;
		if ( tail.getPrev() == null )
			head = null;
		else
			tail.getPrev().setNext( null );

		tail = tail.getPrev();
		size--;
		removedNode.setNext( null );
		return removedNode.getEmployee();
	}

	public void reverse()
	{
		if ( isEmpty() )
			return;

		EmployeeDoubleNode first = head;
		EmployeeDoubleNode curr = null;
		EmployeeDoubleNode temp;
		do
		{
			temp = first;
			first = first.getNext();

			temp.setNext( curr );
			temp.setPrev( first );
			curr = temp;
		}
		while ( first != null );

		System.out.println( "=======================" );
		do
		{
			System.out.println( curr.getEmployee() );
			curr = curr.getNext();
		}
		while ( curr != null );
		System.out.println( "=======================" );
	}

	public int size()
	{
		return size;
	}

	public void printList()
	{
		EmployeeDoubleNode temp = head;
		System.out.println( "=======================" );
		while ( temp != null )
		{
			System.out.println( temp.getEmployee().toString() );
			temp = temp.getNext();
		}
		System.out.println( "=======================" );
	}

}
