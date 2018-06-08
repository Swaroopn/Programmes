package com.competition.hackerearth.algorithms;

public class AlgorithmHelper
{
	int[] intArr;
	int len = -1;

	public AlgorithmHelper( int[] intArr )
	{
		this.intArr = intArr;
		this.len = this.intArr.length;
	}

	public void bubbleSort()
	{
		for ( int i = 0; i < this.len; i++ )
		{
			for ( int j = 0; j < this.len - i - 1; j++ )
			{
				if ( intArr[j] > intArr[j + 1] )
				{
					swap( j, j + 1 );
				}
			}
		}

		display();
	}

	public void selectionSort()
	{
		int min;

		for ( int i = 0; i < this.len - 1; i++ )
		{
			min = i;

			for ( int j = i + 1; j < this.len; j++ )
			{
				if ( this.intArr[j] < this.intArr[min] )
					min = j;
			}

			swap( min, i );
		}

		display();
	}

	private void swap( int i, int j )
	{
		int temp = this.intArr[i];
		this.intArr[i] = this.intArr[j];
		this.intArr[j] = temp;
	}

	public void display()
	{
		for ( int i = 0; i < this.len; i++ )
			System.out.print( this.intArr[i] + " " );

		System.out.println();
	}

	public int[] getIntArr()
	{
		return intArr;
	}
}
