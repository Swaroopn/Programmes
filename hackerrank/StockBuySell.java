package com.interview.hackerrank;

public class StockBuySell
{

	public static void main( String[] args )
	{
		int[] arr = new int[]
		{ 23, 13, 25, 29, 33, 19, 34, 45, 65, 67, 12,10,30 };

		calculate( arr, arr.length );
	}

	public static void calculate( int[] arr, int n )
	{
		int i = 0;
		while ( i < n )
		{
			while ( i < n-1 && arr[i + 1] <= arr[i] )
				i++;

			if ( i == n - 1 )
				break;

			int buy = i++;

			while ( i < n && arr[i] >= arr[i - 1] )
				i++;

			int sell = i - 1;

			System.out.println( "( " + arr[buy] + "," + arr[sell] + " )" );
		}
	}

}
