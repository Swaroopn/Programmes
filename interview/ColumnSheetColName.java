package interview;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ColumnSheetColName
{

	public static void main( String[] args )
	{
		String input = JOptionPane.showInputDialog( "Enter any column number: " );
		Scanner scanner = new Scanner( input );
		int colNum = scanner.nextInt();

		System.out.println( "Excel Column Name  Given ColumNumber " + colNum + "  is   " + ExcelColumnName( colNum ) );
		scanner.close();
	}

	private static String ExcelColumnName( int colNum )
	{
		int Base = 26;
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String colName = "";

		while ( colNum > 0 )
		{
			int position = colNum % Base;
			colName = ( position == 0 ? 'Z' : alpha.charAt( position - 1 ) ) + colName;
			colNum = ( colNum - 1 ) / Base;
		}

		return colName;
	}

}
