package com.interview;

import java.util.Scanner;

public class EquilibriumPoint
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner( System.in );
		int tc = Integer.parseInt( sc.nextLine() );
		for ( int i = 0; i < tc; i++ )
		{
			int totalNum = Integer.parseInt( sc.nextLine() );
			int[] arr = new int[totalNum];
			int sum = 0;
			for ( int k = 0; k < totalNum; k++ )
			{
				arr[k] = sc.nextInt();
				sum += arr[k];
			}
			System.out.println( findEquilibrium( arr, sum ) );
			sc.nextLine();

			/*if ( inputs.length == 1 )
				System.out.println( "1" );
			else
			{
				int sum = 0;
				int[] arr = new int[inputs.length];
				for ( int j = 0; j < inputs.length; j++ )
				{
					arr[j] = Integer.parseInt( inputs[j] );
					sum += arr[j];
				}
			
				System.out.println( findEquilibrium( arr, sum ) );
			}*/
		}

		sc.close();
	}

	private static int findEquilibrium( int[] arr, int sum )
	{
		int leftSum = 0;

		for ( int i = 0; i < arr.length; i++ )
		{
			sum -= arr[i];
			if ( sum == leftSum )
				return i + 1;

			leftSum += arr[i];
		}

		return -1;
	}
}
