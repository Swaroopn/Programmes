package com.interview.algorithms;

public class InsertionSortDemo
{
	public static void main(String[] args)
	{
		int arr[] = {5,3,7,10, 2,1,6,9};
		insertionSort(arr);
	}

	public static void insertionSort( int[] arr )
	{
		for ( int i = 1; i < arr.length; i++)
		{
			int temp = arr[i];
			int j = i;
			while ( j > 0 && arr[j-1] > temp)
			{
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
		
		for ( int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
