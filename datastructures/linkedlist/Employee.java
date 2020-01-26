package com.datastructures.linkedlist;

public class Employee
{
	private int id;
	private String firstName;
	private String secondName;

	public Employee( int id, String firstName, String secondName )
	{
		super();
		this.id = id;
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public int getId()
	{
		return id;
	}

	public void setId( int id )
	{
		this.id = id;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public void setFirstName( String firstName )
	{
		this.firstName = firstName;
	}

	public String getSecondName()
	{
		return secondName;
	}

	public void setSecondName( String secondName )
	{
		this.secondName = secondName;
	}

	@Override
	public String toString()
	{
		return "Employee [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + "]";
	}

}
