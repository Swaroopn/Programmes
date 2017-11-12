package com.interview.designPatterns;

public class AdapterPattern
{
	public static void main( String[] args )
	{
		MallardDuck d = new MallardDuck();
		d.fly();
		d.quack();

		WildTurkey t = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter( t );
		turkeyAdapter.fly();
		turkeyAdapter.quack();

	}
}
