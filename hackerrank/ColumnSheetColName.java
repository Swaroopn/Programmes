package com.interview.hackerrank;

import java.util.Scanner;

public class ColumnSheetColName
{

	public static void main( String[] args )
	{
		//String input = JOptionPane.showInputDialog( "Enter any column number: " ); // Di
		Scanner scanner = new Scanner( System.in );
		int colNum = scanner.nextInt();

		System.out.println( "Excel Column Name  Given ColumNumber " + colNum + "  is   " + ExcelColumnName( colNum ) );
		scanner.close();
	}

	private static String ExcelColumnName( int colNum )
	{
		int Base = 26;
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String colName = "";

		while ( colNum > 0 )
		{
			int position = colNum % Base;
			colName = ( position == 0 ? 'Z' : chars.charAt( position - 1 ) ) + colName;
			colNum = ( colNum - 1 ) / Base;
		}
		
		return colName;
	}

}
