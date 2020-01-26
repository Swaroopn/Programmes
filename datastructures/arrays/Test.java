package com.datastructures.arrays;

public class Test extends Thread
{
	public Test()
	{
		super();
		start();
	}

	public void run()
	{
		System.out.println( Thread.currentThread().getName() );
	}

	public static void main( String[] args )
	{
		new Test();
		System.out.println( Thread.currentThread().getName() );
	}

}