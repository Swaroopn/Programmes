package com.datastructures.linkedlist;

public class EmployeeNode
{
	Employee employee;
	EmployeeNode next;

	public EmployeeNode( Employee employee )
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

	public EmployeeNode getNext()
	{
		return next;
	}

	public void setNext( EmployeeNode next )
	{
		this.next = next;
	}

}
