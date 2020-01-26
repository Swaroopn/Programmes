package com.datastructures.linkedlist;

public class EmployeeDoubleNode
{
	Employee employee;
	EmployeeDoubleNode next;
	EmployeeDoubleNode prev;

	public EmployeeDoubleNode( Employee employee )
	{
		super();
		this.employee = employee;
	}

	public Employee getEmployee()
	{
		return employee;
	}

	public void setEmployee( Employee employee )
	{
		this.employee = employee;
	}

	public EmployeeDoubleNode getNext()
	{
		return next;
	}

	public void setNext( EmployeeDoubleNode next )
	{
		this.next = next;
	}

	public EmployeeDoubleNode getPrev()
	{
		return prev;
	}

	public void setPrev( EmployeeDoubleNode prev )
	{
		this.prev = prev;
	}

	@Override
	public String toString()
	{
		return "EmployeeDoubleNode [employee=" + employee + ", next=" + next + ", prev=" + prev + "]";
	}

}
