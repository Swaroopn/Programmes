package com.interview.datastructures;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallableDemo implements Callable
{

	@Override
	public Object call() throws Exception
	{
		Random generator = new Random();
		Integer randomNum = generator.nextInt( 5 );

		Thread.sleep( randomNum * 1000 );
		return randomNum;
	}

}
