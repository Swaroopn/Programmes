package com.competition.hackerearth.algorithms;

public class SortingDemo
{
	public static void main( String[] args )
	{
		int[] intArr = new int[]
		{ 5, 4, 2, 3, 1, 10 };

		AlgorithmHelper helper = new AlgorithmHelper( intArr );

		helper.bubbleSort();
		helper.selectionSort();
	}

}
