package com.datastructures.linkedlist;

public class SingleLinkedList
{
	EmployeeNode head;

	private boolean isEmpty()
	{
		return head == null;
	}

	public void addToFront( Employee employee )
	{
		EmployeeNode node = new EmployeeNode( employee );
		node.setNext( head );
		head = node;
	}

	public void addToRear( Employee employee )
	{
		if ( isEmpty() )
			addToFront( employee );
		else
		{
			EmployeeNode node = new EmployeeNode( employee );
			EmployeeNode temp = head;
			while ( temp.getNext() != null )
				temp = temp.getNext();

			temp.setNext( node );
		}
	}

	public void insertInOrder( Employee employee )
	{
		if ( isEmpty() || head.getEmployee().getId() > employee.getId() )
		{
			addToFront( employee );
			return;
		}

		EmployeeNode curr = head;
		EmployeeNode prev = head;
		while ( curr != null && curr.getEmployee().getId() < employee.getId() )
		{
			prev = curr;
			curr = curr.getNext();
		}

		EmployeeNode newEmployee = new EmployeeNode( employee );
		prev.setNext( newEmployee );
		newEmployee.setNext( curr );
	}

	public Employee removeFromFront()
	{
		if ( isEmpty() )
			return null;

		EmployeeNode removedNode = head;
		head = head.getNext();

		removedNode.setNext( null );
		return removedNode.getEmployee();
	}

	public Employee removeFromRear()
	{
		if ( isEmpty() )
			return null;

		EmployeeNode prev = head;
		EmployeeNode curr = head;
		while ( curr.getNext() != null )
		{
			prev = curr;
			curr = curr.getNext();
		}

		prev.setNext( null );
		curr.setNext( null );

		return curr.getEmployee();
	}

	public Employee removeById( int id )
	{
		EmployeeNode temp = head;
		EmployeeNode prev = null;
		while ( temp != null && temp.getEmployee().getId() != id )
		{
			prev = temp;
			temp = temp.getNext();
		}

		if ( temp == null )
			return null;

		prev.setNext( temp.getNext() );

		temp.setNext( null );
		return temp.getEmployee();
	}

	public void printList()
	{
		System.out.println( "=======================" );
		EmployeeNode temp = head;
		while ( temp != null )
		{
			System.out.println( temp.getEmployee().toString() );
			temp = temp.getNext();
		}
		System.out.println( "=======================" );
	}

	public void reverse()
	{
		EmployeeNode curr = null;
		EmployeeNode temp;
		EmployeeNode first = head;
		while ( first != null )
		{
			temp = first;
			first = first.getNext();
			temp.setNext( curr );
			curr = temp;
		}

		System.out.println( "Reversed Linked List: " );
		while ( curr != null )
		{
			System.out.println( curr.getEmployee() );
			curr = curr.getNext();
		}
		System.out.println( "================" );
	}

	public Employee getMiddleNode()
	{
		EmployeeNode slow = head;
		EmployeeNode fast = head;

		while ( fast != null && fast.getNext() != null )
		{
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}

		return slow.getEmployee();
	}

	public boolean isCyclic()
	{
		EmployeeNode slow = head;
		EmployeeNode fast = head;
		boolean isCyclic = false;

		while ( fast != null && fast.getNext() != null )
		{
			slow = slow.getNext();
			fast = fast.getNext().getNext();

			if ( fast == slow )
			{
				isCyclic = true;
				break;
			}
		}

		if ( isCyclic )
		{
			int count = 0;
			while ( fast.getNext() != slow )
			{
				fast = fast.getNext();
				count++;
			}

			System.out.println( "Total no of Nodes in a loop: " + count );
		}

		return isCyclic;
	}

	public boolean isPalindrome()
	{
		StringBuilder firstHalf = new StringBuilder();
		StringBuilder secondHalf = new StringBuilder();

		EmployeeNode slow = head;
		EmployeeNode fast = head;

		while ( fast != null && fast.getNext() != null )
		{
			firstHalf.append( slow.getEmployee().getFirstName() );

			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}

		// handle for odd elements
		if ( fast != null )
			slow = slow.getNext();

		while ( slow != null )
		{
			secondHalf.append( slow.getEmployee().getFirstName() );
			slow = slow.getNext();
		}

		if ( firstHalf.toString().equalsIgnoreCase( secondHalf.reverse().toString() ) )
			return true;
		return false;
	}
}
