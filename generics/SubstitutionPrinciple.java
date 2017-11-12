package com.interview.generics;

import java.util.ArrayList;
import java.util.List;

public class SubstitutionPrinciple
{
	public static void main( String[] args )
	{
		List<Integer> num = new ArrayList<Integer>();
		num.add( 1 );
		num.add( 2 );

		List<? extends Number> li = num;
		List<Integer> num1 = new ArrayList<Integer>();
		num1.add( 3 );
	}
}
