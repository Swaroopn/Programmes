package com.interview.designPatterns;

public class MallardDuck implements Duck
{

	@Override
	public void fly()
	{
		System.out.println( "Duck Fly" );
	}

	@Override
	public void quack()
	{
		System.out.println( "Duck Quack" );
	}

}
