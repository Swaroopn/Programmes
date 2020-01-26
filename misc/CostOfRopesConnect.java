package com.interview;

import java.util.PriorityQueue;
import java.util.Scanner;

public class CostOfRopesConnect
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int input = Integer.parseInt( sc.nextLine() );
		for ( int i = 0; i < input; i++ )
		{
			sc.nextLine();
			String[] seq = sc.nextLine().split( " " );
			PriorityQueue<Integer> queue = new PriorityQueue<>( seq.length );
			for ( String str : seq )
				queue.add( Integer.parseInt( str ) );

			long sum = 0;
			while ( queue.size() > 1 )
			{
				int first = queue.poll();
				int second = queue.poll();
				sum += first + second;

				queue.add( first + second );
			}

			System.out.println( sum );
		}

		sc.close();
	}
}
