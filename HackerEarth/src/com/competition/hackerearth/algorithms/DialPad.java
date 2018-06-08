package com.competition.hackerearth.algorithms;

import java.util.Scanner;

public class DialPad
{
	int[] intArr;

	public int[] getIntArr()
	{
		return intArr;
	}

	int len = 0;

	public DialPad( int[] intArr )
	{
		this.intArr = intArr;
		this.len = this.intArr.length;
	}

	public static void main( String[] args )
	{
		Scanner s = new Scanner( System.in );
		int totalNums = Integer.parseInt( s.nextLine() );

		int[] arr = new int[totalNums];

		for ( int i = 0; i < totalNums; i++ )
		{
			arr[i] = s.nextInt();
		}

		s.nextLine();

		int totalButtons = Integer.parseInt( s.nextLine() );
		int[] charsAllowed = new int[totalButtons];

		int totalCharsAllowed = 0;
		for ( int i = 0; i < totalButtons; i++ )
		{
			charsAllowed[i] = s.nextInt();
			totalCharsAllowed += charsAllowed[i];
		}

		if ( totalNums > totalCharsAllowed )
		{
			System.out.println( "-1" );
			s.close();
			return;
		}

		DialPad obj = new DialPad( arr );
		obj.selectionSort();

		int[] sortedArr = obj.getIntArr();
		int count = 0;
		int tobeSub = 0;
		int buttonIndex = 1;

		for ( int i = totalNums - 1; i >= 0; i-- )
		{
			int temp = charsAllowed[tobeSub];

			if ( temp == 0 )
			{
				tobeSub++;
				i++;
				continue;
			}

			charsAllowed[tobeSub]--;
			count = count + ( sortedArr[i] * buttonIndex );
			tobeSub++;
			if ( tobeSub == totalButtons )
			{
				tobeSub = 0;
				buttonIndex++;
			}
		}

		System.out.println( count );
		s.close();
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

	}

	private void swap( int i, int j )
	{
		int temp = this.intArr[i];
		this.intArr[i] = this.intArr[j];
		this.intArr[j] = temp;
	}
}
