package com.interview.datastructures;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Customer
{
	private int id;
	private String name;

	public Customer( int id, String name )
	{
		this.id = id;
		this.name = name;
	}

	public int getId()
	{
		return this.id;
	}

	public String getName()
	{
		return this.name;
	}
}

public class QueueDemo
{
	public static void main( String[] args )
	{
		Queue<Integer> queue = new PriorityQueue<Integer>( 1 );
		queue.add( 10 );
		queue.add( 20 );
		queue.add( 40 );
		queue.add( 30 );
		queue.add( 5 );

		Queue<Customer> cust = new PriorityQueue<>( 7, idComparator );
	}

	public static Comparator<Customer> idComparator = new Comparator<Customer>()
	{

		@Override
		public int compare( Customer o1, Customer o2 )
		{
			return ( int ) o1.getId() - o2.getId();
		}

	};
}
