package com.interview.datastructures;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo
{
	public static void main( String[] args ) throws InterruptedException
	{
		Semaphore sem = new Semaphore( 2 );
		MyThread t1 = new MyThread( sem, "A" );
		MyThread t2 = new MyThread( sem, "B" );

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println( "Count: " + Shared.count );
	}
}
