package com.interview.designPatterns;

public class TurkeyAdapter implements Duck
{
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey)
	{
		this.turkey = turkey;
	}

	@Override
	public void fly()
	{
		System.out.print( "Pseudo Duck fly" );
		turkey.fly();
	}

	@Override
	public void quack()
	{
		System.out.print( "Pseudo Duck quack" );
		turkey.gobble();
	}

}
