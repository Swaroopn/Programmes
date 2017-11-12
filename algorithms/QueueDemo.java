package com.interview.algorithms;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo
{
	public static void main( String[] args )
	{
		Queue<Integer> q = new PriorityQueue<Integer>();
		q.add( 1 );
		q.add( 2 );
		//System.out.println( q.remove() );
		//System.out.println( q.peek() );
		
		Integer a = new Integer(10);
		Integer b = new Integer(20);
		System.out.println(Integer.valueOf( a ) + a.intValue() );
		assert a.intValue() + b.intValue() == 100;
	}
}
