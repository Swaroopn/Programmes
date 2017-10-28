package interview;

public class MinCost
{
	public static void main( String[] args )
	{
		int cost[][] =
		{
				{ 1, 2, 3 },
				{ 4, 10, 2 },
				{ 1, 5, 3 } };

		System.out.println( "Min cost to reach (2,2): " + minCost( cost, 2, 2 ) );
	}

	private static int minCost( int[][] cost, int m, int n )
	{
		int row, col;
		int tc[][] = new int[m + 1][n + 1];

		tc[0][0] = cost[0][0];

		/* init col values */
		for ( row = 1; row <= m; row++ )
			tc[row][0] = tc[row - 1][0] + cost[row][0];

		/* init row values */
		for ( col = 1; col <= n; col++ )
			tc[0][col] = tc[0][col - 1] + cost[0][col];

		/* find min cost */
		for ( row = 1; row <= m; row++ )
			for ( col = 1; col <= n; col++ )
				tc[row][col] = min( tc[row - 1][col - 1], tc[row][col - 1], tc[row - 1][col] ) + cost[row][col];

		return tc[m][n];
	}

	private static int min( int x, int y, int z )
	{
		if ( x < y )
			return ( x < z ) ? x : z;
		else
			return ( y < z ) ? y : z;
	}

}
