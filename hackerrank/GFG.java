package com.interview.hackerrank;

import java.util.Arrays;
import java.util.Stack;

class GfG
{
	int minEle;
	Stack<Integer> s;

	/*returns min element from stack*/
	public int getMin()
	{
		Object[] temp = s.toArray();
		int[] a = new int[temp.length];
		for ( int i = 0; i < a.length; i++ )
			a[i] = ( int ) temp[i];

		Arrays.sort( a );

		return a[0];
	}

	/*returns poped element from stack*/
	int pop()
	{
		int item = s.peek();

		if ( !s.isEmpty() )
			s.pop();

		return item;
	}

	/*push element x into the stack*/
	void push( int x )
	{
		s.push( x );
	}
}